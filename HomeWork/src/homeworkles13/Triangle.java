package homeworkles13;

public class Triangle implements Shape{
    //зберігаємо основу і висоту трикутника
    private final double base;
    private final double height;
    //створюємо конструктор який приймає сторону та перпендикуляр трикутника
    public  Triangle (double base, double height){
        this.base = base;
        this.height = height;
    }
    // повертаємо площу з getArea за формуло.
    @Override
    public double getArea(){
        return 0.5 * base * height;
    }
}
