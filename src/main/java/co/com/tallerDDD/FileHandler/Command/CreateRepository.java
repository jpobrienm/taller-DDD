package co.com.tallerDDD.FileHandler.Command;

import co.com.sofka.domain.generic.Command;
import co.com.tallerDDD.FileHandler.Repository;
import co.com.tallerDDD.FileHandler.Value.RepositoryId;

import java.nio.file.Path;

public class CreateRepository extends Command {
    private final RepositoryId repositoryId;
    private final Path repositoryPath;

    public CreateRepository(RepositoryId repositoryId, Path repositoryPath){
        this.repositoryId = repositoryId;
        this.repositoryPath = repositoryPath;
    }

    public RepositoryId getRepositoryId(){return repositoryId;}
    public Path getRepositoryPath(){return repositoryPath;}
}
