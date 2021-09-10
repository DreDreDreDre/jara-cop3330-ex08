package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */
public class App 
{
    public static void main(String[] args)
    {
        int numPeople;
        int numSlices;
        int numPizzas;
        int totalNumSlices;
        int leftOvers;
        int eachPersonSliceInt;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people? ");
        numPeople = sc.nextInt();

        System.out.print("How many pizzas do you have? ");
        numPizzas = sc.nextInt();

        System.out.print("How many slices per pizza? ");
        numSlices = sc.nextInt();

        totalNumSlices = numPizzas * numSlices;
        eachPersonSliceInt = totalNumSlices/numPeople;
        leftOvers = totalNumSlices % numPeople;

        System.out.println(numPeople + " people with " + numPizzas + " pizzas (" + totalNumSlices + " slices)");
        System.out.println("Each person gets " + eachPersonSliceInt + " pieces of pizza.");
        System.out.println("There are " + leftOvers + " leftover pieces.");
    }
}
