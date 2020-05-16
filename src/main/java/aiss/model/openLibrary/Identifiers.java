
package aiss.model.openLibrary;

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
    "goodreads",
    "librarything"
})
public class Identifiers {

    @JsonProperty("goodreads")
    private List<String> goodreads = null;
    @JsonProperty("librarything")
    private List<String> librarything = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("goodreads")
    public List<String> getGoodreads() {
        return goodreads;
    }

    @JsonProperty("goodreads")
    public void setGoodreads(List<String> goodreads) {
        this.goodreads = goodreads;
    }

    @JsonProperty("librarything")
    public List<String> getLibrarything() {
        return librarything;
    }

    @JsonProperty("librarything")
    public void setLibrarything(List<String> librarything) {
        this.librarything = librarything;
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
