import java.util.ArrayList;

public class Order {

    private int orderID;
    ArrayList<Product> orderlist;

    public Order(int orderID, ArrayList<Product> orderlist) {
        this.orderID = orderID;
        this.orderlist = orderlist;
    }

    public int getOrderID() {
        return orderID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderlist=" + orderlist +
                '}';
    }
}


