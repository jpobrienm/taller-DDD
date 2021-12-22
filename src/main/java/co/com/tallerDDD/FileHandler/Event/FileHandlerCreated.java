package co.com.tallerDDD.FileHandler.Event;

import co.com.tallerDDD.FileHandler.Value.FileHandlerId;
import co.com.tallerDDD.Models.DomainEvent;

public class FileHandlerCreated extends DomainEvent {

    private final FileHandlerId fileHandlerId;

    public FileHandlerCreated(FileHandlerId fileHandlerId){
        super("sofka.filehandler.filehandlerCreated");
        this.fileHandlerId = fileHandlerId;
    }

    public FileHandlerId getFileHandlerId(){return fileHandlerId;}
}
