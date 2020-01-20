package challenge.mutantes.Repository;

import challenge.mutantes.Entity.Human;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface HumanRepository extends CrudRepository<Human, Long> {
    Optional<Human> findByDna(List<String> dna);
}
