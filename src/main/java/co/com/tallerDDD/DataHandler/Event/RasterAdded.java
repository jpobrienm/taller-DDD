package co.com.tallerDDD.DataHandler.Event;

import co.com.tallerDDD.Generics.GeologicalMetadata;
import co.com.tallerDDD.Models.DomainEvent;

import java.nio.file.Path;

public class RasterAdded extends DomainEvent {

    private final Path rasterPath;
    private final GeologicalMetadata geologicalMetadata;

    public RasterAdded(Path rasterPath, GeologicalMetadata geologicalMetadata){
        super("sofka.DataHandler.RasterAdded");
        this.rasterPath = rasterPath;
        this.geologicalMetadata = geologicalMetadata;
    }

    public Path getRasterPath(){return rasterPath;}
    public GeologicalMetadata getGeologicalMetadata(){return geologicalMetadata;}

}
