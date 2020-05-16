package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.GoogleBooks.BookInfo;
import aiss.model.resource.GoogleBooksResource;

public class GoogleBooksInfoController extends HttpServlet {

	private static final long serialVersionUID = 8685858020293951171L;
	private static final Logger log = Logger.getLogger(GoogleBooksSearchController.class.getName());
	
	public GoogleBooksInfoController() {
		super();
	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
        String idLibro = req.getParameter("idLibro");
        RequestDispatcher rd = null;
        BookInfo bi = null;
        
        log.log(Level.WARNING, "Searching book information about the book with id: " + idLibro);
 
            if (idLibro != null && !"".equals(idLibro)) {
                GoogleBooksResource bmResource = new GoogleBooksResource();
                bi = bmResource.getInfoFromID(idLibro);
                
                	if(bi != null) {
                		log.fine("Book information found.");
                        req.setAttribute("bookInfo", bi);
                        rd = req.getRequestDispatcher("/bookInfo.jsp");
                	} else {
                		log.log(Level.SEVERE, "El ID a continuación no contiene información: " + idLibro);
                		rd = req.getRequestDispatcher("/error.jsp");
                	}
            } else {
                req.setAttribute("message", "You must provide a valid ID for the book.");
                rd = req.getRequestDispatcher("/error.jsp");
                log.warning("Search did throw nothing.");
            }
            rd.forward(req, resp);
	}

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    	log.fine("Accessing through Post.");
    	doGet(req, resp);
    }
	
}
