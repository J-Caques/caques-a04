package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jonathan Caques
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution41 {
    public static void main(String[] args) {
        String[] names = new String[7];
        Solution41 object = new Solution41();
        object.readFile(names);
        object.order(names);
        object.writeFile(names);


    }
    //Create method to read exercise41_input.txt
    private void readFile(String[] names){

        //Extract list of names from file
        try(Scanner input = new Scanner(Paths.get("data/exercise41_input.txt"))){

            //Alter names[] by inputting names from file
            if(input.hasNextLine()){
                for(int i = 0; i < names.length; i++)
                    names[i] = input.nextLine();
            }
        }
        catch (IOException | NoSuchElementException | IllegalStateException e){
            e.printStackTrace();
        }
    }

    //Create method to arrange names alphabetically
    private void order(String [] names){

        //Go down list of names in names[]
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {

                // use compareTo to order strings in alphabetical order
                if (names[i].compareTo(names[j]) > 0) {
                    // swapping
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
    }

    //Create method to write to exercise41_output.txt
    private void writeFile(String [] names){
        try {
            PrintWriter pw = new PrintWriter("data/exercise41_output.txt");

            // Display total # of names followed by alphabetized list
            pw.printf("Total of %d, names%n", names.length);
            for(int i = 0; i < 18; i++){
                pw.print("-");
            }
            pw.printf("%n");
            for(String name : names){
                pw.println(name);
            }
            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
