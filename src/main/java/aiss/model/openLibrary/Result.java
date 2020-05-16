
package aiss.model.openLibrary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "identifiers",
    "subject_place",
    "covers",
    "lc_classifications",
    "latest_revision",
    "genres",
    "source_records",
    "title",
    "languages",
    "subjects",
    "publish_country",
    "by_statement",
    "oclc_numbers",
    "type",
    "revision",
    "publishers",
    "last_modified",
    "key",
    "authors",
    "publish_places",
    "pagination",
    "created",
    "dewey_decimal_class",
    "notes",
    "number_of_pages",
    "lccn",
    "isbn_10",
    "publish_date",
    "works"
})

@JsonIgnoreProperties(ignoreUnknown=true)
public class Result {

    @JsonProperty("identifiers")
    private Identifiers identifiers;
    @JsonProperty("subject_place")
    private List<String> subjectPlace = null;
    @JsonProperty("covers")
    private List<Integer> covers = null;
    @JsonProperty("lc_classifications")
    private List<String> lcClassifications = null;
    @JsonProperty("latest_revision")
    private Integer latestRevision;
    @JsonProperty("genres")
    private List<String> genres = null;
    @JsonProperty("source_records")
    private List<String> sourceRecords = null;
    @JsonProperty("title")
    private String title;
    @JsonProperty("languages")
    private List<Language> languages = null;
    @JsonProperty("subjects")
    private List<String> subjects = null;
    @JsonProperty("publish_country")
    private String publishCountry;
    @JsonProperty("by_statement")
    private String byStatement;
    @JsonProperty("oclc_numbers")
    private List<String> oclcNumbers = null;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("revision")
    private Integer revision;
    @JsonProperty("publishers")
    private List<String> publishers = null;
    @JsonProperty("last_modified")
    private LastModified lastModified;
    @JsonProperty("key")
    private String key;
    @JsonProperty("authors")
    private List<Author> authors = null;
    @JsonProperty("publish_places")
    private List<String> publishPlaces = null;
    @JsonProperty("pagination")
    private String pagination;
    @JsonProperty("created")
    private Created created;
    @JsonProperty("dewey_decimal_class")
    private List<String> deweyDecimalClass = null;
    @JsonProperty("notes")
    private Notes notes;
    @JsonProperty("number_of_pages")
    private Integer numberOfPages;
    @JsonProperty("lccn")
    private List<String> lccn = null;
    @JsonProperty("isbn_10")
    private List<String> isbn10 = null;
    @JsonProperty("publish_date")
    private String publishDate;
    @JsonProperty("works")
    private List<Work> works = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("identifiers")
    public Identifiers getIdentifiers() {
        return identifiers;
    }

    @JsonProperty("identifiers")
    public void setIdentifiers(Identifiers identifiers) {
        this.identifiers = identifiers;
    }

    @JsonProperty("subject_place")
    public List<String> getSubjectPlace() {
        return subjectPlace;
    }

    @JsonProperty("subject_place")
    public void setSubjectPlace(List<String> subjectPlace) {
        this.subjectPlace = subjectPlace;
    }

    @JsonProperty("covers")
    public List<Integer> getCovers() {
        return covers;
    }

    @JsonProperty("covers")
    public void setCovers(List<Integer> covers) {
        this.covers = covers;
    }

    @JsonProperty("lc_classifications")
    public List<String> getLcClassifications() {
        return lcClassifications;
    }

    @JsonProperty("lc_classifications")
    public void setLcClassifications(List<String> lcClassifications) {
        this.lcClassifications = lcClassifications;
    }

    @JsonProperty("latest_revision")
    public Integer getLatestRevision() {
        return latestRevision;
    }

    @JsonProperty("latest_revision")
    public void setLatestRevision(Integer latestRevision) {
        this.latestRevision = latestRevision;
    }

    @JsonProperty("genres")
    public List<String> getGenres() {
        return genres;
    }

    @JsonProperty("genres")
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @JsonProperty("source_records")
    public List<String> getSourceRecords() {
        return sourceRecords;
    }

    @JsonProperty("source_records")
    public void setSourceRecords(List<String> sourceRecords) {
        this.sourceRecords = sourceRecords;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("languages")
    public List<Language> getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    @JsonProperty("subjects")
    public List<String> getSubjects() {
        return subjects;
    }

    @JsonProperty("subjects")
    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @JsonProperty("publish_country")
    public String getPublishCountry() {
        return publishCountry;
    }

    @JsonProperty("publish_country")
    public void setPublishCountry(String publishCountry) {
        this.publishCountry = publishCountry;
    }

    @JsonProperty("by_statement")
    public String getByStatement() {
        return byStatement;
    }

    @JsonProperty("by_statement")
    public void setByStatement(String byStatement) {
        this.byStatement = byStatement;
    }

    @JsonProperty("oclc_numbers")
    public List<String> getOclcNumbers() {
        return oclcNumbers;
    }

    @JsonProperty("oclc_numbers")
    public void setOclcNumbers(List<String> oclcNumbers) {
        this.oclcNumbers = oclcNumbers;
    }

    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    @JsonProperty("revision")
    public Integer getRevision() {
        return revision;
    }

    @JsonProperty("revision")
    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    @JsonProperty("publishers")
    public List<String> getPublishers() {
        return publishers;
    }

    @JsonProperty("publishers")
    public void setPublishers(List<String> publishers) {
        this.publishers = publishers;
    }

    @JsonProperty("last_modified")
    public LastModified getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(LastModified lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("authors")
    public List<Author> getAuthors() {
        return authors;
    }

    @JsonProperty("authors")
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @JsonProperty("publish_places")
    public List<String> getPublishPlaces() {
        return publishPlaces;
    }

    @JsonProperty("publish_places")
    public void setPublishPlaces(List<String> publishPlaces) {
        this.publishPlaces = publishPlaces;
    }

    @JsonProperty("pagination")
    public String getPagination() {
        return pagination;
    }

    @JsonProperty("pagination")
    public void setPagination(String pagination) {
        this.pagination = pagination;
    }

    @JsonProperty("created")
    public Created getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(Created created) {
        this.created = created;
    }

    @JsonProperty("dewey_decimal_class")
    public List<String> getDeweyDecimalClass() {
        return deweyDecimalClass;
    }

    @JsonProperty("dewey_decimal_class")
    public void setDeweyDecimalClass(List<String> deweyDecimalClass) {
        this.deweyDecimalClass = deweyDecimalClass;
    }

    @JsonProperty("notes")
    public Notes getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    @JsonProperty("number_of_pages")
    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    @JsonProperty("number_of_pages")
    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @JsonProperty("lccn")
    public List<String> getLccn() {
        return lccn;
    }

    @JsonProperty("lccn")
    public void setLccn(List<String> lccn) {
        this.lccn = lccn;
    }

    @JsonProperty("isbn_10")
    public List<String> getIsbn10() {
        return isbn10;
    }

    @JsonProperty("isbn_10")
    public void setIsbn10(List<String> isbn10) {
        this.isbn10 = isbn10;
    }

    @JsonProperty("publish_date")
    public String getPublishDate() {
        return publishDate;
    }

    @JsonProperty("publish_date")
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @JsonProperty("works")
    public List<Work> getWorks() {
        return works;
    }

    @JsonProperty("works")
    public void setWorks(List<Work> works) {
        this.works = works;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Result [identifiers=" + identifiers + ", subjectPlace=" + subjectPlace + ", covers=" + covers
				+ ", lcClassifications=" + lcClassifications + ", latestRevision=" + latestRevision + ", genres="
				+ genres + ", sourceRecords=" + sourceRecords + ", title=" + title + ", languages=" + languages
				+ ", subjects=" + subjects + ", publishCountry=" + publishCountry + ", byStatement=" + byStatement
				+ ", oclcNumbers=" + oclcNumbers + ", type=" + type + ", revision=" + revision + ", publishers="
				+ publishers + ", lastModified=" + lastModified + ", key=" + key + ", authors=" + authors
				+ ", publishPlaces=" + publishPlaces + ", pagination=" + pagination + ", created=" + created
				+ ", deweyDecimalClass=" + deweyDecimalClass + ", notes=" + notes + ", numberOfPages=" + numberOfPages
				+ ", lccn=" + lccn + ", isbn10=" + isbn10 + ", publishDate=" + publishDate + ", works=" + works
				+ ", additionalProperties=" + additionalProperties + "]";
	}

}
