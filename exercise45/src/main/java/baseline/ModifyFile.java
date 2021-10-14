package baseline;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ModifyFile {
    String text = "";

    private String read(){
        //Read file "exercise45_input.txt"
        try(Scanner input = new Scanner(Paths.get("data/exercise45_input.txt"))){
        while(input.hasNextLine()){
            text += input.nextLine() + "\n";
        }
    }
    catch (IOException | NoSuchElementException | IllegalStateException e){
        e.printStackTrace();
    }
        return text;
    }

    public String modify(){
        String txt = read();

        //Replace occurrences for the word "utilize" w/ "use"
        String newText = txt.replace("utilize", "use");

        return newText;
    }
}
