package challenge.mutantes;

import org.junit.Test;

import static org.junit.Assert.*;

public class DnaAnalyzerTest {
    @Test public void testIsMutantNoSequence() {
        String[] dna = {"ATGCGA","CAGTGC","TTATTT","AGACGG","GCGTCA","TCACTG"};

        DnaAnalyzer dnaAnalyzer = new DnaAnalyzer(dna);
        assertFalse(dnaAnalyzer.isMutant());
    }

    @Test public void testIsMutantOneSequenceHorizonal() {
        String[] dna = {"ATGCGA","CAGTGC","TTATTT","AGGGGA","GCGTCA","TCACTG"};

        DnaAnalyzer dnaAnalyzer = new DnaAnalyzer(dna);
        assertFalse(dnaAnalyzer.isMutant());
    }

    @Test public void testIsMutantTwoSequencesHorizonal() {
        String[] dna = {"ATGGGG","CAGTGC","TTATTT","AGGGGA","GCGTCA","TCACTG"};

        DnaAnalyzer dnaAnalyzer = new DnaAnalyzer(dna);
        assertTrue(dnaAnalyzer.isMutant());
    }
}
