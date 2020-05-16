package aiss.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.GoogleBooks.BookShelf;
import aiss.model.GoogleBooks.Volume;
import aiss.model.resource.GoogleBooksResource;
//PARA LISTAR LIBRERÍAS
public class GoogleBooksShelvesListController extends HttpServlet{

	private static final long serialVersionUID = 3489849048659377135L;
	private static final Logger log = Logger.getLogger(GoogleBooksShelvesListController.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String accessToken = (String) req.getSession().getAttribute("GoogleBooks-token");
		log.info(accessToken);

		if (accessToken != null && !"".equals(accessToken)) {

			GoogleBooksResource gdResource = new GoogleBooksResource(accessToken);
			List<BookShelf> bookshelves = gdResource.getListBookshelves();

			if (bookshelves != null) {
				req.setAttribute("bookshelves", bookshelves);
				//req.setAttribute("libros", );
				req.getRequestDispatcher("/BookShelvesListing.jsp").forward(req, resp);
			} else {
				log.info(
						"The bookshelves returned are null... probably your token has experied. Redirecting to OAuth servlet.");
				req.getRequestDispatcher("/AuthController/GoogleBooks").forward(req, resp);
			}
		} else {
			log.info("Trying to access Google Books without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/GoogleBooks").forward(req, resp);
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doGet(req, resp);
	}
}
