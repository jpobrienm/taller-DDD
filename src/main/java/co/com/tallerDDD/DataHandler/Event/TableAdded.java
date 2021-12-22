package co.com.tallerDDD.DataHandler.Event;

import co.com.tallerDDD.Models.DomainEvent;

import java.nio.file.Path;

public class TableAdded extends DomainEvent {
    private Path tablePath;

    public TableAdded(Path tablePath){
        super("sofka.DataHandler.TableAdded");
        this.tablePath = tablePath;
    }

    public Path getTablePath(){return tablePath;}
}
