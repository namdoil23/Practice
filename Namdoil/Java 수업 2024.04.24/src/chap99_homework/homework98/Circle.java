package chap99_homework.homework98;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

}
