package homeworkles14;

public class Main {
    public static void main(String[] args) {

        //створюємо об'єкт ConsolePrinter, але він представлений як Printer (поліморфізм)
        Printer printer = new ConsolePrinter();

        // Створюємо різні повідомлення
        ConsolePrinter.Message msg1 = new ConsolePrinter.Message("Привіт!", "Олег");//відомий відправник і текст
        ConsolePrinter.Message msg2 = new ConsolePrinter.Message("Як справи?", null); // невідомий відправник
        ConsolePrinter.Message msg3 = new ConsolePrinter.Message(null, null); //порожнє повідомлення

        // Викликаємо метод print для кожного випадку
        printer.print(msg1);
        printer.print(msg2);
        printer.print(msg3);
    }
}
