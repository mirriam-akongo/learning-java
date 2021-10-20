package com.mirriako;

class Varargg{
    // b is an array
    public int add(int ...b){
        int sum = 0;
        for (int i : b){
            sum += i;
        }
        return sum;
    }
}
public class Main15 {
    public static void main(String[] args) {
        System.out.println("Variable arguments");
        Varargg varargg = new Varargg();

        System.out.println(varargg.add(3,5));

        System.out.println(varargg.add(3,5,6,10,4));
    }
}
