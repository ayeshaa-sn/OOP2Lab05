public class Clothing extends Product{

    public Clothing(String name,int stock_quantity,double unit_price){
        super(name,stock_quantity,unit_price);
    }

    double tax=getUnit_price()*0.1;
    @Override
    public double calculateTotalPrice() {
        return getUnit_price()+tax;
    }




}
