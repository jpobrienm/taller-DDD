package co.com.tallerDDD.DataHandler.Value;

import co.com.tallerDDD.Models.Id;

public class TableId extends Id {
    private TableId(String value){super(value);}
    public TableId(){}
    public static TableId of(String value){return new TableId(value);}
}
