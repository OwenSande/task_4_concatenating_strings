package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String firstString, secondString, thirdString;

        System.out.println("Enter 2 strings to concatenate");
        Scanner sc = new Scanner(System.in);
        firstString = sc.next();
        secondString = sc.next();
        System.out.println("Concatenated string 1 is " + firstString + secondString);
        System.out.println("Concatenated string 2 is " + secondString + firstString);
        thirdString = firstString+secondString;


        if(firstString == secondString){

            System.out.println("The composition is alternating");
        }else
        {
            System.out.println("The composition is not alternating");
        }

    }

}
