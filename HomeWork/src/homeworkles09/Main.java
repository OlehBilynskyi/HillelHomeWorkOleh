package homeworkles09;
import java.util.Random;
//клас Random дозволяє генерувати випадкові числа
public class Main {
    public static void main(String[] args) {
        int[] [] matrix = new int[4][4];
        //створюємо двовимірний масив матрицю 4х4 який буде містити цілі числа
        Random random = new Random();
//створюємо обєкт рандом який дозволяє отримувати випадкові числа
        //заповнюємо матрицю випадковими числами
        for (int i = 0; i < 4; i++) {
            //перебираємо рядки матриці від 0 до 3
            for (int j = 0; j < 4; j++) {
                //перебираємо стовпці матриці
                matrix [i] [j] = random.nextInt(50) + 1;
                // random.nextInt генерує випадкове число від 0 до 49, +1 зміщує діапазон щоб отримати від 1 до 50
            }
        }
        //Виведення матриці на екран
        System.out.println("Матриця 4x4:");
        //row - рядок матриці, перебираємо всі рядки
        for (int[] row : matrix) {
            for (int num : row) {
                //num - число, перебираємо всі числа у рядку
                System.out.printf ("%3d ", num);
                //виводимо числа з відступами у 3 символи
            }
            //та переходимо на новий рядок після кожного рядка матриці
            System.out.println();
        }

// Обчислення сум елементів у парних і непарних рядках
        //Створюємо змінні для збереження сум
        int evenRowSum = 0, oddRowSum = 0;
        //i - індекс рядка в матриці, j - індекс стовпця в поточному рядку,
        for (int i = 0; i <4; i++) {   // перебираємо рядки
            for (int j = 0; j < 4; j++) {  // перебираємо стовпці
                if (i % 2 == 0) {
                    // перевіряємо чи номер рядка парний , оператор % (остача від ділення) перевіряє чи число і парне
                    evenRowSum += matrix [i] [j];
                    // якщо номер рядка парний (0,2) додаємо до evenRowSum якщо ні то додаємо до oddRowSum
                } else {
                    oddRowSum += matrix [i] [j];
                }
            }
        }
        //обчислення лобутків елементів у парних і непарних стовпцях
        //використовуємо long бо добутки можуть містити великі числа
        long evenColumnProduct = 1, oddColumnProduct = 1;//початкове значення змінної 1 тому що 1 використовується при *
        //перебираємо стовпці бо потрібно дізнатись добуток у стовпцях
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                if (j % 2 == 0) {
                    //якщо номер стовпця парний (0,2) множимо evenColumnProduct, якщо ні то на evenColumnProduct
                    evenColumnProduct *= matrix [i] [j];
                } else {
                    oddColumnProduct *= matrix [i] [j];
                }
            }
        }
        //виводимо результати
        System.out.println("\nСума елементів у парних рядках (рядок 0, 2): " +evenRowSum);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " +oddRowSum);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " +evenColumnProduct);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " +oddColumnProduct);
//перевіряємо чи є матриця магічним квадратом
        if (isMagicSquare(matrix)) {
            System.out.println("\nМатриця є магічним квадратом.");
        } else {
            System.out.println("\nМатриця не є магічним квадратом.");
        }
    }
    //реалізовуємо метод isMagicSquare та виводимо результат
    public static boolean isMagicSquare(int [] [] matrix){
        int size = matrix.length;
        int[] sums = new int[2 * size + 2];
//перевіряємо суми рядків, стовпців та діагонелей, якщо всі рівні повертаємо true, в іншому випадку false
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sums [i] += matrix [i] [j];
                sums [size + j] += matrix [i] [j];
                if (i == j) sums[2 * size] += matrix [i] [j];
                if (i + j == size - 1) sums[2 * size + 1] += matrix [i] [j];
            }
        }
        for (int i = 1; i < sums.length; i++){
            if (sums[i] != sums[0]) return false;
        }
        return true;
    }
}
