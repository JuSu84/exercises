package cwiczenia31do60.cwicz36;

import java.util.Locale;
import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {

        Order[] orders = createOrders();
        OrderStatus orderStatus = readOrder();
        Order[] filteredOrders = filterOrdersByStatus(orders, orderStatus);
        printOrders(filteredOrders, orderStatus);


    }

    private static void printOrders(Order[] filteredOrders, OrderStatus orderStatus) {
        System.out.println("Lista zamówień ze statusem " + orderStatus);
        for (Order filteredOrder : filteredOrders) {
            System.out.println(filteredOrder);
        }
    }

    private static Order[] filterOrdersByStatus(Order[] orders, OrderStatus orderStatus) {
        int size = countOrderByStatus(orders, orderStatus);
        Order[] filterOrders = new Order[size];
        int count =0;
        for (Order o : orders) {
            if (o.getOrderStatus() == orderStatus){
                filterOrders[count] = o;
                count++;
            }
        }
        return filterOrders;
    }

    private static int countOrderByStatus(Order[] orders, OrderStatus orderStatus) {
        int countOrders =0;
        for (Order order : orders) {
            if (order.getOrderStatus() == orderStatus){
                countOrders++;
            }
        }
        return countOrders;
    }

    private static OrderStatus readOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wybierz liste statusów do wyświetlenia ( ");
        for (OrderStatus status : OrderStatus.values()) {
            System.out.print(status.name() + " ");
        }
        System.out.println(" )");
        String status = sc.nextLine().toUpperCase(Locale.ROOT);
        return OrderStatus.valueOf(status);
    }


    private static Order[] createOrders() {
        Order[] orders = new Order[10];
        orders[0] = new Order("Komputer Apple MacBook Pro 2018", 4999, OrderStatus.PAID);
        orders[1] = new Order("Telefon Samsung Galaxy s10", 2499, OrderStatus.SHIPPED);
        orders[2] = new Order("Telefon Apple iPhone X", 2999, OrderStatus.PAID);
        orders[3] = new Order("Pralka Beko X2000", 1499, OrderStatus.DELIVERED);
        orders[4] = new Order("Lodówka Samsung AT200", 1199, OrderStatus.DELIVERED);
        orders[5] = new Order("Głośnik JBL z100", 199, OrderStatus.NEW);
        orders[6] = new Order("Kino Domowe Yamaha XBC900", 3499, OrderStatus.CANCELLED);
        orders[7] = new Order("Konsola Sony Playstation 4", 1499, OrderStatus.SHIPPED);
        orders[8] = new Order("Adapter USBC - HDMI", 149, OrderStatus.PAID);
        orders[9] = new Order("Żelazko Zelmer PRIMO", 99.99, OrderStatus.SHIPPED);
        return orders;
    }


}
