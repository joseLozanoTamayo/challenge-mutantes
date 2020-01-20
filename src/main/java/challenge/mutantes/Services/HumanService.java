package challenge.mutantes.Services;


import challenge.mutantes.Entity.Human;
import challenge.mutantes.Repository.HumanRepository;
import challenge.mutantes.Utils.DnaAnalyzer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HumanService {
    private final HumanRepository humanRepository;

    @Autowired
    public HumanService(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    public boolean isMutant(String[] dna) {
        DnaAnalyzer dnaAnalyzer = new DnaAnalyzer(dna);
        return dnaAnalyzer.isMutant();
    }

    public void save(Human human) {
        humanRepository.save(human);
    }
}
