package co.com.tallerDDD.ValueObjects;

import java.io.File;
import java.nio.file.*;

public class MyFile {

    private Path filePath;
    private String fileName;

    public MyFile(Path filePath, String fileName){
        this.filePath = filePath;
        this.fileName = fileName;
    }

    public Path filePath(){return filePath;}
    public String fileName(){return fileName;}

}
