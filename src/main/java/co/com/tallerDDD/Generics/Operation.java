package co.com.tallerDDD.Generics;

import java.io.Serializable;
import java.util.Objects;

public class Operation implements Serializable {

    private final String myOperation;

    public Operation(String operation){
        this.myOperation = Objects.requireNonNull(operation, "La operacion no puede ser vacia");
    }

    public String operation(){return this.myOperation;}

    public static Operation of(String operation){return new Operation(operation);}

    public boolean operationEquals(Operation myOperation){
        return this.myOperation.equals(myOperation.operation());
    }
}
