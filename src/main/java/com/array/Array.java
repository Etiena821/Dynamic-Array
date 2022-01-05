package com.array;

public class Array {
// Build a dynamic array from scratch
    private int[] items;
    private int count;
    private int[] newItems;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {

        if (items.length == count) {

            newItems = new int[count * 2];

            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }

        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }

    public int indexOf(int item) {

        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    public int max() {
        int maxValue = items[0];

        for (int i = 1; i < count; i++) {
            if (items[i] > maxValue)
                maxValue = items[i];
        }

        return maxValue;
    }

    public int min() {
        int minValue = items[0];

        for (int i = 1; i < count; i++) {
            if (items[i] < minValue)
                minValue = items[i];
        }

        return minValue;

    }


    public void reverse() {
        int length = items.length;

        for (int i = 0; i < length/2; i++) {

            int swap = items[i];
            items[i] = items[length - i - 1];
            items[length - i - 1] = swap;
        }

    }

    public void insertAt(int item, int index) {

        for(int i=items.length-1; i > index; i--){
            items[i] = items[i-1];
        }
        items[index] = item;
    }


    public void print() {

        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}
