package Interfaces_and_abstract_classes;

public abstract class AbstractShape<T> implements Shape {

    protected T color;

    public AbstractShape(T color){
        this.color = color;
    }

    public T getColor(){
        return color;
    }
}
