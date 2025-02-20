package homeworkles08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//клас Arrays - для зручнішого виведення масива
//клас Random - для генерації рандомних чисел
//клас Scanner - для того щоб вводити дані з консолі

public class Main {
    public static void main(String[] args) {
        //створюємо масив на 15 елементів
        int[] array = new int[15];
        Random random = new Random();
//заповняємо масив випадковими числами
        for (int i = 0; i < array.length; i++) {
            //генерація числа від 1 до 100
            array[i] = random.nextInt(100) + 1;
        }
        System.out.println("Початковий масив: " + Arrays.toString(array));
        //метод сортування вставками
        insertionSort(array);

        System.out.println("Відсортований масив: " + Arrays.toString(array));
// отримуємо число для пошуку яке вводить користувач
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();
        //виклик бінарного пошуку та виведення результату

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Індекс числа " + target + " у відсортованому масиві: " + index);

        } else {
            System.out.println("Число " + target + " не знайдено в масиві.");
        }

    }
    //int[] array - приймає масив цілих чисел який буде відсортовано
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            //key — це елемент, який будемо вставляти у правильне місце серед попередніх відсортованих елементів
            int key = array[i];
            //j = i - 1 - останній відсортований перед key елемент
            int j = i - 1;
//переміщуємо більші елементи в право
            //array[j] > key - поки попередній елемент більший ніж key, зсуваємо його в право
            while (j >= 0 && array[j] > key){
                //зсуваємо більший елемент в право щоб звільнити місце для key
                array[j + 1] = array[j];
                //переходимо на елемент лівіше щоб порівняти key з наступним попереднім елементом
                j--;
            }
            //коли всі більші елементи зсунулись в право вставляємо key у правильне місце
            array[j + 1] = key;


        }
    }
    //метод реалізує бінарний пошук, який використовується для швидкого знаходження елемента у відсортованому масиві
    //int[] array -відсортований масив у якому будемо шукати, int target -число, яке шукаємо у масиві
    public static int binarySearch(int[] array, int target) {
        //left = 0 - початок масиву, array.length - 1 кінець масиву - щоб пошук почався по всьому масиву
        int left = 0, right = array.length - 1;
        //пошук триває поки left не став більшим від right, в такому випадку елемент відсутній
        while (left <= right) {
            /*обчислюємо середній індекс (щоб не було переповнення при великих числах), де (right - left) / 2 - це
            віддстань від left до середини
             */
            int mid = left + (right - left) / 2;
            // якщо середній елемент дорівнює target, повертаємо його індекс (mid)
            if (array[mid] == target) {
                return mid;

                /*якщо середній елемент менший значить число знаходиться праворуч,
                зсуваємо left на mid + 1 та відкиємо ліву частину
                 */

            } else if (array[mid] < target){
                left = mid + 1;

               /*якщо середній елемент більший значить число знаходиться ліворуч,
                зсуваємо right на mid - 1 та відкиємо праву частину
                 */

            }  else {
                right = mid - 1;

            }
        }
        //якщо left став більшим від right то елемента немає в масиві, повертаємо -1 як ознаку відсутності
        return - 1;
    }

}
