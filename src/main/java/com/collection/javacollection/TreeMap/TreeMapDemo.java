package com.collection.javacollection.TreeMap;
import org.springframework.core.io.FileSystemResource;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[]args) {
//        TreeMap<String, Integer> studentGrades = new TreeMap<>();
//
//        studentGrades.put("Max", 70);
//        studentGrades.put("Shahbaz", 100);
//        studentGrades.put("Azur", 78);
//
//        Integer bareMinimum = 90;
//
//        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
//            if (entry.getValue() >= bareMinimum) {
//                System.out.println(entry.getKey());
//            }
//        }

        TreeMap treeMap = new TreeMap();

        treeMap.put(106,"Shahbaz");
        treeMap.put(103,"Max");
        treeMap.put(104,"Max 1");
        treeMap.put(107,"Ravi");
        treeMap.put(102,"George");
        treeMap.put(108,"Jaspal");
        treeMap.put(101,"Komal");

        System.out.println(treeMap);

        System.out.println(treeMap.ceilingEntry(104));
        System.out.println(treeMap.ceilingKey(104));

        System.out.println(treeMap.containsKey(101));


        System.out.println("tree is empty " + treeMap);

        System.out.println(treeMap.firstEntry());

        System.out.println(treeMap.floorEntry(104));

        System.out.println(treeMap.get(104));







    }
}
