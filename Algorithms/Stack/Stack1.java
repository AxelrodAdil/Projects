package Algorithms.Stack;

    public interface Stack1<T> {
        void push(T item);      //добавить элемент на вершину стека
        T pop();                //взять элемент с вершины стека
        boolean isEmpty();
    }