package aiss.model.resource;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import aiss.model.pixabay.Hit;
import aiss.model.pixabay.SearchResults;

public class PixabayResourceTest {

	@Test
	public void testGetResults() {
		//Defino una query de ejemplo y creo el resource y la clase que recogerá la respuesta.
		String query = "Orwell";
		SearchResults PixabayResult = null;
		PixabayResource pixabayResource = new PixabayResource();
		//Realizo la búsqueda
		PixabayResult = pixabayResource.getResults(query);
		//Compruebo que la respuesta no es nula.
		assertNotNull("La respuesta que devuelve el servicio es nula", PixabayResult);
		System.out.println("Prueba PixabayResource.getResults() realizada con éxito.");

	}
/*
	@Test
	public void testGetResultsList() {
		//Defino una query de ejemplo y creo el resource y la clase que recogerá la respuesta.
		String query = "Orwell";
		List<Hit> PixabayResult = null;
		PixabayResource pixabayResource = new PixabayResource();
		//Realizo la búsqueda
		PixabayResult = pixabayResource.getResultsList(query);
		//Compruebo que la respuesta no es nula.
		assertNotNull("La respuesta que devuelve el servicio es nula", PixabayResult);
		System.out.println("Prueba PixabayResource.getResultsList() realizada con éxito.");

	}
*/
}
