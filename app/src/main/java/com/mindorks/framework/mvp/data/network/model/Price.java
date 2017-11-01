
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

public class Price implements Serializable, Parcelable
{

    @SerializedName("initial")
    @Expose
    private Integer initial;
    @SerializedName("discount_percent")
    @Expose
    private Integer discountPercent;
    @SerializedName("final")
    @Expose
    private Integer _final;
    @SerializedName("currency")
    @Expose
    private String currency;
    public final static Parcelable.Creator<Price> CREATOR = new Creator<Price>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Price createFromParcel(Parcel in) {
            return new Price(in);
        }

        public Price[] newArray(int size) {
            return (new Price[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3422400686336617381L;

    protected Price(Parcel in) {
        this.initial = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.discountPercent = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this._final = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.currency = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Price() {
    }

    /**
     * 
     * @param _final
     * @param initial
     * @param discountPercent
     * @param currency
     */
    public Price(Integer initial, Integer discountPercent, Integer _final, String currency) {
        super();
        this.initial = initial;
        this.discountPercent = discountPercent;
        this._final = _final;
        this.currency = currency;
    }

    public Integer getInitial() {
        return initial;
    }

    public void setInitial(Integer initial) {
        this.initial = initial;
    }

    public Price withInitial(Integer initial) {
        this.initial = initial;
        return this;
    }

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Price withDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }

    public Integer getFinal() {
        return _final;
    }

    public void setFinal(Integer _final) {
        this._final = _final;
    }

    public Price withFinal(Integer _final) {
        this._final = _final;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Price withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("initial", initial).append("discountPercent", discountPercent).append("_final", _final).append("currency", currency).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_final).append(initial).append(discountPercent).append(currency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Price) == false) {
            return false;
        }
        Price rhs = ((Price) other);
        return new EqualsBuilder().append(_final, rhs._final).append(initial, rhs.initial).append(discountPercent, rhs.discountPercent).append(currency, rhs.currency).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(initial);
        dest.writeValue(discountPercent);
        dest.writeValue(_final);
        dest.writeValue(currency);
    }

    public int describeContents() {
        return  0;
    }

}
