package com.leetcode;

import static java.lang.Math.abs;

public class Duplicate2 {

        public static boolean containsNearbyDuplicate(int[] nums, int k) {
            // Set<Integer> set = new HashSet<>();
            for (int num = 0; num < nums.length; num++){
                // if (set.add(num) && ) {
                for (int j = num + 1; j < nums.length; j++){
                    if (nums[num] == nums[j] && abs(num - j) <= k) {
                        return true;
                    }
                }
            }
            return false;
        }


    public static void main(String[] args) {
        System.out.println("Printing");
        int[] nums = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums,3));

        int[] nums2 = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(nums2,1));

        int[] nums3 = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(nums3, 2));
    }

}
