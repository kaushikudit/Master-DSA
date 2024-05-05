package com.gwu.dsa.d3;

/**
 * https://leetcode.com/problems/majority-element/
 */

class MESolution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        /**
         *
         * Time complexity of this solution in worst case is O(n^2) where n => number of elements given in the array.
         *
         */

        // for(int i = 0 ; i < n ; i++) {
        //     int count = 1;
        //     for(int j = i + 1 ; j < n ; j++) {
        //         if(nums[j] == nums[i]) {
        //             count++;        // count = count + 1 // count += 1 // ++count;
        //         }
        //     }

        //     if(count > n / 2) {
        //         return nums[i];
        //     }
        // }

        // return 0;



        // Time complexity of this solution in worst case is O(n) where n => number of elements given in the array.
        // Moore's voting algorithm.

        int me = nums[0];
        int mec = 1;

        for(int i = 1 ; i < n ; i++) {
            if(nums[i] == me) {
                mec++;
            } else {
                if(mec == 1) {
                    me = nums[i];
                    mec = 1;
                } else {
                    mec--;
                }
            }
        }

        return me;
    }
}

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 2, 3, 2, 2, 1};

        MESolution obj = new MESolution();
        int me = obj.majorityElement(nums);
        System.out.println("Majority Element (ME) = " + me);
    }
}
