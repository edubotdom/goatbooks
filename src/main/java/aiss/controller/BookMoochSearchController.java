package aiss.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.BookMooch.BookSearch;
import aiss.model.resource.BookMoochResource;


public class BookMoochSearchController extends HttpServlet{
	
	private static final Logger log = Logger.getLogger(BookMoochResource.class.getName());

	private static final long serialVersionUID = 1L;

	public BookMoochSearchController() {
		super();
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
        String title = req.getParameter("title");
        RequestDispatcher rd = null;
        Collection<BookSearch> search = new ArrayList<>();
        
        log.log(Level.FINE, "Searching books that contains " + title);
 
            if (title != null && !"".equals(title)) {
                BookMoochResource bmResource = new BookMoochResource();
                String title2 = URLEncoder.encode(title, "UTF-8");
                search = bmResource.searchBook(title2);
                
                	if(search != null) {
                		log.fine("Search done.");
                		List<Object> resultados =search.stream().collect(Collectors.toList());
                		List<BookSearch> resultados2 = new ArrayList<>();
                		Integer tam = resultados.size();
                		Integer i = 0;
                		while(i<tam) {
                			BookSearch bs;
                			bs = (BookSearch) resultados.get(i);
                			resultados2.add(bs);
                			i++;
                		}
                        req.setAttribute("search", resultados);
                        req.setAttribute("searchResults", resultados2);
                        //req.getRequestDispatcher("/searchResults.jsp").forward(req, resp);
                	} else {
                		log.log(Level.SEVERE, "Search: " + search);
                		rd = req.getRequestDispatcher("/error.jsp");
                	}
            } else {
                req.setAttribute("message", "You must provide a valid title for the book search.");
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
