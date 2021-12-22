package co.com.tallerDDD.FileHandler;

import co.com.tallerDDD.FileHandler.Event.FileHandlerCreated;
import co.com.tallerDDD.FileHandler.Event.RepositoryCreated;
import co.com.tallerDDD.FileHandler.Event.VariableHandlerCreated;
import co.com.tallerDDD.FileHandler.Value.FileHandlerId;
import co.com.tallerDDD.FileHandler.Value.RepositoryId;
import co.com.tallerDDD.FileHandler.Value.VariableHandlerId;
import co.com.tallerDDD.Models.AggregateRoot;

import java.nio.file.Path;
import java.util.Set;

public class FileHandler extends AggregateRoot<FileHandlerId> {

    private Repository repository;
    private VariableHandler variableHandler;

    public FileHandler(FileHandlerId fileHandlerId){
        super(fileHandlerId);
        this.applyChange(new FileHandlerCreated(fileHandlerId));
    }

    public void createRepository(RepositoryId repositoryId, Path repositoryPath){
        this.repository =  new Repository(repositoryId, repositoryPath);
        this.applyChange(new RepositoryCreated(repositoryId, repositoryPath));
    }

    public void variableHandler(Set<String> variables){
        VariableHandlerId variableHandlerId = new VariableHandlerId();
        Set<Path> filesPaths = this.repository.repositoryFiles();
        this.variableHandler = new VariableHandler(variableHandlerId, filesPaths, variables);
        this.applyChange(new VariableHandlerCreated(variableHandlerId));
    }

    public Repository fileHandlerRepository(){
        return repository;
    }

    public VariableHandler fileHandlerVariableHandler(){
        return variableHandler;
    }
}
