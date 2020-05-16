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

import aiss.model.pixabay.Hit;
import aiss.model.resource.PixabayResource;

public class PixabayPhotoController extends HttpServlet {

	private static final long serialVersionUID = 8748657374937120199L;
	private static final Logger log = Logger.getLogger(PixabayPhotoController.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String query = req.getParameter("query");
		RequestDispatcher rd = null;
		List<Hit> resultados = null;
		
		log.log(Level.INFO, "Searching images that contains " + query);
		if (query != null && !"".equals(query)) {
			PixabayResource pr = new PixabayResource();
			resultados = pr.getResultsList(query);
			if(resultados != null) {
        		log.fine("Search throws results.");
                req.setAttribute("photo", resultados);
                rd = req.getRequestDispatcher("/photoResult.jsp");
        	} else {
        		log.log(Level.SEVERE, "Search did throw nothing: " + resultados);
        		rd = req.getRequestDispatcher("/error.jsp");
        	}
		} else {
        		log.log(Level.SEVERE, "Ha habido algún problema en el formulario, o el parámetro es nulo.");
        		rd = req.getRequestDispatcher("/error.jsp");
        	
		}
		rd.forward(req, resp);
}
	
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    	log.fine("Accessing through Post.");
    	doGet(req, resp);
    }
}