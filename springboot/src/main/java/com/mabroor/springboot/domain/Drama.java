
package com.mabroor.springboot.domain;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "url",
    "name",
    "type",
    "language",
    "genres",
    "status",
    "runtime",
    "averageRuntime",
    "premiered",
    "ended",
    "officialSite",
    "schedule",
    "rating",
    "weight",
    "network",
    "webChannel",
    "dvdCountry",
    "externals",
    "image",
    "summary",
    "updated",
    "_links"
})
@Generated("jsonschema2pojo")
public class Drama {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("language")
    private String language;
    @JsonProperty("genres")
    private List<String> genres;
    @JsonProperty("status")
    private String status;
    @JsonProperty("runtime")
    private Integer runtime;
    @JsonProperty("averageRuntime")
    private Integer averageRuntime;
    @JsonProperty("premiered")
    private String premiered;
    @JsonProperty("ended")
    private String ended;
    @JsonProperty("officialSite")
    private String officialSite;
    @JsonProperty("schedule")
    private Schedule schedule;
    @JsonProperty("rating")
    private Rating rating;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("network")
    private Network network;
    @JsonProperty("webChannel")
    private Object webChannel;
    @JsonProperty("dvdCountry")
    private Object dvdCountry;
    @JsonProperty("externals")
    private Externals externals;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("updated")
    private Integer updated;
    @JsonProperty("_links")
    private Links links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("genres")
    public List<String> getGenres() {
        return genres;
    }

    @JsonProperty("genres")
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("runtime")
    public Integer getRuntime() {
        return runtime;
    }

    @JsonProperty("runtime")
    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    @JsonProperty("averageRuntime")
    public Integer getAverageRuntime() {
        return averageRuntime;
    }

    @JsonProperty("averageRuntime")
    public void setAverageRuntime(Integer averageRuntime) {
        this.averageRuntime = averageRuntime;
    }

    @JsonProperty("premiered")
    public String getPremiered() {
        return premiered;
    }

    @JsonProperty("premiered")
    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }

    @JsonProperty("ended")
    public String getEnded() {
        return ended;
    }

    @JsonProperty("ended")
    public void setEnded(String ended) {
        this.ended = ended;
    }

    @JsonProperty("officialSite")
    public String getOfficialSite() {
        return officialSite;
    }

    @JsonProperty("officialSite")
    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

    @JsonProperty("schedule")
    public Schedule getSchedule() {
        return schedule;
    }

    @JsonProperty("schedule")
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @JsonProperty("rating")
    public Rating getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @JsonProperty("network")
    public Network getNetwork() {
        return network;
    }

    @JsonProperty("network")
    public void setNetwork(Network network) {
        this.network = network;
    }

    @JsonProperty("webChannel")
    public Object getWebChannel() {
        return webChannel;
    }

    @JsonProperty("webChannel")
    public void setWebChannel(Object webChannel) {
        this.webChannel = webChannel;
    }

    @JsonProperty("dvdCountry")
    public Object getDvdCountry() {
        return dvdCountry;
    }

    @JsonProperty("dvdCountry")
    public void setDvdCountry(Object dvdCountry) {
        this.dvdCountry = dvdCountry;
    }

    @JsonProperty("externals")
    public Externals getExternals() {
        return externals;
    }

    @JsonProperty("externals")
    public void setExternals(Externals externals) {
        this.externals = externals;
    }

    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("updated")
    public Integer getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
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
