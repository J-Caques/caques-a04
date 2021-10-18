package baseline;

import java.util.Arrays;
import java.util.Collections;

//Construct a histogram displaying the words and the frequency
public class Histogram extends WordCounter{
    //WordCounter object to access methods
    WordCounter wC = new WordCounter();

    //Obtain text and counts from WordCounter
    String text = wC.read();
    int b = wC.bCount();
    int s = wC.sCount();
    int m = wC.mCount();

    //Place counts into an array
    Integer[] hist = new Integer[]{s,m,b};


    protected void build(){

        //The most used word is displayed at the top; the least at the bottom.
        Arrays.sort(hist, Collections.reverseOrder());

        //Prints out stars to corresponding frequency
        for (Integer integer : hist) {
            if (integer == s) {
                System.out.print("Snake: ");
                for (int j = 0; j < s; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            } else if (integer == m) {
                System.out.print("Mushroom: ");
                for (int j = 0; j < m; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            } else if (integer == b) {
                System.out.print("Badger: ");
                for (int j = 0; j < b; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}
