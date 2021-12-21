package co.com.tallerDDD.IDs;

import co.com.tallerDDD.Models.Id;

public class RasterId extends Id {

    private RasterId(String value){super(value);}
    public RasterId(){}
    public static RasterId of(String Value){return new RasterId(Value);}

}
