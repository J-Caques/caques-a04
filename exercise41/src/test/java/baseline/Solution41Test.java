package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;


class Solution41Test {
    @Test
    void testReadFileMethod(){
        int nameCounter = 0;
        String[] names = new String[7];
        try(Scanner input = new Scanner(Paths.get("data/exercise41_input.txt"))){

            while(input.hasNext()){
                names[nameCounter] = input.nextLine();
                nameCounter++;
            }
        }
        catch (IOException | NoSuchElementException | IllegalStateException e){
            e.printStackTrace();
        }
        Assertions.assertEquals(7, nameCounter);
        Assertions.assertEquals("Jones, Aaron", names[4]);
    }

    @Test
    void testOrderMethod(){
        String[] names = new String[]{"Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina", "Jones, Chris",
                "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong"};

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {

                // to compare one string with other strings
                if (names[i].compareTo(names[j]) > 0) {
                    // swapping
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        Assertions.assertEquals("Johnson, Jim", names[0]);
        Assertions.assertEquals("Zarnecki, Sabrina", names[6]);
    }
    @Test
    void testWriteFileMethod(){
        String[] names = new String[]{"Johnson, Jim", "Jones, Aaron", "Jones, Chris", "Ling, Mai",
                "Swift, Geoffrey", "Xiong, Fong", "Zarnecki, Sabrina"};
        try {
            PrintWriter pw = new PrintWriter("data/exercise41_output.txt");

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
        Assertions.assertEquals(7, names.length);
    }
}