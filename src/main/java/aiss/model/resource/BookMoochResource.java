package aiss.model.resource;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.appengine.repackaged.com.google.gson.JsonArray;
import com.google.appengine.repackaged.com.google.gson.JsonObject;

import aiss.model.BookMooch.BookInfo;
import aiss.model.BookMooch.BookSearch;
import aiss.model.BookMooch.Comment;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BookMoochResource {

	private static final Logger log = Logger.getLogger(BookMoochResource.class.getName());
	private final String informationUri = "http://api.bookmooch.com/api/asin?o=json";
	private final String searchUri = "http://api.bookmooch.com/api/search?o=json";
/*
	public List<BookSearch> searchBook(String title) throws JsonParseException, JsonMappingException, IOException {
		ClientResource cr = null;
		//BookSearch info = new BookSearch();
		List<BookSearch> results = new ArrayList<BookSearch>();
		// http://api.bookmooch.com/api/asin?asins=0445408499+0425105679&o=json

		try {
			cr = new ClientResource(searchUri + "&txt=" + title + "&db=bm");
			log.fine(searchUri + "&txt=" + title + "&db=bm");
			/*
			JsonArray jsonarray = new JsonArray(); 
			jsonarray.add(cr.get().toString());
			JsonObject jsonobject = jsonarray.getAsJsonObject();

			String idLibro = jsonobject.get("id").toString();
			String authorLibro = jsonobject.get("Author").toString();
			String titleLibro = jsonobject.get("Title").toString();
			info.setAuthor(authorLibro);
			info.setTitle(titleLibro);
			info.setId(idLibro);
			
			JSONArray jsonarray = new JSONArray(cr.toString());
			for (int i = 0; i < jsonarray.length(); i++) {
			    JSONObject jsonobject = jsonarray.getJSONObject(i);

			    ObjectMapper mapper = new ObjectMapper();
			    BookSearch bsTemp = mapper.readValue(jsonobject.toString(), BookSearch.class);
			    results.add(bsTemp);
			    
			}
		} catch (ResourceException re) {
			log.warning("Error when retrieving all information: " + cr.getResponse().getStatus());
		}

		return results;
	}
*/
	public Collection<BookSearch> searchBook(String title) throws JsonParseException, JsonMappingException, IOException {
		ClientResource cr = null;
		//Collection<BookSearch> results = new ArrayList<BookSearch>();
		BookSearch[] bs = null;
		// http://api.bookmooch.com/api/asin?asins=0445408499+0425105679&o=json

		try {
			cr = new ClientResource(searchUri + "&txt=" + title + "&db=bm");
			log.fine(searchUri + "&txt=" + title + "&db=bm");
			String bString = cr.get(String.class);
			log.fine(bString);
			bs = cr.get(BookSearch[].class);
			log.fine(bs.toString());
		} catch (ResourceException re) {
			log.warning("Error when retrieving all information: " + cr.getResponse().getStatus());
		}

		return Arrays.asList(bs);
	}
	
	public List<Comment> getComments(String isbn) {
		ClientResource cr = null;
		BookInfo info = null;
		List<Comment> comments = null;

		// http://api.bookmooch.com/api/asin?asins=0445408499+0425105679&o=json

		try {
			cr = new ClientResource(informationUri + "&asins=" + isbn);
			// String result = cr.get(String.class);
			info = cr.get(BookInfo.class);
			comments = info.getComments();

			if (comments.isEmpty()) {
				log.warning("No hay comentarios disponibles para este libro.");
			}

		} catch (ResourceException re) {
			log.warning("Error when retrieving all information: " + cr.getResponse().getStatus());
		}

		return comments;
	}

	public BookInfo infoBook(String isbn) throws UnsupportedEncodingException {
		ClientResource cr = null;
		BookInfo info = null;

		// &txt=carding&db=bm
		// http://api.bookmooch.com/api/asin?asins=0445408499+0425105679&o=json

		try {
			cr = new ClientResource(informationUri + "&asins=" + isbn);
			log.log(Level.FINE, "URL: " + informationUri + "&asins=" + isbn);
			// String result = cr.get(String.class);
			log.fine(cr.toString());
			info = cr.get(BookInfo.class);
			if (info == null) {
				log.log(Level.WARNING, "El resultado es nulo.");
			} else {
				log.log(Level.FINE, info.toString());
			}
		} catch (ResourceException re) {
			log.warning("Error when retrieving all results: " + cr.getResponse().getStatus());
		}

		return info;
	}
}
