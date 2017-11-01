
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

public class Dates implements Serializable, Parcelable
{

    @SerializedName("end")
    @Expose
    private Integer end;
    @SerializedName("start")
    @Expose
    private Integer start;
    public final static Parcelable.Creator<Dates> CREATOR = new Creator<Dates>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Dates createFromParcel(Parcel in) {
            return new Dates(in);
        }

        public Dates[] newArray(int size) {
            return (new Dates[size]);
        }

    }
    ;
    private final static long serialVersionUID = 9197677060694551557L;

    protected Dates(Parcel in) {
        this.end = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.start = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dates() {
    }

    /**
     * 
     * @param start
     * @param end
     */
    public Dates(Integer end, Integer start) {
        super();
        this.end = end;
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Dates withEnd(Integer end) {
        this.end = end;
        return this;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Dates withStart(Integer start) {
        this.start = start;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("end", end).append("start", start).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(start).append(end).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dates) == false) {
            return false;
        }
        Dates rhs = ((Dates) other);
        return new EqualsBuilder().append(start, rhs.start).append(end, rhs.end).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(end);
        dest.writeValue(start);
    }

    public int describeContents() {
        return  0;
    }

}
