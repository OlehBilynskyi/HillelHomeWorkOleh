package homeworkles13;

public class Square implements Shape{
    //side зберігає довжину сторони квадрата
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    //getArea повертає площу квадрата
    public double getArea(){
        return side * side;
    }
}
