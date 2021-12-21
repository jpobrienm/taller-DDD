package co.com.tallerDDD.IDs;

import co.com.tallerDDD.Aggregates.FileHandler;
import co.com.tallerDDD.Models.Id;

import javax.xml.stream.events.DTD;

public class FileHandlerId extends Id {
    private FileHandlerId(String value){super(value);}
    public FileHandlerId(){}
    public static FileHandlerId of(String value){return new FileHandlerId(value);}
}
