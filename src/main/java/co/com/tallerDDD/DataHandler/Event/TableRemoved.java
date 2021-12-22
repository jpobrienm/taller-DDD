package co.com.tallerDDD.DataHandler.Event;

import co.com.tallerDDD.DataHandler.Table;
import co.com.tallerDDD.Models.DomainEvent;

import java.nio.file.Path;

public class TableRemoved extends DomainEvent{

    private Table myTable;

    public TableRemoved(Table myTable){
        super("sofka.DataHandler.TableRemoved");
        this.myTable = myTable;
    }

    public Table getMyTable(){return myTable;}
}
