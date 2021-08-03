package cwiczenia31do60.cwicz31;

public class Fruit {

    private int weight;
    private String typ;

    public Fruit(int weight, String typ) {
        this.weight = weight;
        this.typ = typ;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    String printInfo(){
        return  weight + " g, typ: " + typ;

    }
}
