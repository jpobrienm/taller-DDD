package co.com.tallerDDD.Entities;

import co.com.tallerDDD.FileHandler.VariableHandler;
import co.com.tallerDDD.FileHandler.Value.VariableHandlerId;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VariableHandlerTest {

    VariableHandlerId variableHandlerId = new VariableHandlerId();
    Path testPath = Path.of("C:\\Estudio-Sofka\\Codigos\\Domain-Driven-Design\\Back\\src\\test\\java\\co\\com\\tallerDDD\\testFiles");
    Set<Path> filesPaths = Stream.of(Objects.requireNonNull(new File(String.valueOf(testPath)).listFiles()))
                                                .filter(file -> !file.isDirectory())
                                                .map(File::toPath)
                                                .collect(Collectors.toSet());
    Set<String> variables = new HashSet<>();
    VariableHandler variableHandler = new VariableHandler(variableHandlerId, filesPaths, variables);

    @Test
    void VariableHandlerCreated(){
        assert Objects.nonNull(variableHandler);
    }

    @Test
    void fillFilesPaths(){
        variableHandler.fillFilesPaths(testPath.toString());
        assert variableHandler.filesPaths().size() > 0;
    }
}
