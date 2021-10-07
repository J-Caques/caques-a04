package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jonathan Caques
 */

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution42 {
    public static void main(String[] args) {
        String[] data = new String[7];
        Solution42 object = new Solution42();
        object.readFile(data);
        object.createTable(data);
    }

    //Construct method that reads in data file exercise42_input.txt
    private void readFile(String[] data){

        try (Scanner input = new Scanner(Paths.get("data/exercise42_input.txt"))) {

            if(input.hasNext()) {
                for(int i = 0; i < data.length; i++){
                    data[i] = input.nextLine();
                }
            }
        }
        catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
    }

    //Construct method to create table
    private void createTable(String[] data){

        System.out.printf("    Last\t\t   First\t\t  Salary%n");

        for (int i = 0; i < 40; i++) {
            System.out.print("_");
        }

        System.out.printf("%n");
        String row;
        for (String dat : data) {
            row = dat;

            //Parse data into the last name, first name, and salary of an individual
            String[] x = row.split(",");

            //Display output in table format
            System.out.printf("%8s\t\t", x[0]);
            System.out.printf("%8s", x[1]);
            System.out.printf("%16s%n", x[2]);
        }
    }

}


