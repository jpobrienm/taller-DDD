package co.com.tallerDDD.Entities;

import co.com.tallerDDD.IDs.VariableHandlerId;
import org.apache.commons.collections.set.ListOrderedSet;
import org.junit.jupiter.api.Test;

import java.io.DataOutput;
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
    void bondVariables(){
        variableHandler.addVariable("panda.jpg");
        var files = Stream.of(new File(String.valueOf(testPath)).listFiles())
                .map(file -> file.getName())
                .collect(Collectors.toList());
        System.out.println(files.toString());
        System.out.println(variableHandler.variables());
        variableHandler.bondVariables();
        System.out.println(variableHandler.pathsToVariables());
        assert variableHandler.pathsToVariables().size() > 0;
    }
}
