package aiss.model.resource;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.restlet.resource.ResourceException;

import aiss.model.GoogleBooks.BookInfo;
import aiss.model.GoogleBooks.Item;

public class GoogleBooksResourceTest {

	@Test
	public void testGetInfoFromID() {
		String idLibro = "2zgRDXFWkm8C";
		BookInfo bi = null;
		GoogleBooksResource googleResource = new GoogleBooksResource();
		bi = googleResource.getInfoFromID(idLibro);
		assertNotNull("La respuesta que devuelve el servicio es nula", bi);
		System.out.println("Prueba GoogleResurce.getInfoFromID() realizada con éxito.");

	}
/*
	@Test(expected = ResourceException.class)
	public void testGetInfoFromIDNulo(){
		String idLibro = "";
		BookInfo bi = null;
		GoogleBooksResource googleResource = new GoogleBooksResource();
		bi = googleResource.getInfoFromID(idLibro);
		assertNull("La respuesta que devuelve el servicio es nula", bi);
		System.out.println("Prueba GoogleResurce.getInfoFromIDnulo() realizada con éxito.");

	}
*/	
	@Test
	public void testSearchBook() {
		//Defino una query de ejemplo y creo el resource y la clase que recogerá la respuesta.
		String query = "Orwell";
		List<Item> volumes = null;
		GoogleBooksResource googleResource = new GoogleBooksResource();
		//Realizo la búsqueda
		volumes = googleResource.searchBook(query);
		//Compruebo que la respuesta no es nula.
		assertNotNull("La respuesta que devuelve el servicio es nula", volumes);
		System.out.println("Prueba GoogleResurce.searchBooks() realizada con éxito.");

	}
/*
	@Test
	public void testGetLibrary() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetListBookshelves() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBooksOfShelf() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetListBooksOfShelf() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertLibro() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteLibro() {
		fail("Not yet implemented");
	}
*/
}
