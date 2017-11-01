
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

public class Owners_ implements Serializable, Parcelable
{

    @SerializedName("variance")
    @Expose
    private Integer variance;
    @SerializedName("total")
    @Expose
    private Integer total;
    public final static Parcelable.Creator<Owners_> CREATOR = new Creator<Owners_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Owners_ createFromParcel(Parcel in) {
            return new Owners_(in);
        }

        public Owners_[] newArray(int size) {
            return (new Owners_[size]);
        }

    }
    ;
    private final static long serialVersionUID = -4261678955533679929L;

    protected Owners_(Parcel in) {
        this.variance = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.total = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Owners_() {
    }

    /**
     * 
     * @param total
     * @param variance
     */
    public Owners_(Integer variance, Integer total) {
        super();
        this.variance = variance;
        this.total = total;
    }

    public Integer getVariance() {
        return variance;
    }

    public void setVariance(Integer variance) {
        this.variance = variance;
    }

    public Owners_ withVariance(Integer variance) {
        this.variance = variance;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Owners_ withTotal(Integer total) {
        this.total = total;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("variance", variance).append("total", total).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(total).append(variance).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Owners_) == false) {
            return false;
        }
        Owners_ rhs = ((Owners_) other);
        return new EqualsBuilder().append(total, rhs.total).append(variance, rhs.variance).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(variance);
        dest.writeValue(total);
    }

    public int describeContents() {
        return  0;
    }

}
