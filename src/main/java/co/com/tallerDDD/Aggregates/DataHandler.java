package co.com.tallerDDD.Aggregates;

import co.com.tallerDDD.Entities.MyRaster;
import co.com.tallerDDD.Entities.Repository;
import co.com.tallerDDD.Entities.Table;
import co.com.tallerDDD.IDs.*;
import co.com.tallerDDD.Models.AggregateRoot;
import co.com.tallerDDD.ValueObjects.GeologicalMetadata;

import java.awt.image.Raster;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class DataHandler extends AggregateRoot<DataHandlerId>{

    private final FileHandlerId fileHandlerId;
    private FileHandler fileHandler;
    private Repository repository;

    private Set<MyRaster> rasterSet;
    private Set<Table> tableSet;


    public DataHandler(DataHandlerId dataHandlerId, FileHandlerId fileHandlerId){
        super(dataHandlerId);
        this.fileHandlerId = Objects.requireNonNull(fileHandlerId, "Es necesario un repositorio");
        this.fileHandler = new FileHandler(this.fileHandlerId);
    }

    public void fetchRepository(){
        repository = fileHandler.fileHandlerRepository();
    }

    public void addRaster(Path rasterPath, GeologicalMetadata geologicalMetadata){
        rasterSet.add(new MyRaster(new MyRasterId(), rasterPath, geologicalMetadata));
    }

    public void removeRaster(MyRaster myRaster){
        rasterSet = rasterSet.stream().filter(r -> !r.equalRaster(myRaster)).collect(Collectors.toSet());
    }

}
