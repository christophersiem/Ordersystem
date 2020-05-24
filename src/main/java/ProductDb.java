import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;


public class ProductDb {


    private ArrayList<Product> productArray = new ArrayList<>();

    //Konstruktor

    public ProductDb(ArrayList<Product> productArray) {
        this.productArray = productArray;
    }


    // Get function, to obtain Object by ID

    public  Optional<Product> getProduct(int myID) {

        for (Product product : productArray) {
            if (myID == product.getProductID()) {
                return Optional.of(product);
            }

        }return Optional.empty();



    }

// List Funktion, um alle Produkte auszugeben

    public void list() {

        for (Product product : productArray) {
            System.out.println(product.getProductName());

        }


    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDb productDb = (ProductDb) o;
        return productArray.equals(productDb.productArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productArray);
    }

    @Override
    public String toString() {
        return "ProductDb{" +
                "productArray=" + productArray +
                '}';
    }
}









