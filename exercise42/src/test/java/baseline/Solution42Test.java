package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Solution42Test {
    @Test
    void testReadFileMethod() {
        int Counter = 0;
        String[] data = new String[7];
        try (Scanner input = new Scanner(Paths.get("data/exercise42_input.txt"))) {

            while (input.hasNext()) {
                data[Counter] = input.nextLine();
                Counter++;
            }
        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(7, Counter);
        Assertions.assertEquals("Jones,Aaron,46000", names[2]);
    }


    @Test
    void testCreateTable() {
        String[] names = new String[]{"Ling,Mai,55900", "Johnson,Jim,56500", "Jones,Aaron,46000", "Jones,Chris,34500", "Swift,Geoffrey,14200",
                "Xiong,Fong,65000", "Zarnecki,Sabrina,51500"};
        System.out.printf("    Last\t\t   First\t\t  Salary%n");
        for (int i = 0; i < 40; i++) {
            System.out.print("_");
        }
        System.out.printf("%n");
        String row = null;
        for (String name : names) {
            row = name;
            String[] x = row.split(",");
            System.out.printf("%8s\t\t", x[0]);
            System.out.printf("%8s", x[1]);
            System.out.printf("%16s%n", x[2]);
        }
        String[] expected = new String[]{"Zarnecki", "Sabrina", "51500"};
        Assertions.assertArrayEquals(expected,row.split(",") );
    }
}