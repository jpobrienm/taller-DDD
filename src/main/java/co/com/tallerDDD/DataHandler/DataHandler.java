package co.com.tallerDDD.DataHandler;

import co.com.tallerDDD.DataHandler.Value.DataHandlerId;
import co.com.tallerDDD.DataHandler.Value.MyRasterId;
import co.com.tallerDDD.DataHandler.Value.TableId;
import co.com.tallerDDD.FileHandler.FileHandler;
import co.com.tallerDDD.FileHandler.Repository;
import co.com.tallerDDD.FileHandler.Value.FileHandlerId;
import co.com.tallerDDD.Models.AggregateRoot;
import co.com.tallerDDD.Generics.GeologicalMetadata;

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

    public void addTable(Path tablePath){
        tableSet.add(new Table(new TableId(), tablePath));
    }

    public void removeTable(Table myTable){
        tableSet = tableSet.stream().filter(t -> !t.tableEquals(myTable)).collect(Collectors.toSet());
    }

}
