package edu.guilford;
//Hosiah Hedima
//9-19-24

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //random number generator
        Random rand = new Random();
        //scanner
        Scanner scan = new Scanner(System.in);
        //gets number of sides and number of dice rolls
        System.out.print("This code rolls dice. ");
        System.out.print("How many sides do you want? ");
        int sides = scan.nextInt();
        System.out.print("How many dice do you want? ");
        int number = scan.nextInt();
        int sum = 0;
        //rolls dice
        for (int i = 0; i < number; i++) {
            int diceRoll = rand.nextInt(sides) + 1;
            sum += diceRoll;
            System.out.println("Dice roll " + i + ": " + diceRoll);
            //System.out.println("The sum of " + i + "d" + sides + " = " + sum);
        }
        //adds up all the dice roles
        System.out.println(number + "d" + sides + "=" + sum);
        scan.close();
    }
}