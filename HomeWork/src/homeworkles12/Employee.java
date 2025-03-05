package homeworkles12;

public class Employee {
    // створюємо змінні
    //модифікатор private приховує поле від інших класів що називається інкапсуляцією
    //інкапсуляція потрібна щоб захистити дані від змін зовні.поля можна змінювати через спеціальні методи гетери,сетери
    private final String fullName;
    private final String position;
    private final String email;
    private final String phoneNumber;
    private final int age;
    //створюємо конструктор який буде заповнювати поля класу при створенні нового співробітника
//задаємо параметри, вони приймають значення які ми передаємо під час створення обєкту
    public Employee(String fullName, String position, String email, String phoneNumber, int age){
        //this.fullName це змінна всередині класу
        //this.fullName = fullName - означає що потрібно зберегти передане значення у відповідному полі класу
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    //оскільки поле fullName приватне ми не можемо читати його на пряму, тому створюємо геттер який дозволяє читати значення
    //getFullName() це назва методу, який повертає значення fullName
    //return fullName - повертає значення поля fullName
    public String getFullName(){
        return fullName;
    }

    public String getPosition(){
        return position;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public int getAge(){
        return age;
    }
}
