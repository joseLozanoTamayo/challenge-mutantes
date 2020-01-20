package challenge.mutantes.Repository;

import challenge.mutantes.Entity.Human;
import org.springframework.data.repository.CrudRepository;

public interface HumanRepository extends CrudRepository<Human, Long> {
}
