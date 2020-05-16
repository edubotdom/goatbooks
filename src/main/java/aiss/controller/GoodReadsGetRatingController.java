package aiss.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.goodReads.Rating;
import aiss.model.resource.GoodReadsResource;

public class GoodReadsGetRatingController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(GoodReadsGetRatingController.class.getName());

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String isbn = req.getParameter("isbn");
        Rating rate = null;
        if (isbn != null && !"".equals(isbn)) {
                GoodReadsResource grResource = new GoodReadsResource();
                rate = grResource.getRating(isbn);
                log.info("Book with isbn '" + isbn + "' rated!");
                req.setAttribute("rate", rate);
                req.getRequestDispatcher("/goodReadsView.jsp").forward(req, resp);
             
        } else {
            log.warning("Invalid isbn for rate!");
            req.getRequestDispatcher("/goodReadsRate").forward(req, resp);
        }

    }
        
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		doGet(request, response);
    }
 
        
    /*	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Load all playlist
		SongResource sr = new SongResource();
		Collection<Song> songs = sr.getAll();
		
		
		// Load all playlists
		PlaylistResource plr = new PlaylistResource();
		Collection<Playlist> playlists = plr.getAll();
			
		// Get selected playlist
		String id = request.getParameter("playlistId");
		log.log(Level.FINE, "Id=" + id);
		
		Playlist playlist=null;
		if (id!=null)	// Load the playlist with the id received as a parameter
			playlist = plr.getPlaylist(id);
		else if (id==null && !playlists.isEmpty())	{// No playlist selected, show the first one
			playlist = (Playlist) playlists.toArray()[0];
			id=playlist.getId();
		}
		
		if (playlist==null) {
			request.setAttribute("message", "Playlist not found");
			log.log(Level.FINE, "Playlist not found.");	
		} else
			log.log(Level.FINE, "Playlist with id " + id + " loaded.");
		
		// Forward to playlist view
		request.setAttribute("songs", songs);
		request.setAttribute("plsongs", playlist.getSongs());
		request.setAttribute("playlists", playlists);
		request.setAttribute("playlistId", id);	// id of the selected playlist
		request.getRequestDispatcher("/playlistView.jsp").forward(request, response);
		
	}
     * 
     * 
     * 
     * 
     */
    
}
