package com.mosh.bigo.datastructures.mymap;

import java.util.HashMap;
import java.util.Map;

public class TheMap {
    public static void main(String[] args) {
        Customer c1 = new Customer("Mirriam", "e1");
        Customer c2 = new Customer("Jem", "e2");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.email, c1);
        map.put(c2.email, c2);
        System.out.println(map.get("e1"));
        Customer customer = map.get("e1");
        System.out.println(customer);


    }
}
