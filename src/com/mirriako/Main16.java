package com.mirriako;

class MimiCalc{
    public int add(int ...array){
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        return sum;
    }
}

class MimiCalcv2 extends  MimiCalc{
    public int sub( int ...array2){
        int result = 0;

        for (int i =0; i < array2.length; i++){

                    if (i == 0){
                        result = array2[i];

                    }
                    else{
                        result -= array2[i];
                    }

        }
        return result;
    }
}
public class Main16 {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        MimiCalc calc = new MimiCalc();
        int adding = calc.add(3,4);
        System.out.println(adding);

        MimiCalcv2 calc2 = new MimiCalcv2();
        int subtracting = calc2.sub(6,3);
        System.out.println(subtracting);
        int subtracting2 = calc2.sub(10,2,3,5);
        System.out.println(subtracting2);
        int subtracting3 = calc2.sub(100,30, 20,10);
        System.out.println(subtracting3);
    }
}
