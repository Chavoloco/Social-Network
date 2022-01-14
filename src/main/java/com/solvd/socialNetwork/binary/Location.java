package com.solvd.socialNetwork.binary;

import com.solvd.socialNetwork.utils.dateAdapter.TimeZoneAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@XmlRootElement(name = "location")
public class Location {
    //@XmlAttribute(name = "id")
    private long id;
    //@XmlElement(name = "city")
    private Cities city;
    //@XmlElement(name = "country")
    private Countries country;
    //@XmlElement(name = "state")
    private States state;
    //@XmlElement(name = "time_zone")
    //@XmlJavaTypeAdapter(TimeZoneAdapter.class)
    private Date timeZone;

    public Location() {
    }

    public Location(long id, Cities city, Countries country, States state, Date timeZone) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.state = state;
        this.timeZone = timeZone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = country;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }

    public Date getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(Date timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", city=" + city.getName() +
                ", country=" + country.getName() +
                ", state=" + state.getName() +
                ", time zone=" + timeZone +
                '}';
    }
}
