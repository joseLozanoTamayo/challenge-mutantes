package challenge.mutantes.Services;


import challenge.mutantes.Utils.DnaAnalyzer;
import org.springframework.stereotype.Service;

@Service
public class HumanService {
    public boolean isMutant(String[] dna) {
        DnaAnalyzer dnaAnalyzer = new DnaAnalyzer(dna);
        return dnaAnalyzer.isMutant();
    }
}
