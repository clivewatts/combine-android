
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

public class _2weeks implements Serializable, Parcelable
{

    @SerializedName("average")
    @Expose
    private Integer average;
    @SerializedName("players")
    @Expose
    private Integer players;
    @SerializedName("median")
    @Expose
    private Integer median;
    @SerializedName("players_variance")
    @Expose
    private Integer playersVariance;
    public final static Parcelable.Creator<_2weeks> CREATOR = new Creator<_2weeks>() {


        @SuppressWarnings({
            "unchecked"
        })
        public _2weeks createFromParcel(Parcel in) {
            return new _2weeks(in);
        }

        public _2weeks[] newArray(int size) {
            return (new _2weeks[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8116679313598978066L;

    protected _2weeks(Parcel in) {
        this.average = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.players = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.median = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.playersVariance = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public _2weeks() {
    }

    /**
     * 
     * @param median
     * @param playersVariance
     * @param players
     * @param average
     */
    public _2weeks(Integer average, Integer players, Integer median, Integer playersVariance) {
        super();
        this.average = average;
        this.players = players;
        this.median = median;
        this.playersVariance = playersVariance;
    }

    public Integer getAverage() {
        return average;
    }

    public void setAverage(Integer average) {
        this.average = average;
    }

    public _2weeks withAverage(Integer average) {
        this.average = average;
        return this;
    }

    public Integer getPlayers() {
        return players;
    }

    public void setPlayers(Integer players) {
        this.players = players;
    }

    public _2weeks withPlayers(Integer players) {
        this.players = players;
        return this;
    }

    public Integer getMedian() {
        return median;
    }

    public void setMedian(Integer median) {
        this.median = median;
    }

    public _2weeks withMedian(Integer median) {
        this.median = median;
        return this;
    }

    public Integer getPlayersVariance() {
        return playersVariance;
    }

    public void setPlayersVariance(Integer playersVariance) {
        this.playersVariance = playersVariance;
    }

    public _2weeks withPlayersVariance(Integer playersVariance) {
        this.playersVariance = playersVariance;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("average", average).append("players", players).append("median", median).append("playersVariance", playersVariance).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(median).append(playersVariance).append(players).append(average).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _2weeks) == false) {
            return false;
        }
        _2weeks rhs = ((_2weeks) other);
        return new EqualsBuilder().append(median, rhs.median).append(playersVariance, rhs.playersVariance).append(players, rhs.players).append(average, rhs.average).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(average);
        dest.writeValue(players);
        dest.writeValue(median);
        dest.writeValue(playersVariance);
    }

    public int describeContents() {
        return  0;
    }

}
