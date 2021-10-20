package com.mirriako;
class Solution {

       public int removeDuplicates(int[] nums) {

           int index = 1;
           for (int i = 0; i < nums.length - 1; i++) {
               if (nums[i] != nums[i + 1]) {
                   nums[index++] = nums[i + 1];
               }

           } return index;
       }


//    Linear search
    public int searchInsert(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
    public int searchInsert2(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;


        while(start <= end){
            int middle = (start + end) / 2;
            if(nums[middle] == target){
                return middle;

            } else if(nums[middle] > target ){
                end = middle - 1;

            } else{
                start = middle + 1;
            }
        } return start;
    }

}

public class Leetcode {
    public static void main(String[] args) {
        System.out.println("Removing duplicates");
        Solution soln = new Solution();
        int[] arr = {1,1,2};
        System.out.println(soln.removeDuplicates(arr));

        int[] arr2 ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(soln.removeDuplicates(arr2));

        System.out.println("Searching insert position");
        System.out.println("Using linear search");
        int[] arr3 = {1,3,5,6};
        System.out.println(soln.searchInsert(arr3,5));

        System.out.println(soln.searchInsert(arr3,2));

        System.out.println(soln.searchInsert(arr3,7));

        System.out.println(soln.searchInsert(arr3,0));

        System.out.println("Using Binary Search");

        System.out.println(soln.searchInsert2(arr3,5));

        System.out.println(soln.searchInsert2(arr3,2));

        System.out.println(soln.searchInsert2(arr3,7));

        System.out.println(soln.searchInsert2(arr3,0));
    }
}
