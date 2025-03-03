package homeworkles11;

public class Main {
    public static void main(String[] args) {

        //Створюємо обєкти класу Person
        //new Person(...) – створює новий об'єкт класу Person, після цього передаємо аргументи в конструктор
        Person person1 = new Person("John", 30, "Інжинер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        //Виводимо інформацію, person1.getInfo() – викликає метод getInfo(), який повертає інформацію про особу.
        System.out.println(person1.getInfo());
        System.out.println(person2.getInfo());
        System.out.println(person3.getInfo());

//Створення ще одної особи
        Person alice = new Person("Alice", 28, "Архітектор"); //створюємо ще один обєкт класу Person
        System.out.println("\n" + alice.getInfo());

//Оновлення професії Alice, викликаємо метод setProfession("Дизайнер"), який змінює професію Alice.
        alice.setProfession("Дизайнер");
        System.out.println("(Після оновлення професії)");
        System.out.println(alice.getInfo()); //викликаємо alice.getInfo(), щоб побачити оновлені дані.
    }
}
