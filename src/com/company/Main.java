package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input marks");
        int marks = input.nextInt();
        System.out.println("Input total marks");
        int total = input.nextInt();
        double percentage = 100.0 * marks / total;
//        System.out.println(percentage);
        if(percentage >= 80){
            System.out.println("Grade A");
        }
        else if(percentage >= 70 && percentage <= 79){
            System.out.println("Grade B");
        }
        else if(percentage >= 60 && percentage <= 69){
            System.out.println("Grade C");
        }
        else if(percentage >= 50 && percentage <= 59){
            System.out.println("Grade D");
        }
        else if(percentage >= 40 && percentage <= 49){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade U");
        }

    }
}