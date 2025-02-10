package homeworkles05;

import java.util.Scanner;
//сканер створюємо для того щоб вводити суму доходу
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть суму доходу");
        //в консолі прописуємо суму доходу і отримаємо суму податку
        double income = scanner.nextDouble();
        //для зберігання результату обчислення податку використовується змінна tax
        //використовуємо тернарний оператор щоб зробити перевірки, тут ми маємо дві умови, якщо вони не виконуються то застосовується третя
        double tax = (income <= 10000) ? income * 0.025:
                (income <= 25000) ? income * 0.043:
                        income * 0.067;
        scanner.close();

        System.out.printf("Сума податку : %.2f", tax);
    }
}
