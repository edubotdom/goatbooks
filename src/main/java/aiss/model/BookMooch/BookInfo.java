
package aiss.model.BookMooch;

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
    "id",
    "Author",
    "Binding",
    "DetailPageURL",
    "EditorialReview_Content",
    "EditorialReview_Source",
    "ISBN",
    "LargeImage_Height",
    "LargeImage_URL",
    "LargeImage_Width",
    "ListPrice_Amount",
    "ListPrice_CurrencyCode",
    "ListPrice_FormattedPrice",
    "MediumImage_Height",
    "MediumImage_URL",
    "MediumImage_Width",
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
    "SalesRank",
    "SmallImage_Height",
    "SmallImage_URL",
    "SmallImage_Width",
    "Title",
    "store",
    "Topics",
    "giver_ids",
    "moocher_ids",
    "transactions",
    "wishlists_on",
    "comments",
    "bookmooch_recommends"
})

@JsonIgnoreProperties(ignoreUnknown=true)
public class BookInfo {

    @JsonProperty("id")
    private String id;
    @JsonProperty("Author")
    private String author;
    @JsonProperty("Binding")
    private String binding;
    @JsonProperty("DetailPageURL")
    private String detailPageURL;
    @JsonProperty("EditorialReview_Content")
    private String editorialReviewContent;
    @JsonProperty("EditorialReview_Source")
    private String editorialReviewSource;
    @JsonProperty("ISBN")
    private String iSBN;
    @JsonProperty("LargeImage_Height")
    private String largeImageHeight;
    @JsonProperty("LargeImage_URL")
    private String largeImageURL;
    @JsonProperty("LargeImage_Width")
    private String largeImageWidth;
    @JsonProperty("ListPrice_Amount")
    private String listPriceAmount;
    @JsonProperty("ListPrice_CurrencyCode")
    private String listPriceCurrencyCode;
    @JsonProperty("ListPrice_FormattedPrice")
    private String listPriceFormattedPrice;
    @JsonProperty("MediumImage_Height")
    private String mediumImageHeight;
    @JsonProperty("MediumImage_URL")
    private String mediumImageURL;
    @JsonProperty("MediumImage_Width")
    private String mediumImageWidth;
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
    @JsonProperty("SalesRank")
    private String salesRank;
    @JsonProperty("SmallImage_Height")
    private String smallImageHeight;
    @JsonProperty("SmallImage_URL")
    private String smallImageURL;
    @JsonProperty("SmallImage_Width")
    private String smallImageWidth;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("store")
    private String store;
    @JsonProperty("Topics")
    private List<String> topics = null;
    @JsonProperty("giver_ids")
    private List<String> giverIds = null;
    @JsonProperty("moocher_ids")
    private List<String> moocherIds = null;
    @JsonProperty("transactions")
    private List<String> transactions = null;
    @JsonProperty("wishlists_on")
    private List<WishlistsOn> wishlistsOn = null;
    @JsonProperty("comments")
    private List<Comment> comments = null;
    @JsonProperty("bookmooch_recommends")
    private List<String> bookmoochRecommends = null;
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

    @JsonProperty("EditorialReview_Content")
    public String getEditorialReviewContent() {
        return editorialReviewContent;
    }

    @JsonProperty("EditorialReview_Content")
    public void setEditorialReviewContent(String editorialReviewContent) {
        this.editorialReviewContent = editorialReviewContent;
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

    @JsonProperty("LargeImage_Height")
    public String getLargeImageHeight() {
        return largeImageHeight;
    }

    @JsonProperty("LargeImage_Height")
    public void setLargeImageHeight(String largeImageHeight) {
        this.largeImageHeight = largeImageHeight;
    }

    @JsonProperty("LargeImage_URL")
    public String getLargeImageURL() {
        return largeImageURL;
    }

    @JsonProperty("LargeImage_URL")
    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }

    @JsonProperty("LargeImage_Width")
    public String getLargeImageWidth() {
        return largeImageWidth;
    }

    @JsonProperty("LargeImage_Width")
    public void setLargeImageWidth(String largeImageWidth) {
        this.largeImageWidth = largeImageWidth;
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

    @JsonProperty("MediumImage_Height")
    public String getMediumImageHeight() {
        return mediumImageHeight;
    }

    @JsonProperty("MediumImage_Height")
    public void setMediumImageHeight(String mediumImageHeight) {
        this.mediumImageHeight = mediumImageHeight;
    }

    @JsonProperty("MediumImage_URL")
    public String getMediumImageURL() {
        return mediumImageURL;
    }

    @JsonProperty("MediumImage_URL")
    public void setMediumImageURL(String mediumImageURL) {
        this.mediumImageURL = mediumImageURL;
    }

    @JsonProperty("MediumImage_Width")
    public String getMediumImageWidth() {
        return mediumImageWidth;
    }

    @JsonProperty("MediumImage_Width")
    public void setMediumImageWidth(String mediumImageWidth) {
        this.mediumImageWidth = mediumImageWidth;
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

    @JsonProperty("SalesRank")
    public String getSalesRank() {
        return salesRank;
    }

    @JsonProperty("SalesRank")
    public void setSalesRank(String salesRank) {
        this.salesRank = salesRank;
    }

    @JsonProperty("SmallImage_Height")
    public String getSmallImageHeight() {
        return smallImageHeight;
    }

    @JsonProperty("SmallImage_Height")
    public void setSmallImageHeight(String smallImageHeight) {
        this.smallImageHeight = smallImageHeight;
    }

    @JsonProperty("SmallImage_URL")
    public String getSmallImageURL() {
        return smallImageURL;
    }

    @JsonProperty("SmallImage_URL")
    public void setSmallImageURL(String smallImageURL) {
        this.smallImageURL = smallImageURL;
    }

    @JsonProperty("SmallImage_Width")
    public String getSmallImageWidth() {
        return smallImageWidth;
    }

    @JsonProperty("SmallImage_Width")
    public void setSmallImageWidth(String smallImageWidth) {
        this.smallImageWidth = smallImageWidth;
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

    @JsonProperty("giver_ids")
    public List<String> getGiverIds() {
        return giverIds;
    }

    @JsonProperty("giver_ids")
    public void setGiverIds(List<String> giverIds) {
        this.giverIds = giverIds;
    }

    @JsonProperty("moocher_ids")
    public List<String> getMoocherIds() {
        return moocherIds;
    }

    @JsonProperty("moocher_ids")
    public void setMoocherIds(List<String> moocherIds) {
        this.moocherIds = moocherIds;
    }

    @JsonProperty("transactions")
    public List<String> getTransactions() {
        return transactions;
    }

    @JsonProperty("transactions")
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    @JsonProperty("wishlists_on")
    public List<WishlistsOn> getWishlistsOn() {
        return wishlistsOn;
    }

    @JsonProperty("wishlists_on")
    public void setWishlistsOn(List<WishlistsOn> wishlistsOn) {
        this.wishlistsOn = wishlistsOn;
    }

    @JsonProperty("comments")
    public List<Comment> getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @JsonProperty("bookmooch_recommends")
    public List<String> getBookmoochRecommends() {
        return bookmoochRecommends;
    }

    @JsonProperty("bookmooch_recommends")
    public void setBookmoochRecommends(List<String> bookmoochRecommends) {
        this.bookmoochRecommends = bookmoochRecommends;
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
