package co.com.tallerDDD.ValueObjects;

import java.nio.file.Path;

public class MyPath {
    private Path myPath;

    public MyPath(Path myPath){
        this.myPath = myPath;
    }

    public Path myPath(){return myPath;}
}
