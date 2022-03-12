package com.mum2;

import java.util.Arrays;

public class FillArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,5, 9, 12,-2,-1};
//        fill(a,3, 10);
        System.out.println(Arrays.toString(fill(a,3, 10)));

        int[] a2 = {4, 2, -3, 12};
        System.out.println(Arrays.toString(fill(a2,1, 5)));

        int[] a3 = {2, 6, 9, 0, -3};
        System.out.println(Arrays.toString(fill(a2,0, 4)));
    }

    public static int[] fill(int[] arr, int k, int n) {
        int[] arr2 = new int[n];
        if (k <= 0) {
            return null;
        }

        for (int i = 0; i < n; ) {
            for (int j = 0; j < k && i < n; j++) {
                arr2[i] = arr[j];
                i++;
            }
        }
        return arr2;
    }

    static int fill2(int[] a, int k, int n) {
        int[] arr2 = new int[n];
        int t=0;
        for(int i=0; i<n; i++){
            if(t<k){
                arr2[i]=a[t];
                t++;
            }
            else if(t==k){
                t=0;
                arr2[i]=a[t];
                t++;
            }
        }
        return arr2[0];
    }
}
