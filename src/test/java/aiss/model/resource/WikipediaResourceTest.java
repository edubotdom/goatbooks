package aiss.model.resource;


import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import aiss.model.wikipedia.Search;
import aiss.model.wikipedia.SearchResult;

public class WikipediaResourceTest {

	@Test
	public void testGetInformation() {
		//Defino una query de ejemplo y creo el resource y la clase que recogerá la respuesta.
		String query = "Orwell";
		SearchResult wikiResult = null;
		WikipediaResource wikiResource = new WikipediaResource();
		//Realizo la búsqueda
		wikiResult = wikiResource.getInformation(query);
		//Compruebo que la respuesta no es nula.
		assertNotNull("La respuesta que devuelve el servicio es nula", wikiResult);
		System.out.println("Prueba WikipediaResurce.getInformation() realizada con éxito.");
	}

	@Test
	public void testGetListInformation() {
		//Defino una query de ejemplo y creo el resource y la clase que recogerá la respuesta.
		String query = "Orwell";
		List<Search> wikiResult = null;
		WikipediaResource wikiResource = new WikipediaResource();
		//Realizo la búsqueda
		wikiResult = wikiResource.getListInformation(query);
		//Compruebo que la respuesta no es nula.
		assertNotNull("La respuesta que devuelve el servicio es nula", wikiResult);
		System.out.println("Prueba WikipediaResurce.getListInformation() realizada con éxito.");
	
	}

}
