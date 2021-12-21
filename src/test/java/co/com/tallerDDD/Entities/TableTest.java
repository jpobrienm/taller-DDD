package co.com.tallerDDD.Entities;

import co.com.tallerDDD.IDs.TableId;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Objects;

public class TableTest {

    TableId tableId = new TableId();
    Path tablePath = Path.of("C:\\Estudio-Sofka\\Codigos\\Domain-Driven-Design\\Back\\src\\test\\java\\co\\com\\tallerDDD\\testFiles\\ExampleTable.csv");
    Table dummyTable = new Table(tableId, tablePath);

    @Test
    void createTable(){
        assert Objects.nonNull(dummyTable);
    }

    @Test
    void readTable(){
        assert Objects.nonNull(dummyTable.readTable());
    }

    @Test
    void writeTable(){

    }
}
