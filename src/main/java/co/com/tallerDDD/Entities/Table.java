package co.com.tallerDDD.Entities;

import co.com.tallerDDD.IDs.TableId;
import co.com.tallerDDD.Models.Entity;
import co.com.tallerDDD.ValueObjects.MyFile;
import co.com.tallerDDD.ValueObjects.MyPath;
import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.net.Socket;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
