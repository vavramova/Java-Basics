package Interfaces_and_abstract_classes;

public class Circle<T> extends AbstractShape{
    private final double radius;

    public Circle(double radius, T color){
        super(color);
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
