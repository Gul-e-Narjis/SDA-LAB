class order{
    private String orderId;
    private String FoodName;
     public order(String orderId, String FoodName ){
        this.orderId=orderId;
        this.FoodName=FoodName;
     }
     public void showOrderDetails(){
        System.out.println("Order ID " + orderId);
        System.out.println("Food Ordered "+ FoodName);
     }
}
class Food{
    private String name;
    
    public Food(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
}
public class Withoutprinciple {
    public static void main(String[] args) {
        Order order1=new Order("152", "Pizza");
        order1.showOrderDetails();

    }
}
