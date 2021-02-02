package Algorithms.Stack;

public interface Queue1<T> {
    void add(T item);   // добавить элемент в конец очереди
    T remove();         // извлечение элемента из начала очереди
    boolean isEmpty();
}