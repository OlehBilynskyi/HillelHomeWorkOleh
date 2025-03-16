package homeworkles15;

//Створюємо публічний клас, який буде реалізовувати наш інтерфейс та містиди метод advise(Day day)
public class DayAdvisor implements Advisor{
    //@Override показує, що ми перевизначаємо метод advise з інтерфейсу Advisor
    @Override
    public void advise (Day day) {
        //додаємо конструкцію switch-case для перевірки значення day
        //switch (day) перевіряє, яке значення має змінна day
        //day - це enum, можливі варіанти обмежені (пн-нд)
        switch (day) {
            //якщо day дорівнює будь-якому з цих значень, виконується наступний блок коду
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Працюйте продуктивно! Використовуйте тайм-менеджмент.");
                break; //break; - зупиняє виконання switch, щоб не продовжувати далі
            //якщо day == FRIDAY, програма виведе Happy Friday!
            case FRIDAY:
                System.out.println("Happy Friday!.");
                break;
            //Якщо day == SATURDAY або day == SUNDAY, виконується друк рекомендації для вихідних
            case SATURDAY:
            case SUNDAY:
                System.out.println("Вихідні! Рекомендуємо відвідати кінотеатр або музей.");
                break;
        }

    }
}
