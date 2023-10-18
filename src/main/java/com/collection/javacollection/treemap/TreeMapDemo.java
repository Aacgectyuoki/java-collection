/**
 * Author: Shahbaz Ali
 * Email: shahbazkhaniq@gmail.com
 * Date: 10/18/2023$
 * Time: 5:32 AM$
 * Project Name: java-collection$
 */


package com.collection.javacollection.treemap;

import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        // Create a TreeMap with a natural ordering  of keys
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some elements to the TreeMap
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");


        System.out.println("TreeMap before reverse " + map);

        Set<Integer> keySet = map.descendingKeySet();

        System.out.println("TreeMap after reverse");
        // Print the contents  of the TreeMap
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

        for (Integer key : keySet){
            System.out.println(key + "="+ map.get(key));
        }

    }


}
