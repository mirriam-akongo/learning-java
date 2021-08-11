package com.mirriako;

public class Main5demo {
    public static void main(String[] args){
        /*
        * * * *
        * * * *
        * * * *
        * * * *
        */
        System.out.println("Printing Stars");
        for (int j = 0; j < 4; j++){

            for (int i = 0; i < 4; i++){
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("Printing Numbers");
        for (int j = 1; j < 5; j++){

            for (int i = 1; i < 5; i++){
                System.out.print(i +" ");
            }

            System.out.println();
        }

        System.out.println("Printing stars part 2");
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Printing stars part 3");
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        char x = 65;
        System.out.println(x);
        System.out.println("Printing letters part 4");
        for (char i = 65; i <= 67; i++){
            for (char j = 65; j <= i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }

        System.out.println("Printing letter c using dollars part 5");
        int n = 3;
        for (int i = 0; i <= n; i++){

            for (int j = 0;  j <= n; j++){
                if (j == 0 || i == 0 || j == n || i == n){
                System.out.print("$ ");
                }
            }
            System.out.println();

        }
        System.out.println("Printing letter c using dollars part 5");
        int m = 3;
        for (int k = 0; k <= m; k++){
            System.out.println();
            for (int l = 0;  l <= n; l++){
                if (k == 0 || l == 0 || k == m || l==m){
                    System.out.print("$ ");
                } else{
                    System.out.print("  ");
                }
            }


    }
    }
}
