package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jonathan Caques
 */

import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) {

        //Prompt User for name of output file
        System.out.print("What is the name of the output file?: ");
            Scanner input = new Scanner(System.in);
            String userInput = input.next();

            //Create CreateFile object
            CreateFile cF = new CreateFile();

            //Obtains userInput to be used by create() & write()
            cF.create(userInput);
            cF.write(userInput);
    }

}
