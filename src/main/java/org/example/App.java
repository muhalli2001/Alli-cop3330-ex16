package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        String result;
        //input age
        Scanner y = new Scanner(System.in);
        System.out.println("What is your age?");
        String yr = y.nextLine();
        int year = Integer.parseInt(yr);
        //ternary operator
        result = (year>15) ? "you are old enough to drive": "you are NOT old enough to drive";
        //output
        System.out.println(result);

    }
}
