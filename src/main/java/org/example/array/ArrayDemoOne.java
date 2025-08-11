package org.example.array;

public class ArrayDemoOne {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int[] scores = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        Array array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);
        array.add(1, 100);
        System.out.println(array);
    }
}
