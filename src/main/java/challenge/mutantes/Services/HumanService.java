package challenge.mutantes.Services;


import challenge.mutantes.Entity.Human;
import challenge.mutantes.Repository.HumanRepository;
import challenge.mutantes.Utils.DnaAnalyzer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        //FIXME: Find a better way to solve it
        List dna = new ArrayList();
        dna.add(human.getDna());

        if (findByDna(dna).isPresent()) {
            return;
        }

        humanRepository.save(human);
    }

    public Optional<Human> findByDna(List<String> dna) {
        return humanRepository.findByDna(dna);
    }
}
