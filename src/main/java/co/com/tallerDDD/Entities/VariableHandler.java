package co.com.tallerDDD.Entities;

import co.com.tallerDDD.IDs.VariableHandlerId;
import co.com.tallerDDD.Models.Entity;

import java.io.File;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VariableHandler extends Entity<VariableHandlerId> {

    private Set<Path> filesPaths;
    private Set<String> variables;
    private Map<String, String> pathsToVariables = new HashMap<>();

    public VariableHandler(VariableHandlerId variableHandlerId, Set<Path> filesPaths, Set<String> variables){
        super(variableHandlerId);
        this.filesPaths = new HashSet<>(filesPaths);
        this.variables = new HashSet<>(variables);
    }

    public Set<Path> fillFilesPaths(String directory){
        return  Stream.of(new File(directory).listFiles())
                .map(file -> Path.of(String.valueOf(file)))
                .collect(Collectors.toSet());
    }

    public HashMap<String, String> pathsToVariables(){
        return new HashMap<>(pathsToVariables);
    }

    public void addVariable(String variable){
        variables.add(variable);
    }

    public Set<String> variables(){
        return variables;
    }

    public Set<Path> filesPaths(){
        return filesPaths;
    }
}
