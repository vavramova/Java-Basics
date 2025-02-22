package Classes_and_Generics;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractContainer<T> implements Container<T>{
    protected List<T> items;

    public AbstractContainer(){
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public int size() {
        return items.size();
    }
}
