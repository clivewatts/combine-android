
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

public class CombineCollection implements Serializable, Parcelable
{

    @SerializedName("apps")
    @Expose
    private List<App> apps = new ArrayList<App>();
    @SerializedName("total")
    @Expose
    private Integer total;
    public final static Parcelable.Creator<CombineCollection> CREATOR = new Creator<CombineCollection>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CombineCollection createFromParcel(Parcel in) {
            return new CombineCollection(in);
        }

        public CombineCollection[] newArray(int size) {
            return (new CombineCollection[size]);
        }

    }
    ;
    private final static long serialVersionUID = 4259994845851775950L;

    protected CombineCollection(Parcel in) {
        in.readList(this.apps, (com.mindorks.framework.mvp.data.network.model.App.class.getClassLoader()));
        this.total = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public CombineCollection() {
    }

    /**
     * 
     * @param total
     * @param apps
     */
    public CombineCollection(List<App> apps, Integer total) {
        super();
        this.apps = apps;
        this.total = total;
    }

    public List<App> getApps() {
        return apps;
    }

    public void setApps(List<App> apps) {
        this.apps = apps;
    }

    public CombineCollection withApps(List<App> apps) {
        this.apps = apps;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public CombineCollection withTotal(Integer total) {
        this.total = total;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("apps", apps).append("total", total).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(total).append(apps).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CombineCollection) == false) {
            return false;
        }
        CombineCollection rhs = ((CombineCollection) other);
        return new EqualsBuilder().append(total, rhs.total).append(apps, rhs.apps).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(apps);
        dest.writeValue(total);
    }

    public int describeContents() {
        return  0;
    }

}
