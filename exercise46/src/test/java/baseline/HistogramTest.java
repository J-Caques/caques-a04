package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class HistogramTest {
    int badger = 7;
    int snake = 1;
    int mushroom = 2;
    Integer[] histogram = new Integer[]{snake,mushroom,badger};


    @Test
    void testBuildMethod(){

        Arrays.sort(histogram, Collections.reverseOrder());

        for(int i = 0;i<histogram.length;i++) {
            if (histogram[i] == snake){
                System.out.print("Snake: ");
                for(int j = 0; j<snake;j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            else if (histogram[i] == mushroom){
                System.out.print("Mushroom: ");
                for(int j = 0; j<mushroom;j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            else if (histogram[i] == badger){
                System.out.print("Badger: ");
                for(int j = 0; j<badger;j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        Assertions.assertTrue(histogram[0] > histogram [2]);
        Assertions.assertEquals(badger, histogram[0]);
    }
}