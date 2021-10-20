package com.mum;

public class Prime {
        public static int checkPrime(int n) {
            for(int i=2;i<n/2;i++)
            {
                if(n%i==0)
                {
                    return 0;
                }
            }
            return 1;
    }

        public static void main(String []args)
        {

            int starting = 10;
            int ending = 30;
            int cnt = 0;
            for (int i=starting; i<=ending;i++) {
                if(checkPrime(i)==1)
                {
                    cnt++;
                }
            }
            System.out.println("NUmber of prime numbers in the given range is: "+cnt);
        }

}
