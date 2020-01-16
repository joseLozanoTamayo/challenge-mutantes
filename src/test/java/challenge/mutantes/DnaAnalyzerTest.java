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

    @Test public void testIsMutantOneSequenceVertical() {
        String[] dna = {"CTGCGA","TAGAGC","ATATTT","AAGTGC","GCGTCA","ACACTG"};

        DnaAnalyzer dnaAnalyzer = new DnaAnalyzer(dna);
        assertFalse(dnaAnalyzer.isMutant());
    }

    @Test public void testIsMutantTwoSequencesVertical() {
        String[] dna = {"CTGCGA","TAGTGC","ATATTT","AAGTGC","ACGTCA","ACACTG"};

        DnaAnalyzer dnaAnalyzer = new DnaAnalyzer(dna);
        assertTrue(dnaAnalyzer.isMutant());
    }

    @Test public void testIsMutantTwoSequencesRightDiagonal() {
        String[] dna = {"ATGCGA", "CAGGGC", "TTATGT", "ATGACG", "GCTTCA", "TCATTG"};

        DnaAnalyzer dnaAnalyzer = new DnaAnalyzer(dna);
        assertTrue(dnaAnalyzer.isMutant());
    }

    @Test public void testIsMutantTwoSequencesLeftDiagonal() {
        String[] dna = {"ATGCGA", "CAGTGG", "TTATGT", "AGTGGG", "GTGTCA", "TCACTG"};

        DnaAnalyzer dnaAnalyzer = new DnaAnalyzer(dna);
        assertTrue(dnaAnalyzer.isMutant());
    }
}
