package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jonathan Caques
 */

import java.util.Scanner;

public class Solution44 {

    public static void main(String[] args) {
        ReadFile rF = new ReadFile();

        //Prompt user for product name
        System.out.print("What is the product name?: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        String product = "\"" + userInput + "\"";
        String s = rF.read(product);
        System.out.print(s);
    }
}

