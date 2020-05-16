package aiss.model.resource;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.GoogleBooks.BookInfo;
import aiss.model.GoogleBooks.BookShelf;
import aiss.model.GoogleBooks.BookShelves;
import aiss.model.GoogleBooks.Item;
import aiss.model.GoogleBooks.Results;
import aiss.model.GoogleBooks.Volume;
import aiss.model.GoogleBooks.Volumes;

public class GoogleBooksResource {

	private static final Logger log = Logger.getLogger(GoogleBooksResource.class.getName());
	private final String access_token;
	private final String uri ="https://www.googleapis.com/books/v1/mylibrary/";
	private final String uriSearch = "https://www.googleapis.com/books/v1/volumes?";
	private final String urInfo = "https://www.googleapis.com/books/v1/volumes/";
	private final String key = "&key=AIzaSyDM4OSvxQzMtB8s20z_U6cZ3nWBgr_aFyo";
	private final String key2 = "key=AIzaSyDM4OSvxQzMtB8s20z_U6cZ3nWBgr_aFyo";
	//GET https://www.googleapis.com/books/v1/mylibrary/bookshelves?key={YOUR_API_KEY}
	
	public GoogleBooksResource(String access_token) {
        this.access_token = access_token;
    }
	
	public GoogleBooksResource() {
		this.access_token = null;
    }
	
	public BookInfo getInfoFromID(String id) {
		BookInfo bi = null;
		ClientResource cr = null;
		//https://www.googleapis.com/books/v1/volumes/2zgRDXFWkm8C?key={YOUR_API_KEY}
		
		try {
			cr = new ClientResource(urInfo + id +"?" +key2);
			log.log(Level.INFO, "URI usada: " + urInfo + id +"?" +key2);
			bi = cr.get(BookInfo.class);
		} catch (ResourceException re){
			log.warning("Error when retrieving all bookshelves: " + cr.getResponse().getStatus());
		}
		
		return bi;
	}
	
	public List<Item> searchBook(String query){
		List<Item> volumes = null;
		ClientResource cr = null;
		Results results = null;
		
		try {
			//https://www.googleapis.com/books/v1/volumes?q=potter&langRestrict=spanish&maxResults=5&orderBy=relevance
			cr = new ClientResource(uriSearch + "q=" + query + /*"&langRestrict=spanish&maxResults=20&orderBy=relevance" + */key);
			log.log(Level.INFO, "URI: " + uriSearch + "q=" + query + /*"&langRestrict=spanish&maxResults=20&orderBy=relevance" + */key);
			results = cr.get(Results.class);
			volumes = results.getItems();
		} catch (ResourceException re){
			log.warning("Error when retrieving all bookshelves: " + cr.getResponse().getStatus());
		}
		
		return volumes;
	}
	
	public BookShelves getLibrary(){
		ClientResource cr = null;
		BookShelves bookshelves = null;
		
		try {
			cr = new ClientResource(uri + "?access_token=" + access_token);
			bookshelves = cr.get(BookShelves.class);
		} catch (ResourceException re){
			log.warning("Error when retrieving all bookshelves: " + cr.getResponse().getStatus());
		}
		
		return bookshelves;
	}
	
	public List<BookShelf> getListBookshelves(){
		ClientResource cr = null;
		List<BookShelf> bookshelves = null;
		BookShelves bs = null;
		
		try {
			cr = new ClientResource(uri + "bookshelves?access_token=" + access_token);
			bs = cr.get(BookShelves.class);
			bookshelves = bs.getItems();
		} catch (ResourceException re){
			log.warning("Error when retrieving all bookshelves: " + cr.getResponse().getStatus());
		}
		
		return bookshelves;
	}
	
	public Volumes getBooksOfShelf(String id){
		Volumes books = null;
		ClientResource cr = null;
		//https://www.googleapis.com/books/v1/mylibrary/bookshelves/0/volumes?key={YOUR_API_KEY}
		
		try {
			cr = new ClientResource(uri + "bookshelves/" + id + "/volumes?access_token=" + access_token);
			books = cr.get(Volumes.class);
			
		} catch (ResourceException re){
			log.warning("Error when retrieving all books: " + cr.getResponse().getStatus());
		}
		
		return books;
	}
	
	public List<Volume> getListBooksOfShelf(String id){
		Volumes books = null;
		List<Volume> bookList = null;
		ClientResource cr = null;
		//https://www.googleapis.com/books/v1/mylibrary/bookshelves/0/volumes?key={YOUR_API_KEY}
		
		try {
			cr = new ClientResource(uri + "bookshelves/" + id + "/volumes?access_token=" + access_token);
			books = cr.get(Volumes.class);
			bookList = books.getItems();
			
		} catch (ResourceException re){
			log.warning("Error when retrieving all books: " + cr.getResponse().getStatus());
		}
		
		return bookList;
	}

	public boolean insertLibro(String book, String shelf) {

		ClientResource cr = null;
		boolean result = false;
		
		//POST https://www.googleapis.com/books/v1/mylibrary/bookshelves/0/addVolume?volumeId=lZZCzTM_9PUC&key={YOUR_API_KEY}
		//POST https://www.googleapis.com/books/v1/mylibrary/bookshelves/shelf/addVolume
		//POST https://www.googleapis.com/books/v1/mylibrary/bookshelves/4/addVolume?volumeId=4HfpAAAAMAAJ&key={YOUR_API_KEY}

		try {
			//cr = new ClientResource(uri + "bookshelves/" + shelf + "/addVolume" +"?access_token=" + access_token);
			cr = new ClientResource(uri + "bookshelves/" + shelf + "/addVolume" +"?volumeId=" + book+ "&access_token=" + access_token);
			//cr.post(book, String.class);
			cr.post(String.class);
			result = true;
			
			
		} catch (ResourceException re) {
			log.warning("Error when inserting file: " + cr.getResponse().getStatus());
		}
		return result;
	}
	
	//MISMO MÉTODO QUE ADD PERO CON LA URI CAMBIADA (ADDVOLUME->REMOVE VOLUME)S
	public boolean deleteLibro(String book, String shelf) {

		ClientResource cr = null;
		boolean result = false;
		
		//POST https://www.googleapis.com/books/v1/mylibrary/bookshelves/0/addVolume?volumeId=lZZCzTM_9PUC&key={YOUR_API_KEY}
		//POST https://www.googleapis.com/books/v1/mylibrary/bookshelves/shelf/addVolume
		//POST https://www.googleapis.com/books/v1/mylibrary/bookshelves/4/addVolume?volumeId=4HfpAAAAMAAJ&key={YOUR_API_KEY}

		try {
			//cr = new ClientResource(uri + "bookshelves/" + shelf + "/addVolume" +"?access_token=" + access_token);
			cr = new ClientResource(uri + "bookshelves/" + shelf + "/removeVolume" +"?volumeId=" + book+ "&access_token=" + access_token);
			//cr.post(book, String.class);
			cr.post(String.class);
			result = true;
			
			
		} catch (ResourceException re) {
			log.warning("Error when inserting file: " + cr.getResponse().getStatus());
		}
		return result;
	}
	
}
