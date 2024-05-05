package com.gwu.dsa.d3;

class ProductMinusSumSolution {

    /**
     *
     * Time complexity of this solution in worst case is O(n) where n => number of digits.
     * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
     * @param n
     * @return
     */

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while(n != 0) {
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;   // sum += digit

            n = n / 10;    // n /= 10;
        }

        System.out.println("Product = " + product);
        System.out.println("Sum = " + sum);

        return product - sum;
    }
}


public class ProductMinusSum {
    public static void main(String[] args) {
        int n = 234;
        ProductMinusSumSolution obj = new ProductMinusSumSolution();
        int result = obj.subtractProductAndSum(n);
        System.out.println("Difference = " + result);
    }
}
