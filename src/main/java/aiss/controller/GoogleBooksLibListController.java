package aiss.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.GoogleBooks.Volume;
import aiss.model.resource.GoogleBooksResource;
//PARA LISTAR LOS LIBROS CONTENIDOS EN UNA LIBRERÍA
public class GoogleBooksLibListController extends HttpServlet{

	private static final long serialVersionUID = 1779621653051492862L;
	private static final Logger log = Logger.getLogger(GoogleBooksLibListController.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String accessToken = (String) req.getSession().getAttribute("GoogleBooks-token");

		if (accessToken != null && !"".equals(accessToken)) {

			GoogleBooksResource gdResource = new GoogleBooksResource(accessToken);
			String id = req.getParameter("idLibreria");
			List<Volume> books = gdResource.getListBooksOfShelf(id);

			if (books != null) {
				req.setAttribute("books", books);
				req.getRequestDispatcher("/BookFromAShelfResult.jsp").forward(req, resp);
			} else {
				log.info(
						"The book list returned is null... probably your token has experied. Redirecting to OAuth servlet.");
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
