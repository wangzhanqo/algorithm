package org.example.stack;

import org.example.array.Array;

public class ArrayStack<E> implements Stack<E> {

    private Array<E> array;

    public ArrayStack(int capacity) {
        this.array = new Array<>(capacity);
    }

    public ArrayStack() {
        this.array = new Array<>();
    }

    @Override
    public void push(E value) {
        array.addLast(value);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack: ");
        stringBuilder.append('[');
        for (int i = 0; i < array.getSize(); i++) {
            stringBuilder.append(array.get(i));
            if (i != array.getSize() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("] top");
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        for (int i = 0; i < 10; i++) {
            arrayStack.push(i);
            System.out.println(arrayStack);
        }
        Thread thread = new Thread(() -> {
            Integer pop = arrayStack.pop();
            System.out.println(pop);
        });
        thread.start();
        Thread thread1 = new Thread(() -> {
            Integer pop = arrayStack.pop();
            System.out.println(pop);
        });
        thread1.start();

        thread1.join();
        thread.join();
        System.out.println(arrayStack);
    }

    public static void match(String memo) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (int i = 0; i < memo.length(); i++) {
            char c = memo.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return;
                }
                char topChar = stack.pop();
                if (c == ')' && topChar != '(') {
                    return;
                }
            }
        }
    }
}
