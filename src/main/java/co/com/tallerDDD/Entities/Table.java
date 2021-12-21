package co.com.tallerDDD.Entities;

import co.com.tallerDDD.IDs.TableId;
import co.com.tallerDDD.Models.Entity;
import co.com.tallerDDD.ValueObjects.MyFile;
import co.com.tallerDDD.ValueObjects.MyPath;

public class Table extends Entity<TableId> {

    private MyPath tablePath;

    public Table(TableId tableId, MyPath tablePath){
        super(tableId);
        this.tablePath = tablePath;
    }
}
