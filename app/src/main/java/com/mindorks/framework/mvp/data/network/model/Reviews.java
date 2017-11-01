
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

public class Reviews implements Serializable, Parcelable
{

    @SerializedName("summary")
    @Expose
    private Summary summary;
    @SerializedName("dates")
    @Expose
    private Dates dates;
    public final static Parcelable.Creator<Reviews> CREATOR = new Creator<Reviews>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Reviews createFromParcel(Parcel in) {
            return new Reviews(in);
        }

        public Reviews[] newArray(int size) {
            return (new Reviews[size]);
        }

    }
    ;
    private final static long serialVersionUID = -8105976383644624509L;

    protected Reviews(Parcel in) {
        this.summary = ((Summary) in.readValue((Summary.class.getClassLoader())));
        this.dates = ((Dates) in.readValue((Dates.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Reviews() {
    }

    /**
     * 
     * @param summary
     * @param dates
     */
    public Reviews(Summary summary, Dates dates) {
        super();
        this.summary = summary;
        this.dates = dates;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public Reviews withSummary(Summary summary) {
        this.summary = summary;
        return this;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public Reviews withDates(Dates dates) {
        this.dates = dates;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("summary", summary).append("dates", dates).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(summary).append(dates).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reviews) == false) {
            return false;
        }
        Reviews rhs = ((Reviews) other);
        return new EqualsBuilder().append(summary, rhs.summary).append(dates, rhs.dates).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(summary);
        dest.writeValue(dates);
    }

    public int describeContents() {
        return  0;
    }

}
