package aiss.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resource.WikipediaResource;
import aiss.model.wikipedia.Search;

public class WikipediaAuthorInformationController extends HttpServlet{

	private static final long serialVersionUID = 3254801453798037184L;
	private static final Logger log = Logger.getLogger(WikipediaAuthorInformationController.class.getName());

	public WikipediaAuthorInformationController() {
		super();
	}
	
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
        String author = req.getParameter("author");
        RequestDispatcher rd = null;
        List<Search> search = null;
        
        log.log(Level.INFO, "Searching information that contains " + author);
 
            if (author != null && !"".equals(author)) {
                WikipediaResource wikiResource = new WikipediaResource();
                search = wikiResource.getListInformation(author);
                
	                	if(search != null) {
	                		log.fine("Search throws results.");
	                        req.setAttribute("information", search);
	                        rd = req.getRequestDispatcher("/authorInformation.jsp");
	                	} else {
	                		log.log(Level.SEVERE, "Search: " + search);
	                		rd = req.getRequestDispatcher("/error.jsp");
	                	}
            } else {
                req.setAttribute("message", "You must provide a valid name of the author.");
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
