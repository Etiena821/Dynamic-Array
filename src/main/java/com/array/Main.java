package com.array;

public class Main {

    public static void main(String[] args) {

        Array array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.insertAt(70, 1);
        array.reverse();
        System.out.println(array.max());
        System.out.println(array.min());
        System.out.println(array.indexOf(10));
        array.removeAt(3);
        array.print();
    }
}
