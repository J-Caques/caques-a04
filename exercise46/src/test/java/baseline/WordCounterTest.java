package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

class WordCounterTest {
    String[] temp;
    String text = "";
    String badger = "badger";
    String mushroom = "mushroom";
    String snake = "snake";

    int bCounter = 0;
    int mCounter = 0;
    int sCounter = 0;

    @Test
    void testReadMethod(){
        try(Scanner input = new Scanner(Paths.get("data/exercise46_input.txt"))){
            while(input.hasNextLine()){
                text += input.nextLine() + "\n";
            }
        }
        catch (IOException | NoSuchElementException | IllegalStateException e){
            e.printStackTrace();
        }
            temp = text.split(" ");

        List<String> list = Arrays.asList(temp);

        Assertions.assertTrue(list.contains("badger"));
        Assertions.assertTrue(list.contains("snake"));
    }

    @Test
    void testCountMethod(){

        String[] temp = new String[]{"badger", "badger", "badger",
                "badger", "mushroom", "mushroom", "snake", "badger",
                "badger", "badger"};

        for (String s : temp) {
            if (badger.equals(s)) {
                bCounter++;
            } else if (mushroom.equals(s)) {
                mCounter++;
            } else if (snake.equals(s)) {
                sCounter++;
            }
        }

        Assertions.assertEquals(7, bCounter);
        Assertions.assertEquals(2, mCounter);
        Assertions.assertEquals(1, sCounter);

    }

}