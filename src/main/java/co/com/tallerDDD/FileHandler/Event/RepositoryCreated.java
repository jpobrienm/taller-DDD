package co.com.tallerDDD.FileHandler.Event;

import co.com.tallerDDD.FileHandler.Value.RepositoryId;
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
