package homeworkles07;

import java.util.Random;
//імпорт класу рандом потрібен для генератора випадкових чисел
public class Main {
    public static void main(String[] args) {
        //створюємо масив на 20 елементів та обєкт рандом для генерації випадкових чисел
        int[] numbers = new int[20];
        Random random = new Random();
        //заповнюємо масив випадковими числами від -100 до 100(разом виходить 201 число)
        //створюємо цикл for який буде проходити через всі 20 елементів масиву
        //random.nextInt(201) згенерує число від 0 до 200 а -100 зсуває діапазон від -100 до 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(201) - 100;
        }
        //виводимо текст та числа
        System.out.println("Елементи масиву:");
        //створюємо цикл for - проходить через елементи масиву починаючи з 0 і закінчуючи numbers.length -1 (19 ел з 20чисел)
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers [i]);
            //добавляємо кому після числа (крім останнього), перевіряємо якщо і не є останнім то додається кома
            if (i < numbers.length - 1) {
                System.out.print(",");
            }
        }
        //оголошуємо змінні
        System.out.println();
        int sumNegative = 0;
        int evenCount = 0, oddCount = 0;
        int min = numbers[0], max = numbers[0];
        int minIndex = 0, maxIndex = 0;
//перебираємо всі елементи масиву за допомогою циклу for
        for (int i = 0; i < numbers.length; i++) {
            //знаходимо суму відємних чисел(якщо число відємне то додаємо його до sumNegative
            if(numbers[i] < 0) {
                sumNegative += numbers[i];
            }
            //якщо число ділиться на 2 без залишку то воно парне і збільшеємо even в іншому випадку odd
            if (numbers [i] % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;

            }
            //якщо знаходимо число менше ніж поточне то зберігаємо його min та індекс
            if (numbers[i] < min) {
                min = numbers [i];
                minIndex = i;

            }
            //якщо знаходимо число більше ніж поточне то зберігаємо його max та індекс
            if (numbers[i] >max) {
                max = numbers [i];
                maxIndex = i;
            }
        }
//середнє арифметичне після першого відємного
        /*1-змінна для збереження середнього значення
        2-зберігає індекс першого від'ємного числа
        3-сума чисел після першого від'ємного
        4-лічильник чисел після першого від'ємного
         */
        double avgAfterFirstNegative = 0;
        int firstNegativeIndex = -1;
        int sumAfterFirstNegative = 0;
        int countAfterFirstNegative = 0;
//знаходження першого відємного чила та запамятовування його індексу
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] <0) {
                firstNegativeIndex = i;
                break;
            }
        }
/*середнє арифметичне, якщо перше відємне число != - 1 і після нього є ще елементи тоді додаємо наступні чила
до sumAfterNegative; підраховуємо у contAfterNegative; обчислюємо середнє avgAfterNegative
 */
        //перевіряємо чи є відємне число та чи після першого відємного є ще елементи

        if(firstNegativeIndex != -1 && firstNegativeIndex < numbers.length - 1) {
            //починаємо з першого індексу після першого відємного числа
            for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
                //додаємо всі числа після першого відємного
                sumAfterFirstNegative += numbers [i];
                //вираховуємо скільки чисел додали
                countAfterFirstNegative++;
            }
            //ділимо суму всіх чисел на кількість, дабл робить результат дробовим
            avgAfterFirstNegative = (double) sumAfterFirstNegative / countAfterFirstNegative;
        }
//виводимо інформацію
        System.out.println("Сума від'ємних чисел: " + sumNegative);
        System.out.println("Кількість парних чисел: " +evenCount);
        System.out.println("Кількість непарних чисел: " +oddCount);
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")" );
        System.out.println("Найбільший елемент: " + max + " (з індексом " + minIndex + ")" );

        if (firstNegativeIndex == -1 || countAfterFirstNegative == 0) {
            System.out.println("У масиві немає від'ємних чисел.");
        }
        else {
            System.out.printf("Середнє арифметичне чисел пілся першого від'ємного числа: %.2f%n", avgAfterFirstNegative);
        }
    }
}
