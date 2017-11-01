
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

public class Summary implements Serializable, Parcelable
{

    @SerializedName("sentiment")
    @Expose
    private String sentiment;
    @SerializedName("negative")
    @Expose
    private Integer negative;
    @SerializedName("reviews")
    @Expose
    private Integer reviews;
    @SerializedName("positive")
    @Expose
    private Integer positive;
    @SerializedName("class")
    @Expose
    private String _class;
    public final static Parcelable.Creator<Summary> CREATOR = new Creator<Summary>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Summary createFromParcel(Parcel in) {
            return new Summary(in);
        }

        public Summary[] newArray(int size) {
            return (new Summary[size]);
        }

    }
    ;
    private final static long serialVersionUID = 4972552521375056070L;

    protected Summary(Parcel in) {
        this.sentiment = ((String) in.readValue((String.class.getClassLoader())));
        this.negative = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.reviews = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.positive = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this._class = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Summary() {
    }

    /**
     * 
     * @param sentiment
     * @param reviews
     * @param _class
     * @param negative
     * @param positive
     */
    public Summary(String sentiment, Integer negative, Integer reviews, Integer positive, String _class) {
        super();
        this.sentiment = sentiment;
        this.negative = negative;
        this.reviews = reviews;
        this.positive = positive;
        this._class = _class;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public Summary withSentiment(String sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    public Integer getNegative() {
        return negative;
    }

    public void setNegative(Integer negative) {
        this.negative = negative;
    }

    public Summary withNegative(Integer negative) {
        this.negative = negative;
        return this;
    }

    public Integer getReviews() {
        return reviews;
    }

    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }

    public Summary withReviews(Integer reviews) {
        this.reviews = reviews;
        return this;
    }

    public Integer getPositive() {
        return positive;
    }

    public void setPositive(Integer positive) {
        this.positive = positive;
    }

    public Summary withPositive(Integer positive) {
        this.positive = positive;
        return this;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public Summary withClass(String _class) {
        this._class = _class;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sentiment", sentiment).append("negative", negative).append("reviews", reviews).append("positive", positive).append("_class", _class).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sentiment).append(reviews).append(_class).append(negative).append(positive).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Summary) == false) {
            return false;
        }
        Summary rhs = ((Summary) other);
        return new EqualsBuilder().append(sentiment, rhs.sentiment).append(reviews, rhs.reviews).append(_class, rhs._class).append(negative, rhs.negative).append(positive, rhs.positive).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(sentiment);
        dest.writeValue(negative);
        dest.writeValue(reviews);
        dest.writeValue(positive);
        dest.writeValue(_class);
    }

    public int describeContents() {
        return  0;
    }

}
