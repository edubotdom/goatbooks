package aiss.model.resource;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.wikipedia.Search;
import aiss.model.wikipedia.SearchResult;

public class WikipediaResource {

	private static final Logger log = Logger.getLogger(WikipediaResource.class.getName());
	private final String uri ="https://en.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";
	
	public WikipediaResource() {
		super();
	}
	
	public SearchResult getInformation(String query) {
		SearchResult sr = null;
		ClientResource cr = null;
		
		try {
			//https://en.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=Vargas Llosa
			cr = new ClientResource(uri + query);
			log.log(Level.INFO, "URI: " + uri + query);
			sr = cr.get(SearchResult.class);
			
		} catch (ResourceException re){
			log.warning("Error when retrieving information: " + cr.getResponse().getStatus());
		}
		
		return sr;
	}

	public List<Search> getListInformation(String query) {
		SearchResult sr = null;
		ClientResource cr = null;
		List<Search> lresultados = null;
		
		try {
			//https://en.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=Vargas Llosa
			cr = new ClientResource(uri + query);
			log.log(Level.INFO, "URI: " + uri + query);
			sr = cr.get(SearchResult.class);
			lresultados = sr.getQuery().getSearch();
			
		} catch (ResourceException re){
			log.warning("Error when retrieving all bookshelves: " + cr.getResponse().getStatus());
		}
		
		return lresultados;
	}
	
}
