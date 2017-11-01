
package com.mindorks.framework.mvp.data.network.model;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class App implements Serializable, Parcelable
{

    @SerializedName("details")
    @Expose
    private Details details;
    @SerializedName("reviews")
    @Expose
    private Reviews reviews;
    @SerializedName("owners")
    @Expose
    private Owners owners;
    public final static Parcelable.Creator<App> CREATOR = new Creator<App>() {


        @SuppressWarnings({
            "unchecked"
        })
        public App createFromParcel(Parcel in) {
            return new App(in);
        }

        public App[] newArray(int size) {
            return (new App[size]);
        }

    }
    ;
    private final static long serialVersionUID = 1082504097579846194L;

    protected App(Parcel in) {
        this.details = ((Details) in.readValue((Details.class.getClassLoader())));
        this.reviews = ((Reviews) in.readValue((Reviews.class.getClassLoader())));
        this.owners = ((Owners) in.readValue((Owners.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public App() {
    }

    /**
     * 
     * @param reviews
     * @param details
     * @param owners
     */
    public App(Details details, Reviews reviews, Owners owners) {
        super();
        this.details = details;
        this.reviews = reviews;
        this.owners = owners;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public App withDetails(Details details) {
        this.details = details;
        return this;
    }

    public Reviews getReviews() {
        return reviews;
    }

    public void setReviews(Reviews reviews) {
        this.reviews = reviews;
    }

    public App withReviews(Reviews reviews) {
        this.reviews = reviews;
        return this;
    }

    public Owners getOwners() {
        return owners;
    }

    public void setOwners(Owners owners) {
        this.owners = owners;
    }

    public App withOwners(Owners owners) {
        this.owners = owners;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("details", details).append("reviews", reviews).append("owners", owners).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(reviews).append(details).append(owners).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof App) == false) {
            return false;
        }
        App rhs = ((App) other);
        return new EqualsBuilder().append(reviews, rhs.reviews).append(details, rhs.details).append(owners, rhs.owners).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(details);
        dest.writeValue(reviews);
        dest.writeValue(owners);
    }

    public int describeContents() {
        return  0;
    }

}
