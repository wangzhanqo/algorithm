package org.example.array;

import java.util.Random;

public class Array<E> {
    private E[] data;
    private int size;


    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(E e) {
        add(size, e);
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void add(int index, E e) {
        if (size == data.length) {
            return;
        }
        if (index < 0 || index > size) {
            return;
        }
        for (int i = size -1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    public E remove(int index) {
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return ret;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException();
        }
        return data[index];
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        stringBuilder.append('[');
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i != size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Array array = new Array(1000000000);
        for (int i = 0; i < 10000000; i++) {
            array.addLast(i);
        }
        long l = System.currentTimeMillis();
        long l1 = System.currentTimeMillis();
        System.out.println((l1 - l) / 1000);
    }

    private void add() {

    }

}