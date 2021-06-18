package com.company;

import java.sql.SQLOutput;

public class Main {
    //INIGERS
    public static void main(String[] args) {
        // these  are the variables i declared
        int firstNumber;
        int secondNumber;
        // this is where i initialise them
        firstNumber = 5;
        secondNumber = 6;

        int sum = firstNumber + secondNumber;
//       System.out.print(sum);
    //FLOATS
        float firstFloat = 0.5f;
        float secondFloat = 2.3f;

        float floatSum = firstFloat + secondFloat;
        System.out.println(floatSum/4);

        double firstDouble = 0.7;
        double secondDouble = 2.4;
        double doubleSum = firstDouble + secondDouble;

//  System.out.println(doubleSum);

        String firstString = "Chips";
        String secondString = "Chicken";

        System.out.println("I love" firstString + " and "+ secondString);

    }
}
