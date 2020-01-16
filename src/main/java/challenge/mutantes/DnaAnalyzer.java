package challenge.mutantes;

import java.util.ArrayList;
import java.util.List;

public class DnaAnalyzer {
    private static final int MUTANT_MIN_SEQUENCES = 2;
    public static final int MUTANT_SEQUENCE_LENGTH = 4;
    private String[] dna;
    private List<HorizontalFinder> finders = new ArrayList<>();
    private Integer mutantSequencesFound = 0;

    public DnaAnalyzer(String[] dna) {
        this.dna = dna;

        finders.add(new HorizontalFinder());
    }

    public boolean isMutant() {
        for (int i = 0; i < dna.length; i++) {
            for (int j = 0; j <= dna[i].length() - MUTANT_SEQUENCE_LENGTH; j++) {
                for (HorizontalFinder finder : finders) {
                    finder.setStartPoint(new Point(j, i));

                    if (finder.isSequence(dna)) {
                        mutantSequencesFound ++;
                    }

                    if (mutantSequencesFound >= MUTANT_MIN_SEQUENCES) {
                        return  true;
                    }
                }
            }
        }

        return false;
    }
}
