package co.com.tallerDDD.Entities;

import co.com.tallerDDD.IDs.RasterId;
import co.com.tallerDDD.Models.Entity;
import co.com.tallerDDD.ValueObjects.GeologicalMetadata;
import co.com.tallerDDD.ValueObjects.MyFile;

import java.util.List;
import java.util.Objects;

public class Raster extends Entity<RasterId> {

    private final RasterId rasterId;
    private final GeologicalMetadata geoMetadata;
    private MyFile rasterFile;

    public Raster(RasterId rasterId,MyFile rasterFile, GeologicalMetadata geoMetadata){
        super(rasterId);
        this.rasterId = Objects.requireNonNull(rasterId);
        this.rasterFile = Objects.requireNonNull(rasterFile);
        this.geoMetadata = Objects.requireNonNull(geoMetadata);
    }

    public RasterId rasterId(){return rasterId;}
    public GeologicalMetadata geologicalMetadata(){return geoMetadata;}

}
