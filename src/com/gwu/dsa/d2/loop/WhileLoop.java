package com.gwu.dsa.d2.loop;

public class WhileLoop {
    public static void main(String[] args) {
        int originalNumber = 129;

        int reversedNumber = 0;

        int originalNumberCopy = originalNumber;

        int multiplicationFactor = 10;


        // 129 => 129 % 10 => 9


        while(originalNumber != 0) {
            int rem = originalNumber % 10;
            int q = originalNumber / 10;
            reversedNumber = reversedNumber * multiplicationFactor + rem;
            originalNumber = q;

        }

        System.out.println(reversedNumber == originalNumberCopy);
    }
}
