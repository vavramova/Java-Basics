package Classes_and_Generics;

public interface Container<T>{
    void addItem(T item);
    T getItem(int idx);
    int size();
}
