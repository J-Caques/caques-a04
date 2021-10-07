package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Solution42Test {
    @Test
    void testReadFileMethod() {
        int nameCounter = 0;
        String[] names = new String[7];
        try (Scanner input = new Scanner(Paths.get("data/exercise42_input.txt"))) {

            while (input.hasNext()) {
                names[nameCounter] = input.nextLine();
                nameCounter++;
            }
        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(7, nameCounter);
        Assertions.assertEquals("Jones,Aaron,46000", names[2]);
    }


    @Test
    void testCreateTable() {
        String[] names = new String[]{"Ling,Mai,55900", "Johnson,Jim,56500", "Jones,Aaron,46000", "Jones,Chris,34500", "Swift,Geoffrey,14200",
                "Xiong,Fong,65000", "Zarnecki,Sabrina,51500"};
        System.out.printf("    Last\t\t   First\t\t  Salary%n");
        for(int i = 0; i<40;i++) {
            System.out.print("_");
        }
            System.out.printf("%n");
        String row;
            for(int i = 0; i<names.length; i++){
                row = names[i];
                String[] x = row.split(",");
                System.out.printf("%8s\t\t", x[0]);
                System.out.printf("%8s", x[1]);
                System.out.printf("%15s%n", x[2]);
            }

    }

}