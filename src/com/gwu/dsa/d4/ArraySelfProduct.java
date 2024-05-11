package com.gwu.dsa.d4;

import java.util.Arrays;

// Question link
// https://leetcode.com/problems/product-of-array-except-self/description/

class ArraySelfProductSolution {

    // Time complexity : O(N) =>  where n = number of elements in the array
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int count = 0;
        int[] output = new int[n];
        Arrays.fill(output, 0);
        int zeroIndexIfCountIsOne = -1;
        int product = 1;
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] == 0) {
                count++;
                zeroIndexIfCountIsOne = i;
            } else {
                product = product * nums[i];
            }
        }

        if(count > 1) {
            return output;
        }

        if(count == 1) {
            output[zeroIndexIfCountIsOne] = product;
            return output;
        }

        for(int i = 0 ; i < n ; i++) {
            output[i] = product / nums[i];
        }

        return output;
    }
}

public class ArraySelfProduct {
    public static void main(String[] args) {
        ArraySelfProductSolution obj = new ArraySelfProductSolution();
        int[] nums = new int[]{1,2,3,4};
        int[] output = obj.productExceptSelf(nums);

        for(int i = 0 ; i < output.length ; i++) {
            System.out.println(output[i]);
        }

        System.out.println("Second array");

        nums = new int[]{-10,2,3,0,5};
        output = obj.productExceptSelf(nums);

        for(int i = 0 ; i < output.length ; i++) {
            System.out.println(output[i]);
        }

        System.out.println("Third array");

        nums = new int[]{-10,0,3,0,5};
        output = obj.productExceptSelf(nums);

        for(int i = 0 ; i < output.length ; i++) {
            System.out.println(output[i]);
        }

    }
}
