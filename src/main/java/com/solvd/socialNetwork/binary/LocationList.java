package com.solvd.socialNetwork.binary;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="locations")
public class LocationList {
    @XmlElementWrapper(name = "locations")
    private List<Location> locations;

    public LocationList(List<Location> locations) {
        this.locations = locations;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
