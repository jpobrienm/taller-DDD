package co.com.tallerDDD.SpecializedCalculations.Command;

import co.com.sofka.domain.generic.Command;
import co.com.tallerDDD.SpecializedCalculations.Value.GeologicalCalculationsId;

public class CreateGeologicalCalculations extends Command {
    private final GeologicalCalculationsId geologicalCalculationsId;

    public CreateGeologicalCalculations(GeologicalCalculationsId geologicalCalculationsId){
        this.geologicalCalculationsId = geologicalCalculationsId;
    }

    public GeologicalCalculationsId getGeologicalCalculationsId(){return geologicalCalculationsId;}
}
