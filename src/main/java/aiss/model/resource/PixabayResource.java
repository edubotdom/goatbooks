package aiss.model.resource;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.pixabay.Hit;
import aiss.model.pixabay.SearchResults;

public class PixabayResource {
	
		private static final Logger log = Logger.getLogger(PixabayResource.class.getName());
		private final String uri ="https://pixabay.com/api/";
		private final String key ="?key=12301841-410239e9c404783f753124bad";
		
		public PixabayResource() {
			super();
		}
		
		public SearchResults getResults(String query) {
			SearchResults sr = null;
			ClientResource cr = null;
			
			try {
				cr = new ClientResource(uri + key + "&q=" + query);
				log.log(Level.INFO, "URI: " + uri + key + "&q=" + query);
				sr = cr.get(SearchResults.class);
			} catch (ResourceException re) {
				log.warning("Error when retrieving the photograph search: " + cr.getResponse().getStatus());
			}
			return sr;
			
		}
		
		public List<Hit> getResultsList(String query) {
			SearchResults sr = null;
			ClientResource cr = null;
			 List<Hit> resultados = null;
			try {
				cr = new ClientResource(uri + key + "&q=" + query);
				log.log(Level.INFO, "URI: " + uri + key + "&q=" + query);
				sr = cr.get(SearchResults.class);
				resultados = sr.getHits();
			} catch (ResourceException re) {
				log.warning("Error when retrieving the photograph search: " + cr.getResponse().getStatus());
			}
			return resultados;
			
		}
		
}
