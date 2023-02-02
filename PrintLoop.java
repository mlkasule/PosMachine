/*
* Chapter 4: Programming Project 2
Write a program that opens an output file named numbers.txt.
* The program should write the integer values 1 through 49 to the file, with each number written on
* its own line in the file. Be sure to close the file when you are finished with it.
Note: This program should not display any output on the screen.
* */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintLoop {
    public static void main(String[] args) throws IOException {
        FileWriter filename = new FileWriter("numbers.txt" ,true);

        PrintWriter outputFile = new PrintWriter(filename);
        for(int i = 1; i <=49; i++){
            outputFile.println(i);
        }
        outputFile.close();
    }
}
