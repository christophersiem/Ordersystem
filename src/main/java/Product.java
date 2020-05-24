import java.util.Objects;

public class Product {

    private int productID;
    private String productName;
    private double price;


    public Product(int productID, String productName, double price) {

        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }


    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID &&
                Double.compare(product.price, price) == 0 &&
                productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, productName, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
