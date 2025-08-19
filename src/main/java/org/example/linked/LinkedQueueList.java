package org.example.linked;

import org.example.queue.Queue;

public class LinkedQueueList implements Queue<Integer> {

    private class Node {
        public Integer e;
        public Node next;

        public Node() {
            this(null, null);
        }

        public Node(Integer e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(Integer e) {
            this(e, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head, tail;
    private int size;

    public LinkedQueueList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(Integer value) {
        if (tail == null) {
            tail = new Node(value);
            head = tail;
        } else {
            tail.next = new Node(value);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public Integer dequeue() {
        if (isEmpty()) {
            return -1;
        }
        Node retNode = head;
        head = head.next;
        retNode.next = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return retNode.e;
    }

    @Override
    public Integer getFront() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }
}
