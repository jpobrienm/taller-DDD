package co.com.tallerDDD.DataHandler.Event;

import co.com.tallerDDD.DataHandler.MyRaster;
import co.com.tallerDDD.Models.DomainEvent;

public class RasterRemoved extends DomainEvent {

    private final MyRaster myRaster;

    public RasterRemoved(MyRaster myRaster){
        super("sofka.DataHandler.RasterRemoved");
        this.myRaster = myRaster;
    }

    public MyRaster getMyRaster(){return myRaster;}
}
