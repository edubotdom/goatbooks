package aiss.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resource.GoogleBooksResource;

public class GoogleBooksLibDeleteController extends HttpServlet {


	private static final long serialVersionUID = -4565156222574677106L;

	private static final Logger log = Logger.getLogger(GoogleBooksResource.class.getName());


	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doPost(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String accessToken = (String) req.getSession().getAttribute("GoogleBooks-token");
        String book = req.getParameter("idLibro");
        String shelf = req.getParameter("idLibreria");
        if (accessToken != null && !"".equals(accessToken)) {
            	GoogleBooksResource gbResource = new GoogleBooksResource(accessToken);
            	try {
            		gbResource.deleteLibro(book, shelf);
            	}catch (Exception e){
            		log.info(
    						"The delete you tried fails... probably your token has experied. Redirecting to OAuth servlet.");
    				req.getRequestDispatcher("/AuthController/GoogleBooks").forward(req, resp);
            	}
            	req.setAttribute("idLibreria", shelf);
                req.getRequestDispatcher("/GoogleBooksLibListController").forward(req, resp);
        } else {
            log.info("Trying to access Google Books account without an access token, redirecting to OAuth servlet");
            req.getRequestDispatcher("/AuthController/GoogleBooks").forward(req, resp);
        }
    }
}
