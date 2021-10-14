package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

class ModifyFileTest {
    String text = "";

    @Test
    void testReadMethod(){
        try(Scanner input = new Scanner(Paths.get("data/exercise45_input.txt"))){
            while(input.hasNextLine()){
                text += input.nextLine() + "\n";
            }
        }
        catch (IOException | NoSuchElementException | IllegalStateException e){
            e.printStackTrace();
        }
        Assertions.assertTrue(text.contains("""
                One should never utilize the word "utilize" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                utilizes an IDE to write her Java programs".
                """));
    }

    @Test
    void testModifyMethod(){
    text = """
            One should never utilize the word "utilize" in writing. Use "use" instead.
            For example, "She uses an IDE to write her Java programs" instead of "She
            utilizes an IDE to write her Java programs".
            """;

        String newText = text.replace("utilize", "use");

        Assertions.assertFalse(newText.contains("utilize"));
    }

}