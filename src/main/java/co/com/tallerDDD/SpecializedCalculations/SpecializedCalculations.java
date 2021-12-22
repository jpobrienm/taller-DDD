package co.com.tallerDDD.SpecializedCalculations;

import co.com.tallerDDD.Generics.Operation;
import co.com.tallerDDD.Models.AggregateRoot;
import co.com.tallerDDD.SpecializedCalculations.Value.GeologicalCalculationsId;
import co.com.tallerDDD.SpecializedCalculations.Value.SpecializedCalculationsId;
import co.com.tallerDDD.SpecializedCalculations.Value.StatisticalCalculationsId;

import java.util.Set;

public class SpecializedCalculations extends AggregateRoot<SpecializedCalculationsId> {

    private Set<Operation> operations;
    private GeologicalCalculations geologicalCalculations;
    private StatisticalCalculations statisticalCalculations;

    public SpecializedCalculations(SpecializedCalculationsId specializedCalculationsId){
        super(specializedCalculationsId);
    }

    public void geologicalCalculations(GeologicalCalculationsId geologicalCalculationsId){
        geologicalCalculations = new GeologicalCalculations(geologicalCalculationsId);
        this.applyChange(new GeologicalCalculationsCreated());
    }

    public void statisticalCalculations(StatisticalCalculationsId statisticalCalculationsId){
        statisticalCalculations = new StatisticalCalculations(statisticalCalculationsId);
    }

    public void addOperation(String operation){
        operations.add(new Operation(operation));
    }
}
