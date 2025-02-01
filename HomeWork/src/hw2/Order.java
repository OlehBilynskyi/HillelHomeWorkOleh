package hw2;

public class Order {
    private final int orderNumber;
    private final String clientName;
    private final String product;
    private final double price;
    private final String address;
    public Order(int orderNumber, String clientName, String product, double price, String address){
        this.orderNumber = orderNumber;
        this.clientName = clientName;
        this.product = product;
        this.price = price;
        this.address = address;
    }
    public void  printOrderDetails() {
        System.out.println("Order No " + orderNumber + " Client: " + clientName + ".");
        System.out.println("Product: " + product + ".");
        System.out.println("Price EUR " + price + "." );
        System.out.println("Address: "+ address + ".");
    }
}