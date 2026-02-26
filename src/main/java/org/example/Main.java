package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

 public class Main {

    // Method 1: Round to nearest hundredth, return double
    public static double roundToHundredth(BigDecimal num) {

        return num.setScale(2, RoundingMode.HALF_DOWN).doubleValue();
    }
    public static BigDecimal reversAndRound(BigDecimal num) {
       return num.negate().setScale(1, RoundingMode.HALF_UP);
    }


    public static void main(String[] args) {

        BigDecimal result1 = new BigDecimal("4.245222");

        BigDecimal result2 = new BigDecimal("1.2343");
        BigDecimal result3 = new BigDecimal("-1.2343");

        System.out.println(roundToHundredth(result1));

        System.out.println(reversAndRound(result2));
        System.out.println(reversAndRound(result3));


    }
 }