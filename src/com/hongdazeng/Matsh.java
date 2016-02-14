package com.hongdazeng;

import java.util.Random;
import java.util.Scanner;

public class Matsh {

    public static void main(String[] args) {

        String history = "";

        Scanner reader = new Scanner(System.in);
        String userInput;
        boolean keepAlive = true;
        while (keepAlive) {
            try {
                System.out.print("matsh: ");
                userInput = reader.nextLine();
                history += userInput + "\n";

                switch (userInput) {
                    case "exit":
                        keepAlive = false;
                        System.exit(1);
                    case "history":
                        System.out.print(history);
                        break;
                    case "dice":
                    case "roll":
                        Random dice = new Random();
                        int roll = 1 + dice.nextInt(6);
                        System.out.println("You've rolled a " + roll);
                        continue;
                }

                String[] userCommands = userInput.split(" ");

                if (userCommands[0].equals("do")) {
                    if (userCommands.length == 3) {
                        doOneHandler(userCommands);
                    } else if (userCommands.length == 4) {
                        doTwoHandler(userCommands);
                    }
                }

            } catch (Exception e) {
                System.out.println("An error has occurred, please try again");
            }
        }
    }

    private static void doTwoHandler(String[] userCommands) {
        Double inputOne = Double.parseDouble(userCommands[1]);
        String operation = userCommands[2];
        Double inputTwo = Double.parseDouble(userCommands[3]);

        switch (operation) {
            case "+": {
                double answer = inputOne + inputTwo;
                System.out.println(inputOne + " + " + inputTwo + " = " + answer);
                break;
            }
            case "-": {
                double answer = inputOne - inputTwo;
                System.out.println(inputOne + " - " + inputTwo + " = " + answer);
                break;
            }
            case "*": {
                double answer = inputOne + inputTwo;
                System.out.println(inputOne + " * " + inputTwo + " = " + answer);
                break;
            }
            case "/":
                if (inputTwo == 0.0) {
                    System.out.println("Please try not to divide by zero");
                } else {
                    double answer = inputOne / inputTwo;
                    System.out.println(inputOne + " / " + inputTwo + " = " + answer);
                }
                break;
        }
    }

    private static void doOneHandler(String[] userCommands) {
        String operation = userCommands[1];
        double someInput = Double.parseDouble(userCommands[2]);

        if (operation.equals("square")) {
            double answer = someInput * someInput;
            System.out.println(someInput + " squared is " + answer);
        } else if (operation.equals("sqrt") || operation.equals("root")) {
            double answer = Math.sqrt(someInput);
            System.out.println("The square root of " + someInput + " is " + answer);
        } else if (operation.equalsIgnoreCase("randInt")) {
            Random dice = new Random();
            int answer = dice.nextInt((int) (someInput));
            System.out.println("A random number between 0 and " + someInput + " (exclusive) is " + answer);
        }
    }

}
