package org.example.queue;

public interface Queue<E> {

    void enqueue(E value);

    E dequeue();

    E getFront();

    boolean isEmpty();

    int getSize();

}
