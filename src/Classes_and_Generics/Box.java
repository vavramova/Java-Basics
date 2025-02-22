package Classes_and_Generics;

public class Box<T> extends AbstractContainer<T>{

    @Override
    public T getItem(int idx) {
        if(idx >= 0 && idx < items.size()){
            return items.get(idx);
        }

        throw new IndexOutOfBoundsException("Invalid index!");
    }
}
