package co.com.tallerDDD.IDs;

import co.com.tallerDDD.Models.Id;

public class RepositoryId extends Id {
    private RepositoryId(String value){super(value);}
    public RepositoryId(){}
    public static RepositoryId of(String value){return new RepositoryId(value);}
}
