package com.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            int j = num + 1;
            if (!set.add(num) && j <= num + k) {
                System.out.println(j);
                return true;
//                if ( j <= num + k) {
////                    System.out.println(num);
//                    return true;
//                }
            }
        }
        return false;
    }

}

class Solution{
    public static void main(String[] args) {
        System.out.println("Using HashSet");
        HashSet1 myHashSet = new HashSet1();
        int[] A = {1,2,3,1};
        int[] B = {1,2,3,4};
        int[] C = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(myHashSet.containsDuplicate(A));
        System.out.println(myHashSet.containsDuplicate(B));
        System.out.println(myHashSet.containsDuplicate(C));

        System.out.println();
        System.out.println();
        System.out.println("Contains nearby duplicates");
        int[] num1 = {1,2,3,1};
        int[] num2 ={1,0,1,1};
        int[] num3 ={1,2,3,1,2,3};
        System.out.println(myHashSet.containsNearbyDuplicate(num1,3));
        System.out.println(myHashSet.containsNearbyDuplicate(num2,1));
        System.out.println(myHashSet.containsNearbyDuplicate(num3,2));

    }
}
