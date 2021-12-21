package co.com.tallerDDD.IDs;

import co.com.tallerDDD.Models.Id;

public class VariableHandlerId extends Id {
    private VariableHandlerId(String value){super(value);}
    public VariableHandlerId(){}
    public static VariableHandlerId of(String value){return new VariableHandlerId(value);}
}
