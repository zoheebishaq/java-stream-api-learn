package com.javazoheeb.java.learn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {

        List< String > fruits = new ArrayList< String >();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("without lambda expression");
        //without lambda expression
        List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println("--");
        System.out.println("with lambda expression");
        // with lambda expression
        List<String> sortedListLambda = fruits.stream().sorted((value1, value2) -> value1.compareTo(value2)).collect(Collectors.toList());
        System.out.println(sortedListLambda);

        System.out.println("without lambda expression direct to list");
        //without lambda expression direct to list
        List<String> sortedDirectToList = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedDirectToList);

        System.out.println("--");
        System.out.println("without lambda expression reverse");
         //without lambda expression reverse
        List<String> sortedListreverse = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedListreverse);

        System.out.println("--");
        System.out.println("with lambda expression reverse");
        // with lambda expression reverse
        List<String> sortedListLambdareverse = fruits.stream().sorted((value1, value2) -> value2.compareTo(value1)).collect(Collectors.toList());
        System.out.println(sortedListLambdareverse);

        System.out.println("--");
        System.out.println("sort employee by sakary ascending order");
        // sort employee by sakary ascending order

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10,"Ramesh",30,400000));
        employees.add(new Employee(20,"Santosh",29,350000));
        employees.add(new Employee(30,"Sanjay",30,450000));
        employees.add(new Employee(40,"Pramod",29,500000));

        List<Employee> employeesSortedList = employees.stream()
                .sorted(new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());

        //same but with lambda
        List<Employee> employeesSortedListLambda = employees.stream()
                .sorted(( o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .collect(Collectors.toList());

        //same but with Comparator
        List<Employee> employeesSortedListComparator = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println(employeesSortedList);
        System.out.println(employeesSortedListLambda);
        System.out.println(employeesSortedListComparator);
    }

}
