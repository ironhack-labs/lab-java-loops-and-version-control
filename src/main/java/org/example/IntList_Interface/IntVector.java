 package org.example.IntList_Interface;

 public class IntVector  implements IntList {
     private int[] array;
     private int size;

     public IntVector() {
         array = new int[20];
         size = 0;
     }

     @Override
     public void add(int number) {
         if (size == array.length) {
             int newCapacity = array.length * 2;
             int[] newArray = new int[newCapacity];
             for (int i = 0; i < array.length; i++) {
                 newArray[i] = array[i];
             }
             array = newArray;
         }
         array[size] = number;
         size++;
     }

     @Override
     public int get(int id) {
         if (id < 0 || id >= size) {
             throw new IndexOutOfBoundsException("Index: " + id + "Size: " + size);
         }
         return array[id];
     }

     public int size() {
         return size;
     }

     public int cpaCity() {
         return array.length;
     }
 }
