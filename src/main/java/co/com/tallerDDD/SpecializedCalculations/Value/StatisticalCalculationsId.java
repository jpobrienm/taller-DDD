package co.com.tallerDDD.SpecializedCalculations.Value;

import co.com.tallerDDD.Models.Id;

public class StatisticalCalculationsId extends Id {
    private StatisticalCalculationsId(String value){super(value);}
    public StatisticalCalculationsId(){}
    public static StatisticalCalculationsId of(String value){return new StatisticalCalculationsId(value);}
}
