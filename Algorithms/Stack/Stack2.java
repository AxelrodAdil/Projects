package Algorithms.Stack;

import java.util.ArrayList;

public class Stack2<T> implements Stack1<T> {

    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void push(T item) {
        list.add(0, item);
    }

    @Override
    public T pop() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}