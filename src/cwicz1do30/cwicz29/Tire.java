package cwicz1do30.cwicz29;

public class Tire extends Part{

    private int size;
    private int width;

    public Tire(int id, String manufacturerName, String model, String productSeries, int size, int width) {
        setId(id);
        setManufacturerName(manufacturerName);
        setModel(model);
        setProductSeries(productSeries);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }



    @Override
    public void printInfo() {
        System.out.println("Part{" +
                "id=" + getId() +
                ", manufacturerName='" + getManufacturerName() + '\'' +
                ", model='" + getModel() + '\'' +
                ", productSeries='" + getProductSeries() + '\'' +
                '}' + " Tire{" +
                "size=" + size +
                ", width=" + width +
                '}');
    }
}
