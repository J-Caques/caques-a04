package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jonathan Caques
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution43 {
    public static void main(String[] args) throws IOException {

        Solution43 generator = new Solution43();

        //Prompt User for site name:
        System.out.print("Site name: ");
            Scanner input = new Scanner(System.in);
            String siteName = input.nextLine();

        //Prompt user for author:
        System.out.print("Author: ");
            Scanner input2 = new Scanner(System.in);
            String author = input2.nextLine();

        //Ask User if they want folder for JavaScript:
        System.out.print("Do want a folder for JavaScript(y/n)?: ");
            Scanner input3 = new Scanner(System.in);
            String reply1 = input3.next();
            if(!input3.equals("y")){
                throw new IllegalArgumentException("Please only enter y or n.");
            }



        //Ask user if they want a folder for CSS:
        System.out.print("Do you want a folder for CSS(y/n)?: ");
            Scanner input4 = new Scanner(System.in);
            String reply2 = input4.next();
            if(!input4.equals("y")){
                throw new IllegalArgumentException("Please only enter y or n.");
             }


        //Output folders created and html file created:
        generator.CreateFolders(siteName, reply1, reply2);
        generator.generateHTML(siteName);
        generator.writeToHtml(siteName, author);
    }

    //Create folders requested by user:
    void CreateFolders(String siteName, String reply1, String reply2){
        String path = "./data/website/" + siteName;
        File f = new File(path);
        boolean path1 = f.mkdir();
        if (path1){
            System.out.print("Created ./website/" +siteName+"\n");
        }
        else{
            System.out.println("Error!");
        }

        if(reply1.equals("y")){
            String pathJs = path + "/js/";
            File f2 = new File(pathJs);
            boolean path2 = f2.mkdir();
            if(path2){
                System.out.print("Created ./website/" +siteName+"/js/\n");
            }
            else{
                System.out.println("Error!");
            }
        }
        if (reply2.equals("y")){
            String pathCss = path + "/css/";
            File f3 = new File(pathCss);
            boolean path3 = f3.mkdir();
            if(path3){
                System.out.print("Created ./website/" +siteName+"/Css/\n");
            }
            else{
                System.out.println("Error!");
            }
        }
    }

    //Generate index.html file:
    void generateHTML(String siteName){
        String path = "data/website/" + siteName + "/index.html";

        try {
            File html = new File(path);
            if(html.createNewFile()){
                System.out.print("Created ./website/" +siteName+"/index.html\n");
            }
            else{
                System.out.println("Nope");
            }
        }
            catch (IOException e) {
                e.printStackTrace();
        }
    }
    // Write to html file:
    void writeToHtml(String siteName, String author) throws IOException {

        String p = "data/website/" + siteName + "/index.html";
        Path path = Paths.get(p);

        try {
            File f = new File(String.valueOf(path));
            FileWriter fw = new FileWriter(f);
            BufferedWriter pw = new BufferedWriter(fw);

            pw.write("<!DOCTYPE html>");
            pw.newLine();
            pw.write("<html>\n");
            pw.write("<head>\n");

            //Place site name inside <title> tag:
            pw.write("\t<title>" + siteName + "</title>\n");

            //Place author name inside <meta> tag:
            pw.write("\t<meta name=\"author\" content=\"" + author + "\">\n");

            pw.write("</head>\n");
            pw.write("</html>");
            pw.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
