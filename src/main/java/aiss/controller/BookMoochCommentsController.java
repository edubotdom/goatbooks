package aiss.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import aiss.model.BookMooch.Comment;
import aiss.model.resource.BookMoochResource;

public class BookMoochCommentsController extends HttpServlet {

	private static final long serialVersionUID = 410460996772776026L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String isbn = req.getParameter("isbn");
        List<Comment> comments = null;
            if (isbn != null && !"".equals(isbn)) {
                BookMoochResource bmResource = new BookMoochResource();
                comments = bmResource.getComments(isbn);
                req.setAttribute("comments", comments);
                req.getRequestDispatcher("bookMoochComments.jsp").forward(req, resp);
            } else {
                req.setAttribute("message", "You must provide a valid isbn for comments response");

            }

	}

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp);
    }
}
