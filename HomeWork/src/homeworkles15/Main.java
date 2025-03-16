package homeworkles15;

public class Main {
    public static void main(String[] args) {
        //Створюємо об'єкт advisor
        // DayAdvisor містить метод advise(Day day), який виводить рекомендацію для певного дня
        DayAdvisor advisor = new DayAdvisor();
//Використовуємо цикл for для перебору всіх днів тижня
        //Day.values() – це метод enum, який повертає масив усіх значень enum Day
        // Цикл for-each, проходить по кожному дню тижня і зберігає його у змінну day
        for (Day day : Day.values()) {
            System.out.print(day + ": ");
            advisor.advise(day); //Викликаємо метод advise який містить switch case і додає рекомендацію
        }



       /* Також ми можемо вивести якийсь конкретний день вручну
       today змінна типу Day, яка містить одне з значень enum Day (це може бути будь-який день тижня
       Вручну встановлюємо, що today = Day.Sunday, програма працюватиме саме з неділею.
       Day today = Day.SUNDAY;
        System.out.print(today + ": ");
        advisor.advise(today);
        */
    }
}
