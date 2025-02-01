package hw2;

public class Main {
    public static void  main(String[] args) {
        Order order1 = new Order(1, "Alice", "smartphone", 305.99, "Moon Street, 10");
        Order order2 = new Order(2, "Tom", "laptop", 570.95, "Terra Street, 17");
        order1.printOrderDetails();
        order2.printOrderDetails();
    }
}