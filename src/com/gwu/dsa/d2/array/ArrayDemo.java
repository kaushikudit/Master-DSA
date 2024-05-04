package com.gwu.dsa.d2.array;

public class ArrayDemo {

    public static void main(String[] args) {

        int n = 1000000;

        int[] ar = new int[n];


        // insertion
        for(int i = 0 ; i < ar.length ; i++) {
            ar[i] = i * 10;             // 1 unit (ns, micro-sec, ms, s..)      => O(n)
        }



        // display
        for(int i = 0 ; i < ar.length ; i++) {
            System.out.println(ar[i]);
        }



        // O(n + n) => O(2n)    => O(c * n) => O(N)

    }


}
