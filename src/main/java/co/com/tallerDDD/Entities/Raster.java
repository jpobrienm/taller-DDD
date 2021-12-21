package co.com.tallerDDD.Entities;

import co.com.tallerDDD.IDs.RasterId;
import co.com.tallerDDD.Models.Entity;
import co.com.tallerDDD.ValueObjects.GeologicalMetadata;
import co.com.tallerDDD.ValueObjects.MyFile;
import co.com.tallerDDD.ValueObjects.MyPath;

import java.lang.management.ThreadInfo;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class Raster extends Entity<RasterId> {

    private GeologicalMetadata geoMetadata;
    private MyPath rasterPath;

    public Raster(RasterId rasterId, MyPath rasterPath, GeologicalMetadata geoMetadata){
        super(rasterId);
        this.rasterPath = Objects.requireNonNull(rasterPath);
        this.geoMetadata = Objects.requireNonNull(geoMetadata);
    }

    public void changeRasterFile(MyPath rasterPath){this.rasterPath = rasterPath;}
    public void changeGeologicalMetadata(GeologicalMetadata geoMetadata){this.geoMetadata = geoMetadata;}

    public GeologicalMetadata geologicalMetadata(){return geoMetadata;}
    public MyPath getRasterFile(){return rasterPath;}

}
