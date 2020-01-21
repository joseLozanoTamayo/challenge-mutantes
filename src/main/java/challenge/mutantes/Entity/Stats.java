package challenge.mutantes.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Stats {
    private Integer mutants;
    private Integer humans;
    private double ratio;

    public Stats(Integer mutants, Integer humans) {
        this.mutants = mutants;
        this.humans = humans;
        generateRatio();
    }

    @JsonProperty("count_mutant_dna")
    public Integer getMutants() {
        return mutants;
    }

    @JsonProperty("count_human_dna")
    public Integer getHumans() {
        return humans;
    }

    @JsonProperty("ratio")
    public double getRatio() {
        return ratio;
    }

    private void generateRatio() {
        ratio = (humans == 0) ? 1 : (float) mutants / humans;
        ratio = Math.round(ratio * 100.00) / 100.00;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return Double.compare(stats.getRatio(), getRatio()) == 0 &&
                Objects.equals(getMutants(), stats.getMutants()) &&
                Objects.equals(getHumans(), stats.getHumans());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMutants(), getHumans(), getRatio());
    }
}
