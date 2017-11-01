
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

public class Forever implements Serializable, Parcelable
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
    @SerializedName("concurrent")
    @Expose
    private Integer concurrent;
    @SerializedName("players_variance")
    @Expose
    private Integer playersVariance;
    public final static Parcelable.Creator<Forever> CREATOR = new Creator<Forever>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Forever createFromParcel(Parcel in) {
            return new Forever(in);
        }

        public Forever[] newArray(int size) {
            return (new Forever[size]);
        }

    }
    ;
    private final static long serialVersionUID = 455253431461580388L;

    protected Forever(Parcel in) {
        this.average = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.players = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.median = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.concurrent = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.playersVariance = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Forever() {
    }

    /**
     * 
     * @param median
     * @param playersVariance
     * @param concurrent
     * @param players
     * @param average
     */
    public Forever(Integer average, Integer players, Integer median, Integer concurrent, Integer playersVariance) {
        super();
        this.average = average;
        this.players = players;
        this.median = median;
        this.concurrent = concurrent;
        this.playersVariance = playersVariance;
    }

    public Integer getAverage() {
        return average;
    }

    public void setAverage(Integer average) {
        this.average = average;
    }

    public Forever withAverage(Integer average) {
        this.average = average;
        return this;
    }

    public Integer getPlayers() {
        return players;
    }

    public void setPlayers(Integer players) {
        this.players = players;
    }

    public Forever withPlayers(Integer players) {
        this.players = players;
        return this;
    }

    public Integer getMedian() {
        return median;
    }

    public void setMedian(Integer median) {
        this.median = median;
    }

    public Forever withMedian(Integer median) {
        this.median = median;
        return this;
    }

    public Integer getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
    }

    public Forever withConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
        return this;
    }

    public Integer getPlayersVariance() {
        return playersVariance;
    }

    public void setPlayersVariance(Integer playersVariance) {
        this.playersVariance = playersVariance;
    }

    public Forever withPlayersVariance(Integer playersVariance) {
        this.playersVariance = playersVariance;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("average", average).append("players", players).append("median", median).append("concurrent", concurrent).append("playersVariance", playersVariance).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(median).append(playersVariance).append(concurrent).append(players).append(average).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Forever) == false) {
            return false;
        }
        Forever rhs = ((Forever) other);
        return new EqualsBuilder().append(median, rhs.median).append(playersVariance, rhs.playersVariance).append(concurrent, rhs.concurrent).append(players, rhs.players).append(average, rhs.average).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(average);
        dest.writeValue(players);
        dest.writeValue(median);
        dest.writeValue(concurrent);
        dest.writeValue(playersVariance);
    }

    public int describeContents() {
        return  0;
    }

}
