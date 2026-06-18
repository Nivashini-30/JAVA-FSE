import java.util.Arrays;
import java.util.Comparator;
public class ECommerceSearch {
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String name) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison =
                    products[mid].productName.compareToIgnoreCase(name);
            if (comparison == 0) {
                return products[mid];
            }
            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Tablet", "Electronics")
        };
        Product linearResult = linearSearch(products, "Shoes");
        if (linearResult != null) {
            System.out.println("Linear Search Found: "
                    + linearResult.productName); 
        }
        Arrays.sort(products,
                Comparator.comparing(p -> p.productName));
        Product binaryResult = binarySearch(products, "Shoes");
        if (binaryResult != null) {
            System.out.println("Binary Search Found: "
                    + binaryResult.productName);
        }
    }
}
