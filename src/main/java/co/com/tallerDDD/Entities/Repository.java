package co.com.tallerDDD.Entities;

import co.com.tallerDDD.IDs.RepositoryId;
import co.com.tallerDDD.Models.Entity;
import co.com.tallerDDD.ValueObjects.MyFile;
import co.com.tallerDDD.ValueObjects.MyPath;

import java.awt.image.Raster;
import java.io.File;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Repository extends Entity<RepositoryId> {

    private Path repositoryPath;
    private Set<Path> repositoryFiles;
    private RepositoryId repositoryId;

    public Repository(RepositoryId repositoryId, Path repositoryPath){
        super(repositoryId);
        this.repositoryId = repositoryId;
        this.repositoryPath = repositoryPath;
        fillRepository();
    }

    public void fillRepository(){
        this.repositoryFiles = Stream.of(Objects.requireNonNull(new File(String.valueOf(repositoryPath)).listFiles()))
                                        .filter(file -> !file.isDirectory())
                                        .map(File::toPath)
                                        .collect(Collectors.toSet());
    }

    public Repository changeRepository(Path repositoryPath){
        return new Repository(this.repositoryId, repositoryPath);
    }

    public Set<Path> repositoryFiles(){return this.repositoryFiles;}
}
