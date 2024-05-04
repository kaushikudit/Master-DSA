package com.gwu.dsa.d2.array;

class TwoSumSolution {

    /**
     * Time complexity of this solution in worst case is O(n^2) where n = number of elements in the array.
     * @param nums
     * @param target
     * @return
     */

    public int[] twoSum(int[] nums, int target) {

        int[] output = new int[2];

        int n = nums.length;

        for(int i = 0 ; i < n ; i++) {
            for(int j = i + 1 ; j < n ; j++) {
                if(nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;


                }
            }
        }

        return output;
    }
}

class TwoSum {
    public static void main(String[] args) {
        TwoSumSolution obj = new TwoSumSolution();
        int[] nums = new int[]{2, 7, 9, 11};
        int[] output = obj.twoSum(nums, 9);
        System.out.println(output[0] + " " + output[1]);


        /**
         * if you want to take input from user, remove code in main method and write the following code
         *
         *
         *         Scanner sc = new Scanner(System.in);
         *         System.out.print("Enter total number of elements you want to insert in array : ");
         *         int n = sc.nextInt();
         *         int[] nums = new int[n];
         *         for(int i = 0 ; i < n ; i++) {
         *             System.out.print("Enter number : ");
         *             nums[i] = sc.nextInt();
         *         }
         *         Solution obj = new Solution();
         *         int[] output = obj.twoSum(nums, 9);
         *         System.out.println(output[0] + " " + output[1]);
         *
         *
         *
         *
         */
    }
}
