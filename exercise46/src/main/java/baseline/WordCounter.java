package baseline;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WordCounter {
    String text = "";
    String badger = "badger";
    String mushroom = "mushroom";
    String snake = "snake";

    int bCounter = 0;
    int mCounter = 0;
    int sCounter = 0;


    //Read file exercise46_input.txt
    protected String read(){
        {
            try(Scanner input = new Scanner(Paths.get("data/exercise46_input.txt"))){
                while(input.hasNextLine()){
                    this.text += input.nextLine() + "\n";
                }
            }
            catch (IOException | NoSuchElementException | IllegalStateException e){
                e.printStackTrace();
            }
            return this.text;
        }
    }

    //Count the frequency of "badger"
    protected int bCount() {
        String[] temp = this.text.split("\\W+");

        for (String s : temp) {
            if (badger.equals(s)) {
                this.bCounter++;
            }
        }
        return this.bCounter;
    }

    //Count the frequency of "mushroom"
    protected int mCount() {
        String[] temp = this.text.split("\\W+");
        for (String s : temp) {
            if (mushroom.equals(s)) {
                mCounter++;
            }
        }
        return this.mCounter;
    }

    //Count the frequency of "snake"
    protected int sCount() {
        String[] temp = this.text.split("\\W+");
        for (String s : temp) {
            if (snake.equals(s)) {
                sCounter++;
            }
        }
        return this.sCounter;
    }
}
