package co.com.tallerDDD.Entities;

import co.com.tallerDDD.IDs.GeologicalCalculationsId;
import co.com.tallerDDD.Models.Entity;
import co.com.tallerDDD.ValueObjects.Operation;

import java.awt.image.Raster;
import java.nio.file.Path;
import java.util.Set;

public class GeologicalCalculations extends Entity<GeologicalCalculationsId> {

    private Set<Operation> operations;
    private Set<Raster> rasterSet;

    public GeologicalCalculations(GeologicalCalculationsId geologicalCalculationsId){
        super(geologicalCalculationsId);
    }

    public void createOperation(String operation){
        operations.add(Operation.of(operation));
    }

    
}
