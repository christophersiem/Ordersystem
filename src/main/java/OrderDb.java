import java.util.ArrayList;


public class OrderDb {

    private ArrayList<Order> allOrderArrayList = new ArrayList<>();


    public OrderDb(ArrayList<Order> allOrderArrayList) {
        this.allOrderArrayList = allOrderArrayList;

    }


    public ArrayList<Order> getOrderArrayList() {
        return allOrderArrayList;
    }

    @Override
    public String toString() {
        return "OrderDb{" +
                "allOrderArrayList=" + allOrderArrayList +
                '}';
    }
}

