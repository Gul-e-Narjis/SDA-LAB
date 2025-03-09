class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Order {
    private String orderId;
    private Food food; // Order "owns" Food

    public Order(String orderId, String foodName) {
        this.orderId = orderId;
        this.food = new Food(foodName); // Creator Principle Used
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Food Ordered: " + food.getName());
    }
}

public class Withprinciple {
    public static void main(String[] args) {
        Order order1 = new Order("152", "Pizza");
        order1.showOrderDetails();
    }
}
