package org.example.queue;

import org.example.array.Array;

public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;

    public ArrayQueue() {
        this.array = new Array<>();
    }

    public ArrayQueue(int capacity) {
        this.array = new Array<>(capacity);
    }

    @Override
    public void enqueue(E value) {
        array.addLast(value);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.get(0);
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }
}
