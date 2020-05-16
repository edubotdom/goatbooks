package aiss.model.resource;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.GoogleBooks.BookInfo;
import aiss.model.here.Bibliotecas;
import aiss.model.here.Result;

public class HereResource {
	private static final Logger log = Logger.getLogger(GoogleBooksResource.class.getName());
	private final String app_id = "eH4E6e9Qf0s9wJhKk3y1";
	private final String app_code = "J9X9Z-6Afj8y_XejA778fg";
	private final String uri ="https://places.cit.api.here.com/places/v1/autosuggest?";
//https://places.cit.api.here.com/places/v1/autosuggest?in=37.397834,-5.944466;r=10000&q=libreria&app_id=eH4E6e9Qf0s9wJhKk3y1&app_code=J9X9Z-6Afj8y_XejA778fg
	
	public HereResource() {
		super();
	}
	
	public Bibliotecas getBibliotecas(String lat, String lng, String r) {
		Bibliotecas resultados = null;
		ClientResource cr = null;
		
		try {
			cr = new ClientResource(uri + "in=" + lat + "," + lng + ";r=" + r + "&q=libreria&app_id=" + app_id + "&app_code=" + app_code);
			log.log(Level.INFO, "URI usada: " + uri + "in=" + lat + "," + lng + ";r=" + r + "&q=libreria&app_id=" + app_id + "&app_code=" + app_code);
			resultados = cr.get(Bibliotecas.class);
		} catch (ResourceException re){
			log.warning("Error when retrieving all libraries: " + cr.getResponse().getStatus());
		}
		return resultados;
	}
	
	public List<Result> getListBiblioteca(String lat, String lng, String r) {
		Bibliotecas resultados = null;
		ClientResource cr = null;
		List<Result> listResultados = null;
		
		try {
			cr = new ClientResource(uri + "in=" + lat + "," + lng + ";r=" + r + "&q=libreria&app_id=" + app_id + "&app_code=" + app_code);
			log.log(Level.INFO, "URI usada: " + uri + "in=" + lat + "," + lng + ";r=" + r + "&q=libreria&app_id=" + app_id + "&app_code=" + app_code);
			resultados = cr.get(Bibliotecas.class);
			listResultados = resultados.getResults();
		} catch (ResourceException re){
			log.warning("Error when retrieving all libraries: " + cr.getResponse().getStatus());
		}
		return listResultados;
	}
}
