package lec04.algebra;

import java.util.Scanner;
//Напишіть програму, яка приймає відстань у кілометрах та конвертує її у милі
// коефіцієнт перетворення: 1 км = 0.621371 миль.

public class Main {
    public static void main(String[] args) {
        double conversionFactor = 0.621371;
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Distance in kilometers" );
        double kilometers = 15.3;
        double miles = kilometers * conversionFactor;
        System.out.printf( "%.2f kilometers = %.3f miles. %n", kilometers, miles);
        scanner.close();

//Конвертація годин у секунди:
//    Напишіть програму, яка приймає кількість годин і обчислює кількість секунд (години * 3600).

double hours = 2.5;
        int secondsPerHour = 3600;
        double seconds = hours * secondsPerHour;
        System.out.printf("%.2f Hours = %.0f Seconds.%n", hours, seconds);

    }
}
