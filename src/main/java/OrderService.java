import java.util.ArrayList;

// Ziel: checken, ob die Order in der Product enthalten sind. Wenn ja --> in OrderDB speichern. Wenn nein: error

public class OrderService {


    private ArrayList<Order> allOrderArrayList = new ArrayList<>();

    public OrderService(ArrayList<Order> allOrderArrayList) {
        this.allOrderArrayList = allOrderArrayList;
    }


    public void listOrders() {

        for (Order order : allOrderArrayList) {

            System.out.println(order);
        }

    }

    public void addOrders(Order newOrder) {
        int orderID = allOrderArrayList.size();
        allOrderArrayList.add(newOrder);


    }

}

