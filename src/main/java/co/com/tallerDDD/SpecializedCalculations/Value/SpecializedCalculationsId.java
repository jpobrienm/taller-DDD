package co.com.tallerDDD.SpecializedCalculations.Value;

import co.com.tallerDDD.Models.Id;
import co.com.tallerDDD.SpecializedCalculations.SpecializedCalculations;

public class SpecializedCalculationsId extends Id {
    private SpecializedCalculationsId(String value){super(value);}
    public SpecializedCalculationsId(){}
    public SpecializedCalculationsId of(String value){return new SpecializedCalculationsId(value);}
}
