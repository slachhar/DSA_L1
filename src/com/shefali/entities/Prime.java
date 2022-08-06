package com.shefali.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime {
    //49
    //
    public void IsNumberPrime() {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        List<String> statusArr = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            boolean isPrime = true;
            int number = scn.nextInt();
            int count = 1;
            int root = (int) Math.sqrt(number);
            while(root>count++){
                if(number%count == 0)
                {
                    isPrime = false;
                    statusArr.add("Not Prime");
                    break;
                }
            }
            if(isPrime){
                statusArr.add("Prime");
            }
        }
        statusArr.forEach(System.out::println);
    }

    public void PrintAllPrimeWithinRange() {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        List<String> statusArr = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            boolean isPrime = true;
            int number = scn.nextInt();
            int count = 1;
            int root = (int) Math.sqrt(number);
            while(root>count++){
                if(number%count == 0)
                {
                    isPrime = false;
                    statusArr.add("Not Prime");
                    break;
                }
            }
            if(isPrime){
                statusArr.add("Prime");
            }
        }
        statusArr.forEach(System.out::println);
    }
}
