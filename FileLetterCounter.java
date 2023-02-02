/*
* Chapter 4: Programming Project 3

Write a program that asks the user to enter the name of a file, and then asks the user to enter a character.
The program should count and display the number of times that the specified character appears in the file.
Here is a sample run of the program:
Enter file name: mydata.txt
Enter character to count: a
The character 'a' appears in the file mydata.txt 17 times.
In the sample run shown above, look carefully at the wording of the messages and the placement of spaces and punctuation. Your program's output must match this.
Your program class should be named FileLetterCounter.
*
* */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileLetterCounter {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int count = 0;

        System.out.print("Enter file name: ");
        String filename = input.nextLine();

        System.out.print("Enter character to count: ");
        String charName = input.next();

        File dataFile = new File(filename);

        if(dataFile.exists()){
            Scanner openFile = new Scanner(dataFile);
            String word;

            while(openFile.hasNext()){
                word = openFile.nextLine();
                for (int i = 0; i< word.length(); i++){
                    if(charName.equalsIgnoreCase(String.valueOf(word.charAt(i)))){
                        count++;
                    }
                }
            }

        }

        System.out.println("Number of characters are: " + count);







    }
}
