import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductFactoryTest {

  @Test

  public void TestProductFactoryElectronics(){
      Product product=ProductFactory.createProduct("electronics","Laptop",10,50000);
      assertTrue(product instanceof Electronics);
  }

  @Test

  public void TestProductFactoryFurniture(){
      Product product=ProductFactory.createProduct("furniture","sofa",10,20000);
      assertTrue(product instanceof Furniture);
  }

  @Test

    public void TestProductFactoryClothing(){
        Product product=ProductFactory.createProduct("clothing","Skirt",10,500);
        assertTrue(product instanceof Clothing);
    }



}