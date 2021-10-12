package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


class Solution43Test {

    @Test
    void generateHTML(){

        try {
            File html = new File("/Users/bendecidos/Documents/COP3330/Code/exercise43/data/website/awesomeco/index.html");

            if(html.createNewFile()){
                System.out.println("Created ./website/awesomeco/index.html");
            }
            else{
                System.out.println("Nope");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean check = new File("data/website/awesomeco", "index.html").exists();
        Assertions.assertTrue(check);

    }

    @Test
    void writeToHtml() throws IOException {
        String siteName = "awesomeco";
        String author = "Max Power";
            try {
                File f = new File("data/website/awesomeco/index.html");
                FileWriter fw = new FileWriter(f);
                BufferedWriter pw = new BufferedWriter(fw);

                pw.write("<!DOCTYPE html>");
                pw.newLine();
                pw.write("<html>\n");
                pw.write("<head>\n");
                pw.write("\t<title>" + siteName + "</title>\n");
                pw.write("\t<meta name=\"author\" content=\"" + author + "\">\n");
                pw.write("</head>\n");
                pw.write("</html>");
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


    }

    @Test
    void createFolders(){


        String folder1 = "/js";
        String folder2 = "/css";

        String path = "./data/website";
        String siteName = "/awesomeco";

        File f = new File(path);
        boolean bool = f.mkdir();
        if(bool){
            System.out.println("folder is created");
        }
        path = path + siteName;
        File fA = new File(path);
        bool = fA.mkdir();
        if(bool){
            System.out.println("Created ./website/awesomeco");
        }

        String path1 = path+folder1;
        String path2 = path+folder2;
        File f1 = new File(path1);
        File f2 = new File(path2);
        boolean bool2 = f1.mkdir();
        boolean bool3 = f2.mkdir();
        if(bool2){
            System.out.println("Created ./website/awesomeco/js/");
        }
        else{
            System.out.println("Error Found!");
        }

        if(bool3){
            System.out.println("Created ./website/awesomeco/css/");
        }
        else{
            System.out.println("Error Found!");
        }

            boolean check = new File("data/website/awesomeco", "css").exists();
            boolean check2 = new File("data/website/awesomeco", "js").exists();


        Assertions.assertTrue(check);
        Assertions.assertTrue(check2);

    }
}