package co.com.tallerDDD.Generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GeologicalMetadata implements Serializable {

    private final List<String> geoMetadata;

    public GeologicalMetadata(Integer cellSize, Integer origin, Integer xCoord, Integer yCoord, String geometry){
        geoMetadata = new ArrayList<>();
        geoMetadata.add(cellSize.toString());
        geoMetadata.add(origin.toString());
        geoMetadata.add(xCoord.toString());
        geoMetadata.add(xCoord.toString());
        geoMetadata.add(yCoord.toString());
        geoMetadata.add(geometry);
    }

    public List<String> getGeoMetadata() {return geoMetadata;}
}
