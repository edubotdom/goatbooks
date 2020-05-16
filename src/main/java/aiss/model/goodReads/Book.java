
package aiss.model.goodReads;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "isbn",
    "isbn13",
    "ratings_count",
    "reviews_count",
    "text_reviews_count",
    "work_ratings_count",
    "work_reviews_count",
    "work_text_reviews_count",
    "average_rating"
})
public class Book {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("isbn")
    private String isbn;
    @JsonProperty("isbn13")
    private String isbn13;
    @JsonProperty("ratings_count")
    private Integer ratingsCount;
    @JsonProperty("reviews_count")
    private Integer reviewsCount;
    @JsonProperty("text_reviews_count")
    private Integer textReviewsCount;
    @JsonProperty("work_ratings_count")
    private Integer workRatingsCount;
    @JsonProperty("work_reviews_count")
    private Integer workReviewsCount;
    @JsonProperty("work_text_reviews_count")
    private Integer workTextReviewsCount;
    @JsonProperty("average_rating")
    private String averageRating;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("isbn")
    public String getIsbn() {
        return isbn;
    }

    @JsonProperty("isbn")
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @JsonProperty("isbn13")
    public String getIsbn13() {
        return isbn13;
    }

    @JsonProperty("isbn13")
    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    @JsonProperty("ratings_count")
    public Integer getRatingsCount() {
        return ratingsCount;
    }

    @JsonProperty("ratings_count")
    public void setRatingsCount(Integer ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    @JsonProperty("reviews_count")
    public Integer getReviewsCount() {
        return reviewsCount;
    }

    @JsonProperty("reviews_count")
    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    @JsonProperty("text_reviews_count")
    public Integer getTextReviewsCount() {
        return textReviewsCount;
    }

    @JsonProperty("text_reviews_count")
    public void setTextReviewsCount(Integer textReviewsCount) {
        this.textReviewsCount = textReviewsCount;
    }

    @JsonProperty("work_ratings_count")
    public Integer getWorkRatingsCount() {
        return workRatingsCount;
    }

    @JsonProperty("work_ratings_count")
    public void setWorkRatingsCount(Integer workRatingsCount) {
        this.workRatingsCount = workRatingsCount;
    }

    @JsonProperty("work_reviews_count")
    public Integer getWorkReviewsCount() {
        return workReviewsCount;
    }

    @JsonProperty("work_reviews_count")
    public void setWorkReviewsCount(Integer workReviewsCount) {
        this.workReviewsCount = workReviewsCount;
    }

    @JsonProperty("work_text_reviews_count")
    public Integer getWorkTextReviewsCount() {
        return workTextReviewsCount;
    }

    @JsonProperty("work_text_reviews_count")
    public void setWorkTextReviewsCount(Integer workTextReviewsCount) {
        this.workTextReviewsCount = workTextReviewsCount;
    }

    @JsonProperty("average_rating")
    public String getAverageRating() {
        return averageRating;
    }

    @JsonProperty("average_rating")
    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
