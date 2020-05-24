import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AppMain {

    public static void main(String[] args) {

        // creating a new product list

        ArrayList<Product> products = new ArrayList<>();

        Product product1 = new Product(1, "Red Jacket", 99.99);
        Product product2 = new Product(2, "Black Shoes", 49.99);
        Product product3 = new Product(3, "Green Pants", 64.99);
        Product product4 = new Product(4, "Blue Hat", 7.99);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);


        // adding products to an order
        ArrayList<Product> order1 = new ArrayList<>();
        ArrayList<Product> order2 = new ArrayList<>();

        order1.add(product1);
        order1.add(product2);
        order2.add(product3);
        order2.add(product4);

        // adding orders to an orderList

        Order orderList1 = new Order(1, order1);
        Order orderList2 = new Order(2, order2);

        ArrayList<Order> allOrders = new ArrayList<>();
        allOrders.add(orderList1);
        allOrders.add(orderList2);

        OrderService orderList = new OrderService(allOrders);
        orderList.listOrders();
        orderList.addOrders(orderList1);


        //  creating a new list "productList" of type ProductDb (input = products)

        ProductDb productList = new ProductDb(products);

        System.out.println(productList.getProduct(2));

        Optional <Product> result = productList.getProduct(2) ;
        if (result.isPresent()) {
            result.get().getProductName();
        } else {
            System.out.println("Product not found");
        }


    }

}
