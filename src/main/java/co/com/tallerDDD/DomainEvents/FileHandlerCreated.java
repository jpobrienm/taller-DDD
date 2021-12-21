package co.com.tallerDDD.DomainEvents;

import co.com.tallerDDD.Aggregates.FileHandler;
import co.com.tallerDDD.IDs.FileHandlerId;
import co.com.tallerDDD.Models.DomainEvent;

import java.io.File;

public class FileHandlerCreated extends DomainEvent {

    private final FileHandlerId fileHandlerId;

    public FileHandlerCreated(FileHandlerId fileHandlerId){
        super("sofka.filehandler.filehandlerCreated");
        this.fileHandlerId = fileHandlerId;
    }

    public FileHandlerId getFileHandlerId(){return fileHandlerId;}
}
