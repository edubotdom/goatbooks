
package aiss.model.here;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "highlightedTitle",
    "category",
    "href",
    "type",
    "resultType",
    "vicinity",
    "highlightedVicinity",
    "position",
    "categoryTitle",
    "id",
    "distance"
})
public class Result {

    @JsonProperty("title")
    private String title;
    @JsonProperty("highlightedTitle")
    private String highlightedTitle;
    @JsonProperty("category")
    private String category;
    @JsonProperty("href")
    private String href;
    @JsonProperty("type")
    private String type;
    @JsonProperty("resultType")
    private String resultType;
    @JsonProperty("vicinity")
    private String vicinity;
    @JsonProperty("highlightedVicinity")
    private String highlightedVicinity;
    @JsonProperty("position")
    private List<Double> position = null;
    @JsonProperty("categoryTitle")
    private String categoryTitle;
    @JsonProperty("id")
    private String id;
    @JsonProperty("distance")
    private Integer distance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("highlightedTitle")
    public String getHighlightedTitle() {
        return highlightedTitle;
    }

    @JsonProperty("highlightedTitle")
    public void setHighlightedTitle(String highlightedTitle) {
        this.highlightedTitle = highlightedTitle;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("resultType")
    public String getResultType() {
        return resultType;
    }

    @JsonProperty("resultType")
    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    @JsonProperty("vicinity")
    public String getVicinity() {
        return vicinity;
    }

    @JsonProperty("vicinity")
    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    @JsonProperty("highlightedVicinity")
    public String getHighlightedVicinity() {
        return highlightedVicinity;
    }

    @JsonProperty("highlightedVicinity")
    public void setHighlightedVicinity(String highlightedVicinity) {
        this.highlightedVicinity = highlightedVicinity;
    }

    @JsonProperty("position")
    public List<Double> getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(List<Double> position) {
        this.position = position;
    }

    @JsonProperty("categoryTitle")
    public String getCategoryTitle() {
        return categoryTitle;
    }

    @JsonProperty("categoryTitle")
    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("distance")
    public Integer getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Integer distance) {
        this.distance = distance;
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
