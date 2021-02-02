package Algorithms.Stack;

import java.util.ArrayList;

public class Queue2<T> implements Queue1<T> {

    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(T item) { list.add(item); }

    @Override
    public T remove() { return list.remove(0); }

    @Override
    public boolean isEmpty() { return list.isEmpty(); }
}