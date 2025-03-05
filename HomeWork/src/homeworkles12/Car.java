package homeworkles12;

public class Car {
    //використовуємо публічний метод start який буде запускати наш автомобіль
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Car is staring...");
    }
    //викликаємо приватні методи які будуть запускати окремі системи автомобіля
    //переваги такого типу інкапсуляції в тому що користувач не знає чк саме запускається авто
    //якщо треба змінити логіку запуску то змінюємо лише внутрішні методи
    private void startElectricity() {
        System.out.println("Electricity system started.");

    }

    private void startCommand() {
        System.out.println("Command system activated");

    }

    private void startFuelSystem() {
        System.out.println("Fuel system initiated.");
    }
}
