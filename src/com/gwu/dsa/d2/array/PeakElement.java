package com.gwu.dsa.d2.array;

class PeakElementSolution {

    /**
     *
     * Time complexity of this solution in worst case is O(n) where n is the total number of elements in the array.
     * @param ar
     * @param n
     * @return
     */

    int peakElement(int ar[], int n)
    {
        for(int i = 0 ; i < n ; i++) {
            if(i == 0) {
                if(ar[i] >= ar[i+1]) {
                    return i;
                }
            } else if(i == n - 1) {
                if(ar[i] >= ar[i - 1]) {
                    return i;
                }
            } else {
                if(ar[i] >= ar[i - 1] && ar[i] >= ar[i + 1]) {
                    return i;
                }
            }
        }

        return 0;

    }
}

public class PeakElement {
    public static void main(String[] args) {
        PeakElementSolution obj = new PeakElementSolution();
        int[] ar = new int[]{2, 3, 4, 6, 5};
        System.out.println("Element at " + obj.peakElement(ar, ar.length) + " index is the peak element.");

        /**
         *
         * If you want to take input from user - take reference from TwoSumSolution.java
         *
         */
    }
}
