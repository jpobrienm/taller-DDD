package co.com.tallerDDD.Generics;

import java.nio.file.Path;

public class MyPath {
    private Path myPath;

    public MyPath(Path myPath){
        this.myPath = myPath;
    }

    public static MyPath of(Path myPath){return new MyPath(myPath);}
    public Path myPath(){return myPath;}
}
