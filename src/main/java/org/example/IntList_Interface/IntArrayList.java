package org.example.IntList_Interface;

public class IntArrayList implements IntList {
    private int[] array;
    private int size;
    public IntArrayList() {
        array = new int [10];
        size = 0;
    }
    @Override
    public void add(int number){
        if (size == array.length){
            int newCapacity = (int)(array.length*1.5);
            int[] newArray = new int [newCapacity];

            for (int i=0 ; i<array.length ; i++) {
                newArray[i] = array[i];
            }
            array =newArray;
        }
        array[size] = number;
        size++   ;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id > +size) {
            throw new IndexOutOfBoundsException("Index: " + id + ", Size" + size);
        }
        return array[id];
    }
    public int size() {
        return size;
    }
    public int capacity(){
        return array.length;
    }
}
