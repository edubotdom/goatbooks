package aiss.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.BookMooch.BookInfo;
import aiss.model.BookMooch.BookSearch;
import aiss.model.resource.BookMoochResource;

public class BookMoochInfoController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String isbn = req.getParameter("isbn");
        BookInfo binfo = null;
            if (isbn != null && !"".equals(isbn)) {
                BookMoochResource bmResource = new BookMoochResource();
                binfo = bmResource.infoBook(isbn);
                req.setAttribute("bookinfo", binfo);
                req.getRequestDispatcher("bookMoochInfo.jsp").forward(req, resp);
            } else {
                req.setAttribute("message", "You must provide a valid isbn for information response");

            }

	}

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp);
    }
}
