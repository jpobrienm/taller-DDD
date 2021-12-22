package co.com.tallerDDD.Aggregates;

import co.com.tallerDDD.FileHandler.FileHandler;
import co.com.tallerDDD.FileHandler.Value.FileHandlerId;
import co.com.tallerDDD.FileHandler.Value.RepositoryId;
import org.junit.Test;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class FileHandlerTest {

    FileHandlerId fileHandlerId = new FileHandlerId();
    RepositoryId repositoryId = new RepositoryId();
    Set<String> dummyvariables = new HashSet<>();
    Path dummyPath = Path.of("C:\\Estudio-Sofka\\Codigos\\Domain-Driven-Design\\Back\\src\\test\\java\\co\\com\\tallerDDD\\testFiles");
    FileHandler fileHandler = new FileHandler(fileHandlerId);

    @Test
    public void VariableHandlerCreated(){
        assert Objects.nonNull(fileHandler);
    }

    @Test
    public void RepositoryCreated(){
        fileHandler.createRepository(repositoryId, dummyPath);
        assert Objects.nonNull(fileHandler.fileHandlerRepository());
    }

    @Test
    public void variableHandlerCreated(){
        fileHandler.createRepository(repositoryId, dummyPath);
        System.out.println(dummyvariables);
        fileHandler.variableHandler(dummyvariables);
        assert Objects.nonNull(fileHandler.fileHandlerVariableHandler());
    }
}
