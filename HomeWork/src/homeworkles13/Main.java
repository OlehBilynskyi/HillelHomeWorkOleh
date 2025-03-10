package homeworkles13;

public class Main {
    public static void main(String[] args) {
        //створюємо масив фігур що містить наші обєкти (масив може містити будь-які об'єкти, що реалізують інтерфейс Shape)
        Shape[] shapes = {
                new Circle(5),
                new Triangle(4, 6),
                new Square(3),
        };

        //викликаємо метод getTotalArea() передаючи йому масив shapes і результат записуємо у змінну totalArea
        //double totalArea - змінна для збереження загальної площі всіх фігур.
        //getTotalArea(shapes) - метод підрахує сумарну площу всіх фігур
        double totalArea = getTotalArea(shapes);
        System.out.println("Загальна площа фігур: " + totalArea);
    }
    //метод приймає масив фігур і повертає загальну площу
    public static double getTotalArea(Shape[] shapes) {
        double sum = 0; //створюємо змінну sum для підрахунку загальної площі
        //викликаємо цикл який перебирає кожну фігуру shape у масиві shapes
        for (Shape shape : shapes){
            //викликаємо getArea та сумуємо площі
            sum += shape.getArea();
        }
        return  sum; //повертаємо загальну площу всіх фігур
    }
}