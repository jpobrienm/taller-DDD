package co.com.tallerDDD.Entities;

import co.com.tallerDDD.IDs.RepositoryId;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Objects;

public class RepositoryTest {
    Path repositoryPath = Path.of("C:\\Estudio-Sofka\\Codigos\\Domain-Driven-Design\\Back\\src\\test\\java\\co\\com\\tallerDDD\\testFiles");
    RepositoryId repositoryId = new RepositoryId();
    Repository dummyRepository = new Repository(repositoryId, repositoryPath);

    @Test
    void createRepository(){
        assert Objects.nonNull(dummyRepository);
        assert Objects.nonNull(dummyRepository.repositoryFiles());
    }
}
