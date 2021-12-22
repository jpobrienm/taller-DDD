package co.com.tallerDDD.Entities;

import co.com.tallerDDD.DataHandler.MyRaster;
import co.com.tallerDDD.DataHandler.Value.MyRasterId;
import co.com.tallerDDD.Generics.GeologicalMetadata;
import org.junit.jupiter.api.Test;

import java.awt.image.Raster;
import java.nio.file.Path;
import java.util.Objects;

public class MyRasterTest {

    MyRasterId id = new MyRasterId();
    Path rasterPath = Path.of("C:\\Estudio-Sofka\\Codigos\\Domain-Driven-Design\\Back\\src\\test\\java\\co\\com\\tallerDDD\\testFiles\\panda.jpg");
    GeologicalMetadata geoMetadata = new GeologicalMetadata(1, 0,0,0,"asd");
    MyRaster dummyRaster = new MyRaster(id, rasterPath, geoMetadata);

    @Test
    void createMyRaster(){

        assert Objects.nonNull(dummyRaster.getId());
        assert Objects.nonNull(dummyRaster.rasterPath());
        assert Objects.nonNull(dummyRaster.geologicalMetadata());
    }

    @Test
    void getDataFromRaster(){
        assert Objects.nonNull(dummyRaster.getDataFromRaster());
        assert dummyRaster.getDataFromRaster().getHeight() > 0;
        assert dummyRaster.getDataFromRaster().getWidth() > 0;
    }

    @Test
    void cropRaster(){
        Raster croppedDummy = dummyRaster.cropRaster(0, 0, 10, 10);
        assert Objects.nonNull(croppedDummy);
        assert croppedDummy.getHeight() > 0;
        assert croppedDummy.getWidth() > 0;
    }
}
