//package org.example;
//
//public class Mark {
//    public static int findMax(int[] numbers) {
//        int max = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        int secondsMax=0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > secondMax && numbers[i] < max) {
//
//                secondMax = numbers[i];
//            }
//        }
//        return secondMax;
//        return max;
//    }
//    public static int findSecondMax(int[] numbers) {
//        int max = findMax(numbers);
//        int secondMax =Integer.MIN_VALUE;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > secondMax && numbers[i] < max) {
//
//                secondMax = numbers[i];
//            }
//        }
//        return secondMax;
//    }
//
//
//    static void main(String[] args) {
//        int [] numbers={23, 45, 62, 98, 65};
//        int result1 = findMax(numbers);
//        int result2 = findSecondMax(numbers);
//        System.out.println("The difference between the largest and smallest values is: " + result1 + " "+ result2 );
//
//    }
//}
//
////