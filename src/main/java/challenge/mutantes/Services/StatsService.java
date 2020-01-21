package challenge.mutantes.Services;

import challenge.mutantes.Entity.Stats;
import challenge.mutantes.Repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatsService {
    private final HumanRepository humanRepository;

    @Autowired
    public StatsService(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    public Stats getStats() {
        Integer humans = humanRepository.countAllByMutantIsFalse();
        Integer mutants = humanRepository.countAllByMutantIsTrue();

        return new Stats(mutants, humans);
    }
}
