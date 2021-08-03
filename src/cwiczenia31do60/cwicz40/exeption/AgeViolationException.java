package cwiczenia31do60.cwicz40.exeption;

public class AgeViolationException extends RuntimeException {
    private final int ageRequired;

    public AgeViolationException(int ageRequired) {
        this.ageRequired = ageRequired;
    }

    public int getAgeRequired() {
        return ageRequired;
    }
}
