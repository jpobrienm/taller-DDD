package co.com.tallerDDD.DomainEvents;

import co.com.tallerDDD.Entities.Repository;
import co.com.tallerDDD.IDs.RepositoryId;
import co.com.tallerDDD.Models.DomainEvent;

import java.nio.file.Path;

public class RepositoryCreated extends DomainEvent {

    private final RepositoryId repositoryId;
    private final Path repositoryPath;

    public RepositoryCreated(RepositoryId repositoryId, Path repositoryPath){
        super("sofka.FileHandler.repositoryCreated");
        this.repositoryId = repositoryId;
        this.repositoryPath = repositoryPath;
    }

    public RepositoryId getRepositoryId(){
        return repositoryId;
    }

    public Path getRepositoryPath(){
        return repositoryPath;
    }

}
