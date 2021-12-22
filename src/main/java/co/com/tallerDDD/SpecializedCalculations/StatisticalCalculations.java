package co.com.tallerDDD.SpecializedCalculations;

import co.com.tallerDDD.SpecializedCalculations.Value.StatisticalCalculationsId;
import co.com.tallerDDD.Models.Entity;
import co.com.tallerDDD.Generics.StatisticalMagnitudes;

public class StatisticalCalculations extends Entity<StatisticalCalculationsId> {

    private StatisticalMagnitudes statisticalMagnitudes;

    public StatisticalCalculations(StatisticalCalculationsId statisticalCalculationsId){
        super(statisticalCalculationsId);
    }

    public void statisticalMagnitudes(Double mean, Double standardDeviation){
        statisticalMagnitudes =  new StatisticalMagnitudes(mean, standardDeviation);
    }

    public StatisticalMagnitudes returnStatisticalMagnitudes(){
        return this.statisticalMagnitudes;
    }
}
