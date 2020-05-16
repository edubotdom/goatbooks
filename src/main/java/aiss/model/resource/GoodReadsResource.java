package aiss.model.resource;

import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.goodReads.Rating;

public class GoodReadsResource {
	// https://www.goodreads.com/book/review_counts.json?isbns=0441172717%2C0141439602&key=0dTlQtFjVVivfDQ0C5Lug
	private static final Logger log = Logger.getLogger(GoodReadsResource.class.getName());
	private final String ratingUri = "https://www.goodreads.com/book/review_counts.json?";
	private final String key = "key=0dTlQtFjVVivfDQ0C5Lug";

	// https://www.goodreads.com/book/review_counts.json?isbns=0441172717&key=0dTlQtFjVVivfDQ0C5Lug

	public Rating getRating(String isbn) {
		ClientResource cr = null;
		Rating rating = null;

		// https://openlibrary.org/api/books?bibkeys=ISBN:0201558025&jscmd=data&format=json

		try {
			cr = new ClientResource(ratingUri + key + "&isbns=" + isbn);
			// String result = cr.get(String.class);
			rating = cr.get(Rating.class);
		} catch (ResourceException re) {
			log.warning("Error when retrieving all information: " + cr.getResponse().getStatus());
		}

		return rating;
	}

}
