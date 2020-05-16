package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.openLibrary.Result;
import aiss.model.resource.OpenLibraryResource;
import sun.rmi.runtime.Log;

public class OpenLibraryInfoController extends HttpServlet {
	
	private static final long serialVersionUID = -1680593532841208305L;
	private static final Logger log = Logger.getLogger(OpenLibraryInfoController.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String isbn = req.getParameter("isbn");
        Result bminfo = null;
        RequestDispatcher rd = null;
        
            if (isbn != null && !"".equals(isbn)) {
            	OpenLibraryResource olResource = new OpenLibraryResource();
                bminfo = olResource.getInfo(isbn);
                if(bminfo==null) {
                	log.log(Level.SEVERE, "No se encuentran libros con el isbn: " + isbn);
                	rd = req.getRequestDispatcher("/error.jsp");
                }else {
                	req.setAttribute("bookinfo", bminfo);
/*                	log.log(Level.INFO, "Información del libro con el isbn " + isbn + ": " + bminfo.toString());*/
                	req.setAttribute("title", bminfo.getAdditionalProperties().get("title"));
                	log.log(Level.INFO, "Información del libro con el isbn " + isbn + ": " + bminfo.getAdditionalProperties().toString());
                    rd = req.getRequestDispatcher("/ISBNresults.jsp");
                }
                
            } else {
            	log.log(Level.SEVERE, "El ISBN no se ha procesado correctamente: " + isbn);
                rd = req.getRequestDispatcher("/error.jsp");
            }

            rd.forward(req, resp);
	}

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp);
    }
}	
