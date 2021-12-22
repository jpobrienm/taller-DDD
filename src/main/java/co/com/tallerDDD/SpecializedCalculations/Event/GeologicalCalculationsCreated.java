package co.com.tallerDDD.SpecializedCalculations.Event;

import co.com.tallerDDD.Models.DomainEvent;
import co.com.tallerDDD.SpecializedCalculations.Value.GeologicalCalculationsId;

public class GeologicalCalculationsCreated extends DomainEvent {

    private final GeologicalCalculationsId geologicalCalculationsId;

    public GeologicalCalculationsCreated(GeologicalCalculationsId geologicalCalculationsId){
        super("sofka.SpecializedCalculations.GeologicalCalculationsCreted");
        this.geologicalCalculationsId = geologicalCalculationsId;
    }

    public GeologicalCalculationsId getGeologicalCalculationsId(){return geologicalCalculationsId;}

}
