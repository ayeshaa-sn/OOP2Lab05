import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test

    public void ElectronicsTest(){
        Product electronics=new Electronics("Laptop",10,50000);
        assertEquals(57500,electronics.calculateTotalPrice(),0.01);
    }

    @Test

    public void ClothingTest(){
        Product clothing=new Clothing("Skirt",20,500);
        assertEquals(550,clothing.calculateTotalPrice(),0.01);
    }

    @Test

    public void FurnitureTest(){
        Product furniture=new Furniture("Sofa",5,20000);
        assertEquals(21600,furniture.calculateTotalPrice(),0.01);
    }

}