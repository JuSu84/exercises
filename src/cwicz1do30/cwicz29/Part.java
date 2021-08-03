package cwicz1do30.cwicz29;

public class Part {

    private int id;
    private String manufacturerName;
    private String model;
    private String productSeries;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductSeries() {
        return productSeries;
    }

    public void setProductSeries(String productSeries) {
        this.productSeries = productSeries;
    }


    public void printInfo() {
        System.out.println( "Part{" +
                "id=" + id +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", model='" + model + '\'' +
                ", productSeries='" + productSeries + '\'' +
                '}');
    }
}
