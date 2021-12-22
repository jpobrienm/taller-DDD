package co.com.tallerDDD.FileHandler.Value;

import co.com.tallerDDD.Models.Id;

public class FileHandlerId extends Id {
    private FileHandlerId(String value){super(value);}
    public FileHandlerId(){}
    public static FileHandlerId of(String value){return new FileHandlerId(value);}
}
