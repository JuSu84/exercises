package cwiczenia31do60.cwicz31;

public class Apple extends Fruit{

    public static final String TYPE = "jabłkowate";

    private String variety;

    public Apple(int weight, String variety) {
        super(weight, TYPE);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    String printInfo() {
        return super.printInfo() + ", odmiana: " + variety;
    }
}
