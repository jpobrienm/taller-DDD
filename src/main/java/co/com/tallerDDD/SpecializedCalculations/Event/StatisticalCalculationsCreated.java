package co.com.tallerDDD.SpecializedCalculations.Event;

import co.com.tallerDDD.Models.DomainEvent;
import co.com.tallerDDD.SpecializedCalculations.StatisticalCalculations;
import co.com.tallerDDD.SpecializedCalculations.Value.StatisticalCalculationsId;

public class StatisticalCalculationsCreated extends DomainEvent {

    private final StatisticalCalculationsId statisticalCalculationsId;

    public StatisticalCalculationsCreated(StatisticalCalculationsId statisticalCalculationsId){
        super("sofka.SpecializedCalculations.StatisticalCalculationsCreated");
        this.statisticalCalculationsId = statisticalCalculationsId;
    }

    public StatisticalCalculationsId getStatisticalCalculationsId(){return statisticalCalculationsId;}
}
