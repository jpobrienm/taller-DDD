package co.com.tallerDDD.ValueObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GeologicalMetadata {

    private final List<String> geoMetadata;

    public GeologicalMetadata(String origin, String xCoord, String yCoord, String geometry){
        geoMetadata = new ArrayList<>();
        geoMetadata.add(origin);
        geoMetadata.add(xCoord);
        geoMetadata.add(xCoord);
        geoMetadata.add(yCoord);
        geoMetadata.add(geometry);
    }

    public List<String> getGeoMetadata() {return geoMetadata;}
}
