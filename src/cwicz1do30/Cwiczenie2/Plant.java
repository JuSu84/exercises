package cwicz1do30.Cwiczenie2;

public class Plant {
    String name;
    String description;
    double waterDemand;

    public Plant() {
    }

    public Plant(String name, String description, double waterDemand) {
        this.name = name;
        this.description = description;
        this.waterDemand = waterDemand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWaterDemand() {
        return waterDemand;
    }

    public void setWaterDemand(double waterDemand) {
        this.waterDemand = waterDemand;
    }
}
