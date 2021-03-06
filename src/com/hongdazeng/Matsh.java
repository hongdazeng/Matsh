package com.hongdazeng;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Matsh {

    public static void main(String[] args) {

        String history = "";

        Scanner reader = new Scanner(in);
        String userInput;
        boolean keepAlive = true;
        int lineNumber = 1;
        while (keepAlive) {
            try {
                out.print("matsh: ");
                userInput = reader.nextLine();
                history += "" + lineNumber + " : " + userInput + "\n";
                lineNumber++;

                switch (userInput) {
                    case "exit":
                        keepAlive = false;
                        exit(1);
                    case "history":
                        out.print(history);
                        break;
                    case "dice":
                    case "roll":
                        Random dice = new Random();
                        int roll = 1 + dice.nextInt(6);
                        out.println("You've rolled a " + roll);
                        continue;
                    case "help":
                        help();
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
                out.println("An error has occurred, please try again");
            }
        }
    }

    private static void help() {
        out.println("Welcome to help, currently supported commands");
        out.println("do [number] [operation] [number]    : basic arithmetic ");
        out.println("   [operation] supported : + - * / ^");
        out.println("do [operation] [number]             : basic arithmetic (sqrt, randInt)");
        out.println("   [operation] supported : square sqrt randInt factorial (up to 100) circleArea");
        out.println("dice / roll                         : roll a dice");
        out.println("history                             : see past entries");
        out.println("exit                                : quit");
    }

    private static void doTwoHandler(String[] userCommands) {
        Double inputOne = Double.parseDouble(userCommands[1]);
        String operation = userCommands[2];
        Double inputTwo = Double.parseDouble(userCommands[3]);

        switch (operation) {
            case "+": {
                double answer = inputOne + inputTwo;
                out.println(inputOne + " + " + inputTwo + " = " + answer);
                break;
            }
            case "-": {
                double answer = inputOne - inputTwo;
                out.println(inputOne + " - " + inputTwo + " = " + answer);
                break;
            }
            case "*": {
                double answer = inputOne + inputTwo;
                out.println(inputOne + " * " + inputTwo + " = " + answer);
                break;
            }
            case "/":
                if (inputTwo == 0.0) {
                    out.println("Please try not to divide by zero");
                } else {
                    double answer = inputOne / inputTwo;
                    out.println(inputOne + " / " + inputTwo + " = " + answer);
                }
                break;
            case "^":
                double answer = Math.pow(inputOne, inputTwo);
                if (answer == Double.POSITIVE_INFINITY) {
                    out.println("Please try again with smaller numbers");
                } else {
                    out.println(inputOne + " ^ " + inputTwo + " = " + answer);
                }

        }
    }

    private static void doOneHandler(String[] userCommands) {
        String operation = userCommands[1];
        double someInput = Double.parseDouble(userCommands[2]);

        if (operation.equals("square")) {
            double answer = someInput * someInput;
            out.println(someInput + " squared is " + answer);
        } else if (operation.equals("sqrt") || operation.equals("root")) {
            double answer = Math.sqrt(someInput);
            out.println("The square root of " + someInput + " is " + answer);
        } else if (operation.equalsIgnoreCase("randInt")) {
            Random dice = new Random();
            int answer = dice.nextInt((int) (someInput));
            out.println("A random number between 0 and " + someInput + " (exclusive) is " + answer);
        } else if (operation.equals("factorial")) {
            FactorialTable newFacTable = new FactorialTable();
            System.out.println("" + (int) (someInput) + " factorial is " + newFacTable.getNum((int) someInput));
        } else if (operation.equals("circleArea")) {
            double answer = Math.PI * someInput * someInput;
            out.println("A circle with a radius of " + someInput + " will have an area of " + answer);
        }
    }

}
