package co.com.tallerDDD.DataHandler.Command;

import co.com.sofka.domain.generic.Command;
import co.com.tallerDDD.Generics.GeologicalMetadata;

import java.nio.file.Path;

public class AddRaster extends Command {
    private final Path rasterPath;
    private final GeologicalMetadata geologicalMetadata;

    public AddRaster(Path rasterPath, GeologicalMetadata geologicalMetadata){
        this.rasterPath = rasterPath;
        this.geologicalMetadata = geologicalMetadata;
    }

    public Path getRasterPath(){return rasterPath;}
    public GeologicalMetadata getGeologicalMetadata(){return geologicalMetadata;}
}
