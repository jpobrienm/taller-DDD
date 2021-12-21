package co.com.tallerDDD.Aggregates;

import co.com.tallerDDD.DomainEvents.FileHandlerCreated;
import co.com.tallerDDD.Entities.Repository;
import co.com.tallerDDD.Entities.VariableHandler;
import co.com.tallerDDD.IDs.FileHandlerId;
import co.com.tallerDDD.IDs.MyRasterId;
import co.com.tallerDDD.IDs.RepositoryId;
import co.com.tallerDDD.IDs.VariableHandlerId;
import co.com.tallerDDD.Models.AggregateRoot;

import java.nio.file.Path;
import java.util.Objects;
import java.util.Set;

public class FileHandler extends AggregateRoot<FileHandlerId> {

    private Repository repository;
    private VariableHandler variableHandler;

    public FileHandler(FileHandlerId fileHandlerId){
        super(fileHandlerId);
        this.applyChange(new FileHandlerCreated(fileHandlerId));
    }

    private void repository(RepositoryId repositoryId, Path repositoryPath){
        this.repository =  new Repository(repositoryId, repositoryPath);
    }

    private void variableHandler(Set<String> variables){
        VariableHandlerId variableHandlerId = new VariableHandlerId();
        Set<Path> filesPaths = this.repository.repositoryFiles();
        this.variableHandler = new VariableHandler(variableHandlerId, filesPaths, variables);
    }
}
