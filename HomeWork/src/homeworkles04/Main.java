package homeworkles04;

public class Main {
    public static void main(String[] args) {
        // вносимо дані для двох продуктів за допомогою методу calculateSales
        calculateSales(1, "smartphone", 50, 243.07, 5 );

        calculateSales(2, "laptop", 14, 749.06, 7);
    }
    private static void calculateSales(int productNo, String productName, int quantity, double price, int days){
      //формула загальної суми продажів та середньої суми продажів
       double totalSales = quantity * price;
       double dailySales = totalSales / days;
       // %d - вивід цілого числа, %s- вивід рядків, %,.2f вивід чисел з плаваючою точкою і точн 2 знаки після коми
        //%n - символ нового рядка
       System.out.printf("Product No %d: %s,%ntotal sales for %d days is EUR %,.2f%nsales by day is EUR %,.2f.%n",
               productNo, productName, days, totalSales, dailySales);
    }
}
