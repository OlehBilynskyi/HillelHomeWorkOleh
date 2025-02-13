package homeworkles06;

public class Main {
    public static void main(String[] args) {
        // змінна totalSum буде зберігати загальну суму чисел
        int totalSum = 0;
        //використовуємо цикл for який буде виконуватись поки i не перевищить 6
        /* використаємо ініціалізацію змінної i яка буде починатись з 1 за допомогою int - int = 1
        за умовою i <=6, а i++ буде збільщувати i на 1 після кожного проходу циклу
         */

        for (int i = 1; i <= 6; i++){
            //totalSum = totalSum + i (можна записати скорочено +=) додає і до загальної суми
            totalSum += i;
            //створюємо рядок з номером ітерації , числом i та сумою totalSum та виводимо
            System.out.println(i + ") Num is " + i + ", sum is " + totalSum);
        }
        //виводимо загальну суму
        System.out.println("Sum of numbers is " + totalSum);
    }
}
