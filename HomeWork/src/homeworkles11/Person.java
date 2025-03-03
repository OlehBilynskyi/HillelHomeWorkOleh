package homeworkles11;

class Person {
    //створюємо клас під назвою Person
    //оголошуємо атрибути класу, private - модифікатор доступу який означає зо змінні доступні тільки в середині класу
    private final String name;  // змінна яка зберігає ім'я людини у вигляді тексту (String- тип даних для рядків)
    private final int age; // змінна для зберігання віку у вигляді цілого числа
    private  String profession;


//Створюємо конструктор
// public означає, що конструктор доступний з інших класів (його можна викликати при створенні об'єкта)

//Person(..) конструктор, який приймає три аргументи

    //String name, int age, String profession - параметри конструктора які передаються під час створення обєкта
    public Person(String name, int age, String profession){
        /*this.name - означає змінну класу (яка була оголошена раніше), а name – це параметр конструктора.
        Це потрібно, щоб відрізнити змінну класу від аргументу методу.
         */
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
    //Метод для зміни професії
    //setProfession(String newProfession) метод який приймає один параметр newProfession і встановлює його для відповідної особи
    public void  setProfession(String newProfession) { //void – означає, що метод нічого не повертає після виконання
        this.profession = newProfession; //оновлюємо значення profession у об'єкті, на який посилається this.
    }
    //Метод для отримання інформації про особу
    //getInfo() – метод без параметрів, який повертає рядок з інформацією про особу.
    public String getInfo() {
        //return – використовується для повернення значення з методу.
        return "Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession;
    }
}
