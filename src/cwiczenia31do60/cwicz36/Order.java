package cwiczenia31do60.cwicz36;

public class Order {

    private String name;
    private double price;
    private OrderStatus orderStatus;

    public Order(String name, double price, OrderStatus orderStatus) {
        this.name = name;
        this.price = price;
        this.orderStatus = orderStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return name + " ("+ price + "zł) "+ orderStatus;
    }
}
