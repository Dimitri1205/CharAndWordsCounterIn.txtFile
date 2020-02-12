package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        int chr = 0;
        int sps = 0;
        int lnb = 0;
        int words = 0;

        try {
           FileReader fr = new FileReader(new File("MouseMover.txt"));
           Scanner sc = new Scanner(new File("MouseMover.txt"));

           while (sc.hasNext()) {
               words += 1;
               sc.next();
           }

           int c = 0;
           while ((c = fr.read()) != -1) {
               char cr = (char) c;
               System.out.print(cr);

               if (cr == '\n')
                   lnb += 1;
               else if (cr == ' ')
                   sps += 1;
               else chr +=1;
           }

            System.out.println();
            System.out.println("Word Count: " + words);
            System.out.println("Line Breaks: " + lnb);
            System.out.println("Spaces: " + sps);
            System.out.println("Characters: " + chr);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
