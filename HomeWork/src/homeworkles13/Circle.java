package homeworkles13;

//implements Shape - означає що клас Circle реалізує інтерфейс Shape
public class Circle implements Shape {
    // поле для збереження радіуса
    private final double radius;
    //створюємо конструктор який буде приймати радіус
    public Circle(double radius) {
        this.radius = radius;
    }
    /*@Override - анотація в Java, яка використовується для позначення того, що метод у підкласі перевизначає
    метод із батьківського класу або інтерфейсу. Перевіряє, чи дійсно ми перевизначаємо метод, який є в батьківському
     класі або інтерфейсі.
     */
    @Override // перевизначає метод getArea(), який обчислює площу кола за формулою p*r2
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
