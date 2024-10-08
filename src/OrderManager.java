import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderManager {

    public static void sortProducts(List<Product> products) {
        Collections.sort(products, Comparator
                .comparingDouble(Product::calculateTotalPrice)
                .thenComparing(Product::getName)
                .thenComparingInt(Product::getStock_quantity));
    }
}
