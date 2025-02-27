package homeworkles10;

import java.util.Scanner;

public class Main {
    //1. Метод для обчислення квадрата числа
    //(static означає, що метод належить класу Main,а не конкретному об’єкту цього класу.)
    //getSquare - імя методу, (int number) - параметр методу, int - тип даних (ціле число)
    public static int getSquare(int number) {
        //return - оператор який повертає значення з методу назад у місце виклику
        return number * number;
    }
    //2.Метод для обчислення об'єму циліндра
    // double повертає дробове число (обєм не обовязково ціле число), (double radius, double height) - два параметри
    public static double calculateCylinderVolume(double radius, double height) {
        // Math.PI – константа пі (3.14..)
        return Math.PI * radius * radius * height;
    }

    //3.Метод для обчислення суми масиву
    public static int sumArray(int[] array) {
        //sum = 0 – ініціалізуємо змінну значенням 0, бо на початку сума ще не порахована
        int sum = 0;
        //використаємо цикл for який перебирає кожен елемент масиву
        //(int num : array) означає що кожен елемент array буде збережений у змінній num.
        for (int num : array) {
            //додаємо num до sum (sum = sum + num)
            sum += num;
        }
        //return - передає результат у main, sum - змінна що містить суму елементів масиву
        return sum;
    }
    //4.Метод для реверсу рядка
    //String text - параметр методу: String - тип параметру(рядок), text - змінна, що містить вхідний рядок.
    public static String reverseString(String text){
        /*StringBuilder - клас для роботи з рядками, new StringBuilder(text) -створюємо новий об'єкт StringBuilder
        на основі вхідного рядка text, .reverse() - викликає метод, який перевертає всі символи у зворотному порядку.
        toString()- перетворює StringBuilder назад у String, щоб повернути результат.
         */
        return new StringBuilder(text).reverse().toString();
    }

    //5.Метод для піднесення до степеня
    //Math.pow(a, b) - використовуємо метод pow() з класу Math, щоб піднести a до степеня b
    public static int power (int a, int b) {
        return (int) Math.pow(a,b);
    }

    //6.Метод для повторення рядка n разів
    //int n- ціле число, яке вказує, скільки разів повторити текст. String text - рядок text, який потрібно повторювати.
    public static String repeatText(int n, String text) {
        //StringBuilder- клас для роботи з рядками, result – змінна, яка буде накопичувати результат (повторений текст).
        //new StringBuilder()- створює порожній обєкт StringBuilder.
        StringBuilder result = new StringBuilder();
        //створюємо цикл для повторення тексту n разів, і- починаємо х нуля, вмконуємо цикл поки і менше n
        for (int i = 0; i < n; i++) {
            //result.append(text)- додає рядок text у StringBuilder,.append("\n") – кожен текст з нового рядка).
            result.append(text).append("\n");
        }
        return  result.toString();
    }

    public static void main(String[] args) {
        //створюємо обєкт сканер щоб отримувати вхідні дані від користувача
        Scanner scanner = new Scanner(System.in);

//1.Введення числа і обчислення його квадрата:
        //Програма виводить запит на введення числа, вводиться ціле число, яке зберігається в змінній number.
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        //Викликаємо метод getSquare(number), який обчислює квадрат числа. Результат зберігається в змінній square.
        int square = getSquare(number);
        System.out.println("Квадрат числа " + number + " дорівнює " + square + ".");


//2. Введення радіусу та висоти циліндра і обчислення його об'єму:
        //Виводимо запит на введення радіусу і висоти циліндра.
        //Вводимо значення радіусу (radius) і висоти (height), які зберігаються в змінних типу double.
        System.out.print("\nВведіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        //Викликаємо метод calculateCylinderVolume, який обчислює обєм циліндра за формулою зберігає результат у змінній volume.
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("Об'єм циліндра дорівнює " + volume + ".");

//3.Обчислення суми елементів масиву:
        //Оголошуємо масив чисел array з п'яти елементів.
        int[] array = {10, 20, 30, 40, 50};
        //Викликаємо метод sumArray(array), який обчислює суму всіх елементів масиву.
        int sum = sumArray(array);
        System.out.println("\nМасив чисел: [10, 20, 30, 40, 50]");
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

        //4.Введення і перевертання рядка:
        System.out.print("\nВведіть рядок ");
        scanner.nextLine(); //використовується для читання нової строки.
        //Вводимо текстовий рядок, який зберігається в змінній text.
        String text = scanner.nextLine();

        String reversedText = reverseString(text);
        //викликаємо метод reverseString(text) який перевертає рядок
        System.out.println("Рядок у зворотньому порядку: " + reverseString(text));

//5.Обчислення ступеня числа:
        /*Виводимо запити на введення двох цілих чисел: a і b, викликаємо метод power(a, b), який обчислює результат
         піднесення числа a до степеня b.
         */
        System.out.print("\nВведіть число a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть число b: ");
        int b = scanner.nextInt();
        int result = power(a, b);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + result + ".");


        //6.Повторення тексту задану кількість разів:
        //Виводимо запити на введення цілих чисел n (кількість повторів) і рядка, який потрібно повторити.
        System.out.print("\nВведіть ціле число n: ");
        int n = scanner.nextInt();
        System.out.print("Введіть текстовий рядок: ");
        //scanner.nextLine() - використовуємо для зчитування нового рядка після числа.
        scanner.nextLine();
        String repeatedText = scanner.nextLine();
        //Викликаємо метод repeatText(n, repeatedText), який повторює рядок repeatedText n разів.
        System.out.print(repeatText(n, repeatedText));



    }
}
/*різниця між String та StringBuilder:
String – незмінний (immutable). Будь-яка операція зміни створює новий об’єкт у пам’яті.
StringBuilder – змінний (mutable). Його можна змінювати без створення нового об'єкта.
String при кожній зміні створює новий об'єкт, що може бути повільним, особливо в циклах.
StringBuilder змінює свій вміст без створення нових об'єктів, що значно швидше при частих змінах.
String використовується, якщо рядок не змінюється після створення.
StringBuilder використовується, якщо рядок часто змінюється (наприклад, у циклах або при збиранні довгих рядків).
 */
