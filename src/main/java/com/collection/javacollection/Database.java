package com.collection.javacollection;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<Employee> getEmployees(){

       List<Employee> employees = new ArrayList<>();
       employees.add(new Employee(18,"Max","IT",60000));
        employees.add(new Employee(89,"Shahbaz","CIVIL",90000));
        employees.add(new Employee(5,"John","DEFENCE",50000));
        employees.add(new Employee(9,"George","QA",1200000));
        return employees;

    }

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Max", 27));
        students.add(new Student("Robert", 105));
        students.add(new Student("Aarir", 13));
        return students;
    }
}
