package co.com.tallerDDD.DataHandler;

import co.com.tallerDDD.DataHandler.Value.TableId;
import co.com.tallerDDD.Models.Entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.Objects;

public class Table extends Entity<TableId> {

    private Path tablePath;

    public Table(TableId tableId, Path tablePath){
        super(tableId);
        this.tablePath = Objects.requireNonNull(tablePath);
    }

    public BufferedReader readTable(){
        try{
            return new BufferedReader(new FileReader(String.valueOf(tablePath)));
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public boolean tableEquals(Table myTable){
        return this.tablePath.equals(myTable.tablePath);
    }

}
