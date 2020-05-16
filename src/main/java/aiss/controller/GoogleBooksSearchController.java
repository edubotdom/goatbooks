package aiss.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.GoogleBooks.Item;
import aiss.model.resource.GoogleBooksResource;

public class GoogleBooksSearchController extends HttpServlet{


	private static final long serialVersionUID = -62938958053269016L;
	private static final Logger log = Logger.getLogger(GoogleBooksSearchController.class.getName());


	public GoogleBooksSearchController() {
		super();
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
        String title = req.getParameter("title");
        RequestDispatcher rd = null;
        List<Item> search = null;
        
        log.log(Level.INFO, "Searching books that contains " + title);
 
            if (title != null && !"".equals(title)) {
                GoogleBooksResource bmResource = new GoogleBooksResource();
                String title2 = URLEncoder.encode(title, "UTF-8");
                search = bmResource.searchBook(title2);
                
	                	if(search != null) {
	                		log.fine("Search done.");
	                        req.setAttribute("search", search);
	                        rd = req.getRequestDispatcher("/searchResults.jsp");
	                	} else {
	                		log.log(Level.SEVERE, "Search: " + search);
	                		rd = req.getRequestDispatcher("/error.jsp");
	                	}
            } else {
                req.setAttribute("message", "You must provide a valid title for the book search.");
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
