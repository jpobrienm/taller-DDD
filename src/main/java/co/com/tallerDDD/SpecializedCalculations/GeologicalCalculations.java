package co.com.tallerDDD.SpecializedCalculations;

import co.com.tallerDDD.DataHandler.MyRaster;
import co.com.tallerDDD.SpecializedCalculations.Value.GeologicalCalculationsId;
import co.com.tallerDDD.DataHandler.Value.MyRasterId;
import co.com.tallerDDD.Models.Entity;
import co.com.tallerDDD.Generics.GeologicalMetadata;
import co.com.tallerDDD.Generics.Operation;

import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;

public class GeologicalCalculations extends Entity<GeologicalCalculationsId> {

    private Set<Operation> operations;
    private Set<MyRaster> rasterSet;

    public GeologicalCalculations(GeologicalCalculationsId geologicalCalculationsId){
        super(geologicalCalculationsId);
    }

    public void createOperation(String operation){
        operations.add(Operation.of(operation));
    }

    public void removeOperation(Operation operation){
        operations = operations.stream().filter(o -> !o.operationEquals(operation)).collect(Collectors.toSet());
    }

    public void addRaster(Path rasterPath, GeologicalMetadata geologicalMetadata){
        rasterSet.add(new MyRaster(new MyRasterId(), rasterPath, geologicalMetadata));
    }

    public void removeRaster(MyRaster myRaster){
        rasterSet = rasterSet.stream().filter(r -> !r.equalRaster(myRaster)).collect(Collectors.toSet());
    }
}
