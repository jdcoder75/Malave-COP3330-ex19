package org.example;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Jose Malave
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("weight: ");
        String weightIn = sc.nextLine();

        while (numericCheck(weightIn) != true) {
            weightIn = sc.nextLine();
        }

        System.out.println("height: ");
        String heightIn = sc.nextLine();

        while (numericCheck(heightIn) != true) {
            heightIn = sc.nextLine();
        }

        int weight = Integer.parseInt(weightIn);
        int height = Integer.parseInt(heightIn);

        double bmi = (weight / (height * height)) * 703;

        if (bmi > 18.5 && bmi < 25) {
            System.out.println("Your BMI is " + bmi + ".\n" +
                    "You are within the ideal weight range. ");
        } else {
            System.out.println("Your BMI is " + bmi + ".\n" +
                    "You are overweight. You should see your doctor. ");
        }

    }


    public static boolean numericCheck(String string) {
        int intValue;

        if (string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Try again.");
        }
        return false;
    }
}