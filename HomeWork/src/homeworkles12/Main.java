package homeworkles12;

public class Main {

    public static void main(String[] args) {
        //створюємо обєкт класу Employee та викликаємо конструктор
        Employee employee = new Employee("Oleh Bilynskyi", "Інжинер", "obslinskj@gmail.com", "+380684067664", 28);
//виводимо текст + геттер який отримує значення FullName, Position ...
        System.out.println("Співробітник: ");
        System.out.println("ПІБ: " + employee.getFullName());
        System.out.println("Посада: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Телеон: " + employee.getPhoneNumber());
        System.out.println("Вік: " + employee.getAge());

        System.out.println("\nЗапускаємо автомобіль:");
//створюємо новий обєкт класу Car , та викликаєио метод start() у класі car
        // за допомогою цього викликаються внутрішні методи startElectricity(), startCommand(), startFuelSystem()
        Car car = new Car();
        car.start();
    }
}
