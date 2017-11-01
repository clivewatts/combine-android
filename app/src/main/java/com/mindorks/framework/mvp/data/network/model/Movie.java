
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

public class Movie implements Serializable, Parcelable
{

    @SerializedName("480")
    @Expose
    private String _480;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    public final static Parcelable.Creator<Movie> CREATOR = new Creator<Movie>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        public Movie[] newArray(int size) {
            return (new Movie[size]);
        }

    }
    ;
    private final static long serialVersionUID = -5791894742588338743L;

    protected Movie(Parcel in) {
        this._480 = ((String) in.readValue((String.class.getClassLoader())));
        this.thumb = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Movie() {
    }

    /**
     * 
     * @param _480
     * @param thumb
     */
    public Movie(String _480, String thumb) {
        super();
        this._480 = _480;
        this.thumb = thumb;
    }

    public String get480() {
        return _480;
    }

    public void set480(String _480) {
        this._480 = _480;
    }

    public Movie with480(String _480) {
        this._480 = _480;
        return this;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Movie withThumb(String thumb) {
        this.thumb = thumb;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("_480", _480).append("thumb", thumb).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_480).append(thumb).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Movie) == false) {
            return false;
        }
        Movie rhs = ((Movie) other);
        return new EqualsBuilder().append(_480, rhs._480).append(thumb, rhs.thumb).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(_480);
        dest.writeValue(thumb);
    }

    public int describeContents() {
        return  0;
    }

}
