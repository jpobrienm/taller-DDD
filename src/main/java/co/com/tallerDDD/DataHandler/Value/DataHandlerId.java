package co.com.tallerDDD.DataHandler.Value;

import co.com.tallerDDD.Models.Id;

public class DataHandlerId extends Id {

    private DataHandlerId(String value){super(value);}
    public DataHandlerId(){}
    public static DataHandlerId of(String value){ return new DataHandlerId(value);}
}
