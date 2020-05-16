
package aiss.model.BookMooch;

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
    "id",
    "Author",
    "Binding",
    "DetailPageURL",
    "Edition",
    "EditorialReview_Source",
    "ISBN",
    "NumberOfPages",
    "PackageDimensions_Height",
    "PackageDimensions_Length",
    "PackageDimensions_Size_Units",
    "PackageDimensions_Weight",
    "PackageDimensions_Weight_Units",
    "PackageDimensions_Width",
    "ProductGroup",
    "PublicationDate",
    "Publisher",
    "Title",
    "store",
    "Topics",
    "comments",
    "ListPrice_Amount",
    "ListPrice_CurrencyCode",
    "ListPrice_FormattedPrice",
    "SalesRank",
    "wishlists_on"
})
public class BookSearch {

    @JsonProperty("id")
    private String id;
    @JsonProperty("Author")
    private String author;
    @JsonProperty("Binding")
    private String binding;
    @JsonProperty("DetailPageURL")
    private String detailPageURL;
    @JsonProperty("Edition")
    private String edition;
    @JsonProperty("EditorialReview_Source")
    private String editorialReviewSource;
    @JsonProperty("ISBN")
    private String iSBN;
    @JsonProperty("NumberOfPages")
    private String numberOfPages;
    @JsonProperty("PackageDimensions_Height")
    private String packageDimensionsHeight;
    @JsonProperty("PackageDimensions_Length")
    private String packageDimensionsLength;
    @JsonProperty("PackageDimensions_Size_Units")
    private String packageDimensionsSizeUnits;
    @JsonProperty("PackageDimensions_Weight")
    private String packageDimensionsWeight;
    @JsonProperty("PackageDimensions_Weight_Units")
    private String packageDimensionsWeightUnits;
    @JsonProperty("PackageDimensions_Width")
    private String packageDimensionsWidth;
    @JsonProperty("ProductGroup")
    private String productGroup;
    @JsonProperty("PublicationDate")
    private String publicationDate;
    @JsonProperty("Publisher")
    private String publisher;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("store")
    private String store;
    @JsonProperty("Topics")
    private List<String> topics = null;
    @JsonProperty("comments")
    private List<Comment> comments = null;
    @JsonProperty("ListPrice_Amount")
    private String listPriceAmount;
    @JsonProperty("ListPrice_CurrencyCode")
    private String listPriceCurrencyCode;
    @JsonProperty("ListPrice_FormattedPrice")
    private String listPriceFormattedPrice;
    @JsonProperty("SalesRank")
    private String salesRank;
    @JsonProperty("wishlists_on")
    private List<WishlistsOn> wishlistsOn = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("Author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("Author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("Binding")
    public String getBinding() {
        return binding;
    }

    @JsonProperty("Binding")
    public void setBinding(String binding) {
        this.binding = binding;
    }

    @JsonProperty("DetailPageURL")
    public String getDetailPageURL() {
        return detailPageURL;
    }

    @JsonProperty("DetailPageURL")
    public void setDetailPageURL(String detailPageURL) {
        this.detailPageURL = detailPageURL;
    }

    @JsonProperty("Edition")
    public String getEdition() {
        return edition;
    }

    @JsonProperty("Edition")
    public void setEdition(String edition) {
        this.edition = edition;
    }

    @JsonProperty("EditorialReview_Source")
    public String getEditorialReviewSource() {
        return editorialReviewSource;
    }

    @JsonProperty("EditorialReview_Source")
    public void setEditorialReviewSource(String editorialReviewSource) {
        this.editorialReviewSource = editorialReviewSource;
    }

    @JsonProperty("ISBN")
    public String getISBN() {
        return iSBN;
    }

    @JsonProperty("ISBN")
    public void setISBN(String iSBN) {
        this.iSBN = iSBN;
    }

    @JsonProperty("NumberOfPages")
    public String getNumberOfPages() {
        return numberOfPages;
    }

    @JsonProperty("NumberOfPages")
    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @JsonProperty("PackageDimensions_Height")
    public String getPackageDimensionsHeight() {
        return packageDimensionsHeight;
    }

    @JsonProperty("PackageDimensions_Height")
    public void setPackageDimensionsHeight(String packageDimensionsHeight) {
        this.packageDimensionsHeight = packageDimensionsHeight;
    }

    @JsonProperty("PackageDimensions_Length")
    public String getPackageDimensionsLength() {
        return packageDimensionsLength;
    }

    @JsonProperty("PackageDimensions_Length")
    public void setPackageDimensionsLength(String packageDimensionsLength) {
        this.packageDimensionsLength = packageDimensionsLength;
    }

    @JsonProperty("PackageDimensions_Size_Units")
    public String getPackageDimensionsSizeUnits() {
        return packageDimensionsSizeUnits;
    }

    @JsonProperty("PackageDimensions_Size_Units")
    public void setPackageDimensionsSizeUnits(String packageDimensionsSizeUnits) {
        this.packageDimensionsSizeUnits = packageDimensionsSizeUnits;
    }

    @JsonProperty("PackageDimensions_Weight")
    public String getPackageDimensionsWeight() {
        return packageDimensionsWeight;
    }

    @JsonProperty("PackageDimensions_Weight")
    public void setPackageDimensionsWeight(String packageDimensionsWeight) {
        this.packageDimensionsWeight = packageDimensionsWeight;
    }

    @JsonProperty("PackageDimensions_Weight_Units")
    public String getPackageDimensionsWeightUnits() {
        return packageDimensionsWeightUnits;
    }

    @JsonProperty("PackageDimensions_Weight_Units")
    public void setPackageDimensionsWeightUnits(String packageDimensionsWeightUnits) {
        this.packageDimensionsWeightUnits = packageDimensionsWeightUnits;
    }

    @JsonProperty("PackageDimensions_Width")
    public String getPackageDimensionsWidth() {
        return packageDimensionsWidth;
    }

    @JsonProperty("PackageDimensions_Width")
    public void setPackageDimensionsWidth(String packageDimensionsWidth) {
        this.packageDimensionsWidth = packageDimensionsWidth;
    }

    @JsonProperty("ProductGroup")
    public String getProductGroup() {
        return productGroup;
    }

    @JsonProperty("ProductGroup")
    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    @JsonProperty("PublicationDate")
    public String getPublicationDate() {
        return publicationDate;
    }

    @JsonProperty("PublicationDate")
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @JsonProperty("Publisher")
    public String getPublisher() {
        return publisher;
    }

    @JsonProperty("Publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("store")
    public String getStore() {
        return store;
    }

    @JsonProperty("store")
    public void setStore(String store) {
        this.store = store;
    }

    @JsonProperty("Topics")
    public List<String> getTopics() {
        return topics;
    }

    @JsonProperty("Topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    @JsonProperty("comments")
    public List<Comment> getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @JsonProperty("ListPrice_Amount")
    public String getListPriceAmount() {
        return listPriceAmount;
    }

    @JsonProperty("ListPrice_Amount")
    public void setListPriceAmount(String listPriceAmount) {
        this.listPriceAmount = listPriceAmount;
    }

    @JsonProperty("ListPrice_CurrencyCode")
    public String getListPriceCurrencyCode() {
        return listPriceCurrencyCode;
    }

    @JsonProperty("ListPrice_CurrencyCode")
    public void setListPriceCurrencyCode(String listPriceCurrencyCode) {
        this.listPriceCurrencyCode = listPriceCurrencyCode;
    }

    @JsonProperty("ListPrice_FormattedPrice")
    public String getListPriceFormattedPrice() {
        return listPriceFormattedPrice;
    }

    @JsonProperty("ListPrice_FormattedPrice")
    public void setListPriceFormattedPrice(String listPriceFormattedPrice) {
        this.listPriceFormattedPrice = listPriceFormattedPrice;
    }

    @JsonProperty("SalesRank")
    public String getSalesRank() {
        return salesRank;
    }

    @JsonProperty("SalesRank")
    public void setSalesRank(String salesRank) {
        this.salesRank = salesRank;
    }

    @JsonProperty("wishlists_on")
    public List<WishlistsOn> getWishlistsOn() {
        return wishlistsOn;
    }

    @JsonProperty("wishlists_on")
    public void setWishlistsOn(List<WishlistsOn> wishlistsOn) {
        this.wishlistsOn = wishlistsOn;
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
