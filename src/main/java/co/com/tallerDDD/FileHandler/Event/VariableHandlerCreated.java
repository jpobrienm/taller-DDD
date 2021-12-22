package co.com.tallerDDD.FileHandler.Event;

import co.com.tallerDDD.FileHandler.Value.VariableHandlerId;
import co.com.tallerDDD.Models.DomainEvent;

public class VariableHandlerCreated extends DomainEvent {

    private final VariableHandlerId variableHandlerId;

    public VariableHandlerCreated(VariableHandlerId variableHandlerId){
        super("sofka.FileHandler.variableHandlerCreated");
        this.variableHandlerId = variableHandlerId;
    }

    public VariableHandlerId getVariableHandlerId() {
        return variableHandlerId;
    }
}
