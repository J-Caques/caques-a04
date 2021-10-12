package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

class Solution43Test {

    @Test
    void generateHTML(){}

    @Test
    void createFolders(){


        String folder1 = "/js";
        String folder2 = "/css";

        String path = "./website/awesomeco";

        File f = new File(path);
        boolean bool = f.mkdir();
        if(bool){
            System.out.println("folder is created");
        }

        String path1 = path+folder1;
        String path2 = path+folder2;
        File f1 = new File(path1);
        File f2 = new File(path2);
        boolean bool2 = f1.mkdir();
        boolean bool3 = f2.mkdir();
        if(bool2){
            System.out.println("folder is created");
        }
        else{
            System.out.println("Error Found!");
        }

        if(bool3){
            System.out.println("folder is created");
        }
        else{
            System.out.println("Error Found!");
        }

            boolean check = new File("./website/awesomeco", "css").exists();
            boolean check2 = new File("./website/awesomeco", "js").exists();


        Assertions.assertTrue(check);
        Assertions.assertTrue(check2);

    }
}