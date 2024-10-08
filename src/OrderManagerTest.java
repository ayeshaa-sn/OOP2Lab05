import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {

    @Test

    public void TestOrderByTotalPrice(){
        ArrayList<Product>products=new ArrayList<>();
        products.add(new Electronics("Laptop",5,50000));
        products.add(new Furniture("Sofa",5,20000));
        products.add(new Clothing("skirt",5,500));

        OrderManager.sortProducts(products);
        assertEquals("skirt",products.get(0).getName());
        assertEquals("Sofa",products.get(1).getName());
        assertEquals("Laptop",products.get(2).getName());
    }

    @Test

    public void TestOrderByProductName(){
        

    }

}