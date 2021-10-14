package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    //Create ModifyFile object
    ModifyFile mF = new ModifyFile();


    //Create output file
    protected void create(String userInput){
        String path = "data/" + userInput;
        try{
            File myObj = new File(path);
            if(myObj.createNewFile()){
                System.out.println("File Created: " +myObj.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    //Place modified file into new output file
    protected void write(String userInput){
        String path = "data/" + userInput;
        try {
            PrintWriter pw = new PrintWriter(path);

            //Obtain newText from modify()
            String newText = mF.modify();

            //Write nexText to output file
            pw.printf(newText);
            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
