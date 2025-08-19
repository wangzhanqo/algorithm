package org.example.linked;

import org.example.stack.ArrayStack;
import org.example.stack.Stack;

public class LinkedStackList implements Stack<Integer> {

    private LinkedList<Integer> linkedList;

    public LinkedStackList() {
        linkedList = new LinkedList<>();
    }

    @Override
    public void push(Integer value) {
        linkedList.addFirst(value);
    }

    @Override
    public Integer pop() {
        return linkedList.removeFirst();
    }

    @Override
    public Integer peek() {
        return linkedList.getFirst();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack: top ");
        stringBuilder.append(linkedList);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LinkedStackList linkedStackList = new LinkedStackList();
        for (int i = 0; i < 10; i++) {
            linkedStackList.push(i);
            System.out.println(linkedStackList);
        }
        System.out.println(linkedStackList.pop());
        System.out.println(linkedStackList);
    }
}
