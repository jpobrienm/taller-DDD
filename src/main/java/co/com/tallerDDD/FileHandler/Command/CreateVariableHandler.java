package co.com.tallerDDD.FileHandler.Command;

import co.com.sofka.domain.generic.Command;

import java.util.Set;

public class CreateVariableHandler extends Command {
    private final Set<String> variables;

    public CreateVariableHandler(Set<String> variables){
        this.variables = variables;
    }

    public Set<String> getVariables(){return variables;}

}
