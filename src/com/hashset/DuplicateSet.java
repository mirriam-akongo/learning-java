package com.hashset;

import java.util.*;

public class DuplicateSet {
    public static void main(String[] args) {
        String a = "bayjkla";
        System.out.println(getDuplicate(a));

        System.out.println();
        System.out.println(getSize(a));

        System.out.println();
        System.out.println(getSize2(a));

        System.out.println();
        System.out.println(a);
        System.out.println();
        getElements(a);

        System.out.println();
        String[] b = {"Algorithms", "Datastructures", "Design", "Development", "Programming", "Design", "Algorithms" };

        System.out.println(Arrays.toString(b));
        System.out.println();
        System.out.println(getDuplicate2(b));
        System.out.println();

        String input = "wordwoidddkio";
        System.out.println(getStringWithoutDuplicates(input));

        System.out.println(Thread.currentThread().getName());
    }

    public static char getDuplicate(String input) {
        Set<Character> duplicate = new HashSet<>();
        for(int i = 0; i < input.length(); i++) {
            if (!duplicate.add(input.charAt(i))) {
                return input.charAt(i);
            }
        }
        return 0;

    }

    public static int getSize(String input) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (int index = 0; index < input.length(); index++) {
            if (set.add(input.charAt(index))) {
                count++;
            }
        }
        return count;
    }

    public static int getSize2(String input) {
//        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (int index = 0; index < input.length(); index++) {
//            if (set.add(input.charAt(index))) {
            set.add(input.charAt(index));
//            }
        }
        return set.size();
    }

    public static void getElements (String input) {
        HashSet<Character> mySet = new HashSet<>();
        for (int index = 0; index < input.length(); index++) {
            mySet.add(input.charAt(index));
        }
        System.out.println(mySet);

    }

    public static String getDuplicate2 (String[] input) {
        HashSet<String> set = new HashSet<>();
        for (int index = 0; index < input.length; index++) {
            if (!set.add(input[index])) {
//                System.out.println(input[index]);
//                input[index].toString();
                return input[index];
            }
        }
        return "";
    }

    public static String getStringWithoutDuplicates (String input) {
        Set<Character> set = new TreeSet<>(Collections.reverseOrder());
        for (char element : input.toCharArray()) {
            set.add(element);
        }

        return getString(set);
    }

    public static String getString (Set<Character> set) {
        StringBuilder output = new StringBuilder();
        for(char item : set){
            output.append(item);
        }
        return output.toString();
    }
}
