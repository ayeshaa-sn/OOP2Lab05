public abstract class Product {

     private String name;
     private int stock_quantity;
     private double unit_price;


     public Product(String name,int stock_quantity,double unit_price){

         this.name=name;
         this.stock_quantity=stock_quantity;
         this.unit_price=unit_price;
     }


    public String getName() {
        return name;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public abstract double calculateTotalPrice();
}
