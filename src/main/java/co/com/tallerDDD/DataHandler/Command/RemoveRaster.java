package co.com.tallerDDD.DataHandler.Command;

import co.com.sofka.domain.generic.Command;
import co.com.tallerDDD.DataHandler.MyRaster;

public class RemoveRaster extends Command {

    private MyRaster myRaster;

    public RemoveRaster(MyRaster myRaster){
        this.myRaster = myRaster;
    }

    public MyRaster getMyRaster(){return myRaster;}
}
