public class ProductFactory {

    public static Product createProduct(String productType,String name,int stock_quantity,double unit_price){

         switch (productType.toLowerCase()){

             case "electronics":
                 return new Electronics(name, stock_quantity, unit_price);
             case "clothing":
                 return new Clothing(name, stock_quantity, unit_price);
             case "furniture":
                 return new Furniture(name, stock_quantity, unit_price);
             default:
                 throw new IllegalArgumentException("Unknown product type: " +productType);
         }

    }

}
