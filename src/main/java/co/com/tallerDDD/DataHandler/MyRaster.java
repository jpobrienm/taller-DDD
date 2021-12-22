package co.com.tallerDDD.DataHandler;

import co.com.tallerDDD.DataHandler.Value.MyRasterId;
import co.com.tallerDDD.Models.Entity;
import co.com.tallerDDD.Generics.GeologicalMetadata;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.nio.file.Path;
import java.util.Objects;

public class MyRaster extends Entity<MyRasterId> {

    private GeologicalMetadata geoMetadata;
    private Path rasterPath;

    public MyRaster(MyRasterId myRasterId, Path rasterPath, GeologicalMetadata geoMetadata){
        super(myRasterId);
        this.rasterPath = Objects.requireNonNull(rasterPath);
        this.geoMetadata = Objects.requireNonNull(geoMetadata);
    }

    public void changeRasterFile(Path rasterPath){this.rasterPath = rasterPath;}
    public void changeGeologicalMetadata(GeologicalMetadata geoMetadata){this.geoMetadata = geoMetadata;}

    public Raster getDataFromRaster(){
        BufferedImage image = null;
        try{
            image = ImageIO.read(new File(String.valueOf(rasterPath)));
        }catch (Exception e){
            System.out.println("Error, Raster vacio o archivo invalido");
        }

        return Objects.requireNonNull(image).getData();
    }

    public Raster cropRaster(Integer xInitial, Integer yInitial, Integer width, Integer height){
        BufferedImage image = null;
        try{
            image = ImageIO.read(new File(String.valueOf(rasterPath))).getSubimage(xInitial, yInitial,width-2*xInitial, height - 2 * yInitial);
        }catch (Exception e) {
            System.out.println("Error, Raster vacio o archivo invalido");
        }

        return Objects.requireNonNull(image).getData();
    }

    public GeologicalMetadata geologicalMetadata(){return geoMetadata;}
    public Path rasterPath(){return rasterPath;}
    public boolean equalRaster(MyRaster myRaster){
        return myRaster.rasterPath.equals(this.rasterPath);
    }

}
