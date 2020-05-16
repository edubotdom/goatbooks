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

import aiss.model.here.Result;
import aiss.model.resource.HereResource;

public class HereLibrariesController extends HttpServlet{

	private static final long serialVersionUID = 3793816067386292363L;
	private static final Logger log = Logger.getLogger(HereLibrariesController.class.getName());
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String lat = req.getParameter("lat");
		String lng = req.getParameter("lng");
		String r = req.getParameter("r");
		RequestDispatcher rd = null;
        List<Result> search = null;
        
        log.log(Level.INFO, "Searching libraries in a radius " + r + " around " + lat + "," + lng);
        
        if (lat != null && !"".equals(lat)||lng != null && !"".equals(lng)||r != null && !"".equals(r)) {
        	HereResource hResource = new HereResource();
        	search = hResource.getListBiblioteca(lat, lng, r);
        	if(search != null) {
        		log.fine("Search done.");
                req.setAttribute("libraries", search);
                rd = req.getRequestDispatcher("/nearLibrariesResult.jsp");
        	} else {
        		log.log(Level.SEVERE, "Search did result nothing");
        		rd = req.getRequestDispatcher("/error.jsp");
        	}
        	
        } else {
        	req.setAttribute("message", "You must provide valid information for the library search.");
            rd = req.getRequestDispatcher("/error.jsp");
            log.warning("Null search parameters processed.");
        }
        rd.forward(req, resp);
	}
	
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    	log.fine("Accessing through Post.");
    	doGet(req, resp);
    }
}
