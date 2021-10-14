package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import static org.junit.jupiter.api.Assertions.*;

class CreateFileTest {
    String userInput = "New_Text.txt";
    String path = "data/" + userInput;

    @Test
    void testCreateMethod(){

        try{
            File myObj = new File(path);
            if(myObj.createNewFile()){
                System.out.println("File Created: " +myObj.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    @Test
    void testWriteMethod(){
        try {
            PrintWriter pw = new PrintWriter(path);
            String newText = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                    "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                    "uses an IDE to write her Java programs\".";

            // Display total # of names followed by alphabetized list
            pw.printf(newText);
            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}