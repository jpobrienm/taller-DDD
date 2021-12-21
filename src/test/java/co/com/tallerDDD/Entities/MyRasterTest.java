package co.com.tallerDDD.Entities;

import co.com.tallerDDD.IDs.RasterId;
import co.com.tallerDDD.ValueObjects.GeologicalMetadata;
import co.com.tallerDDD.ValueObjects.MyPath;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Objects;

public class MyRasterTest {

    RasterId id = new RasterId();
    Path rasterPath = Path.of("C:\\Estudio-Sofka\\Codigos\\Domain-Driven-Design\\Back\\src\\test\\java\\co\\com\\tallerDDD\\testFiles\\panda.jpg");
    GeologicalMetadata geoMetadata = new GeologicalMetadata(1, 0,0,0,"asd");
    MyRaster dummyRaster = new MyRaster(id, rasterPath, geoMetadata);

    @Test
    void createMyRaster(){

        assert Objects.nonNull(dummyRaster.getId());
        assert Objects.nonNull(dummyRaster.rasterFile());
        assert Objects.nonNull(dummyRaster.geologicalMetadata());
    }

    @Test
    void getDataFromRaster(){
        assert Objects.nonNull(dummyRaster.getDataFromRaster());
    }
}
