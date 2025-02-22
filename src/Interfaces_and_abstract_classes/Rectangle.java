package Interfaces_and_abstract_classes;

public class Rectangle<T> extends AbstractShape{
    private final double width;
    private final double height;

    public Rectangle(double width, double height, T color){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }


}
