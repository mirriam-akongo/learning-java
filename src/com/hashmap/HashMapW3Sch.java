package com.hashmap;

import java.util.HashMap;

public class HashMapW3Sch {
    public static void main(String[] args) {
        HashMap<String,String> country = new HashMap<String, String>();
        System.out.println(country);
        /**
         * Add items to the HashMap we use PUT
         * */
        country.put("Uganda ", " Kampala");
        country.put("Rwanda ", " Kigali");
        country.put("Kenya ", " Nairobi");
        country.put("Tanzania ", " Dar-es-salam");
        country.put("France ", " Paris");
        System.out.println(country);
        System.out.println();
        System.out.println();

        /**
         * Get items we use GET
         * */
        System.out.println(country.get("France "));

        System.out.println();
        System.out.println();

        /**
         * Remove  items we use REMOVE
         * */
        country.put("Sudan ", " Juba");
        System.out.println(country);
        System.out.println(country.remove("Sudan "));
        System.out.println(country);
        System.out.println();
        System.out.println();

        /**
         * Check HashMap's size we use Size
         * */
        System.out.println(country.size());
        System.out.println();
        System.out.println();

        /**
         * Looping through the Key items of the HashMap
         * */
        for (String i: country.keySet()) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println();
        /**
         * Looping through the Value items of the HashMap
         * */
        for (String v : country.values()) {
            System.out.println(v);
        }

        System.out.println();
        System.out.println();
        /**
         * Looping through the Key items and printing their values
         * */
        for (String i: country.keySet()){
            System.out.println("The Capital City of " + i + "is " + country.get(i) );

        }
    }
}
