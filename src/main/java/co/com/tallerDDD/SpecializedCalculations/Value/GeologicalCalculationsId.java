package co.com.tallerDDD.SpecializedCalculations.Value;

import co.com.tallerDDD.Models.Id;

public class GeologicalCalculationsId extends Id {
    private GeologicalCalculationsId(String value){super(value);}
    public GeologicalCalculationsId(){}
    public static GeologicalCalculationsId of(String value){return new GeologicalCalculationsId(value);}
}
