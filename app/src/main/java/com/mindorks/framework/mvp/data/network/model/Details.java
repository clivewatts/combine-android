
package com.mindorks.framework.mvp.data.network.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Details implements Serializable, Parcelable
{

    @SerializedName("is_free")
    @Expose
    private Boolean isFree;
    @SerializedName("movies")
    @Expose
    private List<Movie> movies = new ArrayList<Movie>();
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("platforms")
    @Expose
    private Platforms platforms;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("screenshots")
    @Expose
    private List<String> screenshots = new ArrayList<String>();
    @SerializedName("appid")
    @Expose
    private Integer appid;
    @SerializedName("release_date")
    @Expose
    private String releaseDate;
    public final static Parcelable.Creator<Details> CREATOR = new Creator<Details>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Details createFromParcel(Parcel in) {
            return new Details(in);
        }

        public Details[] newArray(int size) {
            return (new Details[size]);
        }

    }
    ;
    private final static long serialVersionUID = 744033479821478335L;

    protected Details(Parcel in) {
        this.isFree = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        in.readList(this.movies, (com.mindorks.framework.mvp.data.network.model.Movie.class.getClassLoader()));
        this.price = ((Price) in.readValue((Price.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.shortDescription = ((String) in.readValue((String.class.getClassLoader())));
        this.platforms = ((Platforms) in.readValue((Platforms.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.screenshots, (java.lang.String.class.getClassLoader()));
        this.appid = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.releaseDate = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Details() {
    }

    /**
     * 
     * @param releaseDate
     * @param price
     * @param shortDescription
     * @param isFree
     * @param screenshots
     * @param name
     * @param movies
     * @param appid
     * @param platforms
     * @param type
     */
    public Details(Boolean isFree, List<Movie> movies, Price price, String name, String shortDescription, Platforms platforms, String type, List<String> screenshots, Integer appid, String releaseDate) {
        super();
        this.isFree = isFree;
        this.movies = movies;
        this.price = price;
        this.name = name;
        this.shortDescription = shortDescription;
        this.platforms = platforms;
        this.type = type;
        this.screenshots = screenshots;
        this.appid = appid;
        this.releaseDate = releaseDate;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public Details withIsFree(Boolean isFree) {
        this.isFree = isFree;
        return this;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Details withMovies(List<Movie> movies) {
        this.movies = movies;
        return this;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Details withPrice(Price price) {
        this.price = price;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Details withName(String name) {
        this.name = name;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Details withShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public Platforms getPlatforms() {
        return platforms;
    }

    public void setPlatforms(Platforms platforms) {
        this.platforms = platforms;
    }

    public Details withPlatforms(Platforms platforms) {
        this.platforms = platforms;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Details withType(String type) {
        this.type = type;
        return this;
    }

    public List<String> getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(List<String> screenshots) {
        this.screenshots = screenshots;
    }

    public Details withScreenshots(List<String> screenshots) {
        this.screenshots = screenshots;
        return this;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public Details withAppid(Integer appid) {
        this.appid = appid;
        return this;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Details withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isFree", isFree).append("movies", movies).append("price", price).append("name", name).append("shortDescription", shortDescription).append("platforms", platforms).append("type", type).append("screenshots", screenshots).append("appid", appid).append("releaseDate", releaseDate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(releaseDate).append(price).append(shortDescription).append(isFree).append(screenshots).append(name).append(movies).append(appid).append(platforms).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Details) == false) {
            return false;
        }
        Details rhs = ((Details) other);
        return new EqualsBuilder().append(releaseDate, rhs.releaseDate).append(price, rhs.price).append(shortDescription, rhs.shortDescription).append(isFree, rhs.isFree).append(screenshots, rhs.screenshots).append(name, rhs.name).append(movies, rhs.movies).append(appid, rhs.appid).append(platforms, rhs.platforms).append(type, rhs.type).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(isFree);
        dest.writeList(movies);
        dest.writeValue(price);
        dest.writeValue(name);
        dest.writeValue(shortDescription);
        dest.writeValue(platforms);
        dest.writeValue(type);
        dest.writeList(screenshots);
        dest.writeValue(appid);
        dest.writeValue(releaseDate);
    }

    public int describeContents() {
        return  0;
    }

}
