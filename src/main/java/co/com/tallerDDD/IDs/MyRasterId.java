package co.com.tallerDDD.IDs;

import co.com.tallerDDD.Models.Id;

public class MyRasterId extends Id {

    private MyRasterId(String value){super(value);}
    public MyRasterId(){}
    public static MyRasterId of(String Value){return new MyRasterId(Value);}

}
