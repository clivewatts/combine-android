
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

public class Owners implements Serializable, Parcelable
{

    @SerializedName("tags")
    @Expose
    private List<Tag> tags = new ArrayList<Tag>();
    @SerializedName("forever")
    @Expose
    private Forever forever;
    @SerializedName("2weeks")
    @Expose
    private com.mindorks.framework.mvp.data.network.model._2weeks _2weeks;
    @SerializedName("owners")
    @Expose
    private Owners_ owners;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    public final static Parcelable.Creator<Owners> CREATOR = new Creator<Owners>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Owners createFromParcel(Parcel in) {
            return new Owners(in);
        }

        public Owners[] newArray(int size) {
            return (new Owners[size]);
        }

    }
    ;
    private final static long serialVersionUID = 4483756473337215654L;

    protected Owners(Parcel in) {
        in.readList(this.tags, (com.mindorks.framework.mvp.data.network.model.Tag.class.getClassLoader()));
        this.forever = ((Forever) in.readValue((Forever.class.getClassLoader())));
        this._2weeks = ((com.mindorks.framework.mvp.data.network.model._2weeks) in.readValue((_2weeks.class.getClassLoader())));
        this.owners = ((Owners_) in.readValue((Owners_.class.getClassLoader())));
        this.rank = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Owners() {
    }

    /**
     * 
     * @param tags
     * @param rank
     * @param forever
     * @param _2weeks
     * @param owners
     */
    public Owners(List<Tag> tags, Forever forever, com.mindorks.framework.mvp.data.network.model._2weeks _2weeks, Owners_ owners, Integer rank) {
        super();
        this.tags = tags;
        this.forever = forever;
        this._2weeks = _2weeks;
        this.owners = owners;
        this.rank = rank;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Owners withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public Forever getForever() {
        return forever;
    }

    public void setForever(Forever forever) {
        this.forever = forever;
    }

    public Owners withForever(Forever forever) {
        this.forever = forever;
        return this;
    }

    public com.mindorks.framework.mvp.data.network.model._2weeks get2weeks() {
        return _2weeks;
    }

    public void set2weeks(com.mindorks.framework.mvp.data.network.model._2weeks _2weeks) {
        this._2weeks = _2weeks;
    }

    public Owners with2weeks(com.mindorks.framework.mvp.data.network.model._2weeks _2weeks) {
        this._2weeks = _2weeks;
        return this;
    }

    public Owners_ getOwners() {
        return owners;
    }

    public void setOwners(Owners_ owners) {
        this.owners = owners;
    }

    public Owners withOwners(Owners_ owners) {
        this.owners = owners;
        return this;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Owners withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tags", tags).append("forever", forever).append("_2weeks", _2weeks).append("owners", owners).append("rank", rank).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tags).append(rank).append(forever).append(_2weeks).append(owners).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Owners) == false) {
            return false;
        }
        Owners rhs = ((Owners) other);
        return new EqualsBuilder().append(tags, rhs.tags).append(rank, rhs.rank).append(forever, rhs.forever).append(_2weeks, rhs._2weeks).append(owners, rhs.owners).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(tags);
        dest.writeValue(forever);
        dest.writeValue(_2weeks);
        dest.writeValue(owners);
        dest.writeValue(rank);
    }

    public int describeContents() {
        return  0;
    }

}
