package aiss;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PresentacionServlet extends HttpServlet {

	private static final Logger log = Logger.getLogger(HelloWorldServlet.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		resp.setContentType("text/html");
		// Sample log
		log.log(Level.FINE, "Processing GET request");

		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"es\">");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<title>GOAT Books</title>");
		out.println("</head><header>");
		out.println("<h1 align=\"middle\">GOAT Books</h1>");
		out.println("</header>");
		out.println("<main><div>");
		out.println("Este proyecto ha sido realizado por:");
		out.println("<ul><li>");
		out.println("Daniel Arellano Martínez");
		out.println("</li><li>");
		out.println("Eduardo Miguel Botía Domingo");
		out.println("</li><li>");
		out.println("Juan Noguerol Tirado");
		out.println("</li><li>");
		out.println("Javier Vázquez Zambrano");
		out.println("</li></ul></div>");
		out.println("<div>");
		out.println("<h3>");
		out.println("Descripción del trabajo.");
		out.println("</h3>");
		out.println("<p>");
		out.println(
				"Hemos planteado una aplicación web basada en reunir toda la información sobre un libro introducido por un usuario, " +
				"para acceder a dicha información desde un único sitio, sin tener que navegar en multitud de sitios web en paralelo para " +
				"obtenerla. A un título, o cualquier campo de información que sirva para realizar una búsqueda, se devolverá un listado " +
				"de los libros que más se acercan a la descripción. A cada resultado, se indexará un enlace que redirija a una página " +
				"con la información más relevante de dicho libro como su portada, su número de páginas, una reseña, un enlace a compra, " +
				"o la posibilidad de comentar o acceder a comentarios usando Goodreads, una red social basada en los libros como temática " +
				"principal, así como aquella información que pueda resultar relevante al usuario.");
		out.println("</p>");
		out.println("</div>");
		out.println("</main>");
		out.println("<br><footer>");
		out.println("<p align=\"middle\">");
		out.println("&copy; Copyright  by SCUMENT");
		out.println("</p></footer>");
		out.println("</html>");
//		out.println();

	}
}