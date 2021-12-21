package co.com.tallerDDD.Aggregates;

import co.com.tallerDDD.Entities.MyRaster;
import co.com.tallerDDD.IDs.DataHandlerId;
import co.com.tallerDDD.IDs.MyRasterId;
import co.com.tallerDDD.IDs.RepositoryId;
import co.com.tallerDDD.IDs.TableId;
import co.com.tallerDDD.Models.AggregateRoot;

import java.awt.image.Raster;
import java.util.Objects;
import java.util.Set;

public class DataHandler extends AggregateRoot<DataHandlerId>{

    private final RepositoryId repositoryId;

    private Set<Raster> rasterset;

    public DataHandler(DataHandlerId dataHandlerId, RepositoryId repositoryId){
        super(dataHandlerId);
        this.repositoryId = Objects.requireNonNull(repositoryId, "Es necesario un repositorio");
    }
}
