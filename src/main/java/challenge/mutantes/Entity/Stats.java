package challenge.mutantes.Entity;

public class Stats {
    private Integer mutants;
    private Integer humans;
    private double ratio;

    public Stats(Integer mutants, Integer humans) {
        this.mutants = mutants;
        this.humans = humans;
        generateRatio();
    }

    public Integer getMutants() {
        return mutants;
    }

    public Integer getHumans() {
        return humans;
    }

    public double getRatio() {
        return ratio;
    }

    private void generateRatio() {
        ratio = (humans == 0) ? 1 : (float) mutants / humans;
        ratio = Math.round(ratio * 100.00) / 100.00;
    }
}
