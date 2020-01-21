package challenge.mutantes.Entity;

import java.util.Arrays;

public class HumanRequest {
    private String[] dna;

    public String[] getDna() {
        return dna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanRequest that = (HumanRequest) o;
        return Arrays.equals(dna, that.dna);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(dna);
    }
}
