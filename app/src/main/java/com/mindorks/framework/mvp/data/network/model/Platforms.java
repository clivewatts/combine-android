
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

public class Platforms implements Serializable, Parcelable
{

    @SerializedName("linux")
    @Expose
    private Boolean linux;
    @SerializedName("mac")
    @Expose
    private Boolean mac;
    @SerializedName("windows")
    @Expose
    private Boolean windows;
    public final static Parcelable.Creator<Platforms> CREATOR = new Creator<Platforms>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Platforms createFromParcel(Parcel in) {
            return new Platforms(in);
        }

        public Platforms[] newArray(int size) {
            return (new Platforms[size]);
        }

    }
    ;
    private final static long serialVersionUID = -4070962638680896161L;

    protected Platforms(Parcel in) {
        this.linux = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.mac = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.windows = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Platforms() {
    }

    /**
     * 
     * @param windows
     * @param mac
     * @param linux
     */
    public Platforms(Boolean linux, Boolean mac, Boolean windows) {
        super();
        this.linux = linux;
        this.mac = mac;
        this.windows = windows;
    }

    public Boolean getLinux() {
        return linux;
    }

    public void setLinux(Boolean linux) {
        this.linux = linux;
    }

    public Platforms withLinux(Boolean linux) {
        this.linux = linux;
        return this;
    }

    public Boolean getMac() {
        return mac;
    }

    public void setMac(Boolean mac) {
        this.mac = mac;
    }

    public Platforms withMac(Boolean mac) {
        this.mac = mac;
        return this;
    }

    public Boolean getWindows() {
        return windows;
    }

    public void setWindows(Boolean windows) {
        this.windows = windows;
    }

    public Platforms withWindows(Boolean windows) {
        this.windows = windows;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("linux", linux).append("mac", mac).append("windows", windows).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(windows).append(mac).append(linux).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Platforms) == false) {
            return false;
        }
        Platforms rhs = ((Platforms) other);
        return new EqualsBuilder().append(windows, rhs.windows).append(mac, rhs.mac).append(linux, rhs.linux).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(linux);
        dest.writeValue(mac);
        dest.writeValue(windows);
    }

    public int describeContents() {
        return  0;
    }

}
