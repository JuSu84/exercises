package cwicz1do30.cwicz29;

public class ExhaustPart extends Part{

    private boolean eSES;

    public ExhaustPart(boolean eSES) {
        this.eSES = eSES;
    }

    public boolean iseSES() {
        return eSES;
    }

    public void seteSES(boolean eSES) {
        this.eSES = eSES;
    }

    @Override
    public String toString() {
        return "ExhaustPart{" +
                "eSES=" + eSES +
                '}';
    }
}
