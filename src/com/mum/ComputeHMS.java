package com.mum;

import java.util.Arrays;

public class ComputeHMS {
    public static void main(String[] args) {
//        System.out.println(computeHMS(3725));
        computeHMS(3735);
        computeHMS(380);
        computeHMS(3650);
        computeHMS(55);
        computeHMS(0);
        System.out.println(Arrays.toString(computeHMS(3735)));
    }

    public static int[] computeHMS(int seconds) {
        /**
         * ValueOfSecond / 3600 => To get hours
        * */
        int hours = seconds / 3600;
        /**
         *
         * */
//        int remainingSeconds = seconds - (hours * 3600);
        int remainingSeconds = seconds % 3600;
        int mins = remainingSeconds / 60;
        int sec = seconds - (hours * 3600) - (mins * 60);
//        int sec = seconds -

        System.out.println(hours + " " + mins + " " + sec);
        return new int[] {hours, mins, sec};
    }
}
