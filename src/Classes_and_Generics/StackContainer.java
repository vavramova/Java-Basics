package Classes_and_Generics;

public class StackContainer<T> extends AbstractContainer<T>{

    @Override
    public T getItem(int idx) {
        throw new UnsupportedOperationException("Does not support index access!");
    }

    public T pop(){
        if(items.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }

        return items.removeLast();
    }

}
