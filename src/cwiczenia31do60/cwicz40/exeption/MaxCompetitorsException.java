package cwiczenia31do60.cwicz40.exeption;

public class MaxCompetitorsException extends RuntimeException {
    private final int maxComtetiors;

    public MaxCompetitorsException(int maxComtetiors) {
        this.maxComtetiors = maxComtetiors;
    }

    public int getMaxComtetiors() {
        return maxComtetiors;
    }
}
