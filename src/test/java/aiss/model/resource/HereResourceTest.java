package aiss.model.resource;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import aiss.model.here.Bibliotecas;
import aiss.model.here.Result;

public class HereResourceTest {

	@Test
	public void testGetBibliotecas() {
		//Defino una query de ejemplo y creo el resource y la clase que recogerá la respuesta.
		String lat = "37.385459";
		String lng = "-5.985879";
		String r = "10000";
		Bibliotecas resultados = null;
		HereResource hereResource = new HereResource();
		//Realizo la búsqueda
		resultados = hereResource.getBibliotecas(lat, lng, r);
		//Compruebo que la respuesta no es nula.
		assertNotNull("La respuesta que devuelve el servicio es nula", resultados);
		System.out.println("Prueba HereResource.getInformation() realizada con éxito.");
	}

	@Test
	public void testGetListBiblioteca() {
		//Defino una query de ejemplo y creo el resource y la clase que recogerá la respuesta.
		String lat = "37.385459";
		String lng = "-5.985879";
		String r = "10000";
		List<Result> resultados = null;
		HereResource hereResource = new HereResource();
		//Realizo la búsqueda
		resultados = hereResource.getListBiblioteca(lat, lng, r);
		//Compruebo que la respuesta no es nula.
		assertNotNull("La respuesta que devuelve el servicio es nula", resultados);
		System.out.println("Prueba HereResource.getInformation() realizada con éxito.");

	}

}
