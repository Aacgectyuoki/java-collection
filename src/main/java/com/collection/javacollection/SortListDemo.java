package com.collection.javacollection;

import java.util.*;

public class SortListDemo {


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(4);
        list.add(78);

        Collections.sort(list);

        System.out.println(list
        );


        List<Employee> employees =Database.getEmployees();

        Collections.sort(employees, new MyComparator());
        System.out.println(employees);


        List<Student> students = Database.getStudents();
        Collections.sort(students, new StudentComparator());
        System.out.println(students);

    }



}

class MyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getId() - o2.getId()); // ascending
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

