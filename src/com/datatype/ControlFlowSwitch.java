package com.datatype;

public class ControlFlowSwitch {
    public static void main(String[] args) {
        mySwitch('K');
        mySwitch('C');
//        mySwitch();
    }

    public static void mySwitch (char letter) {
//        char letter = 'M';
        switch (letter) {
            case 'A':
                System.out.println("Found letter a as " + letter);
                break;

            case 'B':
                System.out.println("Found letter b as " + letter);
                break;

            case 'C':
                System.out.println("Found letter c as " + letter);
                break;

            case 'D':
                System.out.println("Found letter d as " + letter);
                break;

            case 'E':
                System.out.println("Found letter e as " + letter);
                break;

            default:
                System.out.println("Failed to Find letter " + letter);
                break;
        }
    }
}
