package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Solution42Test {
    @Test
    void testReadFileMethod(){
        int nameCounter = 0;
        String[] names = new String[7];
        try(Scanner input = new Scanner(Paths.get("data/exercise42_input.txt"))){

            while(input.hasNext()){
                names[nameCounter] = input.nextLine();
                nameCounter++;
            }
        }
        catch (IOException | NoSuchElementException | IllegalStateException e){
            e.printStackTrace();
        }
        Assertions.assertEquals(7, nameCounter);
        Assertions.assertEquals("Jones,Aaron,46000", names[2]);
    }

}