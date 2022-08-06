package com.shefali;

import com.shefali.entities.GenericList;
import com.shefali.entities.Prime;
import com.shefali.entities.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        Prime obj = new Prime();
        obj.IsNumberPrime();
        // write your code here
//Aneesh
//   List<Integer> list = new ArrayList<>();
//   String s = "Aneesh";
//  Arrays.asList(s.toCharArray()).stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
  //A [] //N
        //A  1
        //N  1
        //E  1
        //S

        //11211
        //10000 + 1000 +
        //11000
//        String s1 = "Hello";
//        String s2 = new String("Hello");
//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s2);
//A - 1
//N - 1// 10,20,100
        //second highest salary
       // select top 1 salary from employee where (select top 2 salary from employee order by salary desc) order by salary asc






////        List<Student> stu = new ArrayList<>();
////       stu.add(new Student("Shefali",List.of(60,70,80)));
////        stu.add(new Student("Isha",List.of(50,50,50)));
////        stu.stream().forEach(x -> System.out.println("Name: " + x.getName() + "Average: "
////                + x.getScores().stream().mapToInt(s -> s.intValue()).average()));
////
////        System.out.println(stu.stream().collect(Collectors.toMap(x->x.getName(),x->x.getScores().stream().mapToInt(s->s.intValue()).average())));
//        List<Integer> list = List.of(1,2,3,4,5);
//
//        List<Integer> list2 = list.stream().filter(x->(x%2==0)).collect(Collectors.toList());
//        list2.forEach(x->System.out.println(x));

    }
}
