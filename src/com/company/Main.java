package com.company;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String line;
        int characters = 0;
        int spaces = 0;
        int lines = 0;
        int words = 0;


        try {
           Scanner sc = new Scanner(new File("file.txt"));

           while (sc.hasNextLine()) {

               System.out.println(line = sc.nextLine());
               lines += 1;
               
               String[] wordsInLine = line.split(" ");
               if (!line.equals(""))
               words += wordsInLine.length;

               for (char c: line.toCharArray()) {
                   if (c == ' ') spaces += 1;
                   else characters += 1;
               }
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------------");
        System.out.println("Word Count: " + words);
        System.out.println("Lines: " + lines);
        System.out.println("Spaces: " + spaces);
        System.out.println("Characters: " + characters);


    }
}
