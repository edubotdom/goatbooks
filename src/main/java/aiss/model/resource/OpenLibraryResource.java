package aiss.model.resource;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.openLibrary.Result;

public class OpenLibraryResource {

	private static final Logger log = Logger.getLogger(OpenLibraryResource.class.getName());
	private final String informationUri = "http://openlibrary.org/api/get?key=/b/";


	public Result getInfo(String isbn) {
		ClientResource cr = null;
		Result info = null;
		
		//https://openlibrary.org/api/books?bibkeys=ISBN:0201558025&jscmd=data&format=json
		
		try {
			cr=new ClientResource(informationUri + isbn);
			log.log(Level.INFO, "URI de búsqueda: " + informationUri + isbn);
			//String result = cr.get(String.class);
			info = cr.get(Result.class);
			if(info==null) {
				log.warning("Search did return nothing");
			} else {
				log.info("Search returned something. Example: " + info.toString());
			}
		} catch (ResourceException re) {
			log.warning("Error when retrieving all information: " + cr.getResponse().getStatus());
		}
		
		return info;
	}

	
}
