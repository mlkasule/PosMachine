import java.io.*;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) throws IOException {

        String grocery_item;
        String fileName;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter new filename? \nUse - yes or no ");
        String answer = input.nextLine();

        if(answer.equalsIgnoreCase("yes")){
            fileName = input.nextLine();

            //Create the output file to save data
            PrintWriter outputFile = new PrintWriter(fileName);

            //print in terminal
            System.out.println("Enter grocery items below ");
            System.out.println("====Press enter save item or exit to close====");

            //print in file
            outputFile.println("GROCERY LIST");
            outputFile.println("=============================");

            //watch for exit keyword
            while(input.hasNext()){
                grocery_item = input.nextLine();

                if(grocery_item.equalsIgnoreCase("exit")){
                    outputFile.close();
                    System.exit(0);
                }else{
                    outputFile.println(grocery_item);
                }
            }

            //close program
            outputFile.close();

        }else if(answer.equalsIgnoreCase("no")) {

            //APPEND TO A EXISTING FILE USING FILE-WRITER
            System.out.print("Enter name of existing file: ");
            String responseFileName = input.nextLine();

            //search for file name
            FileWriter appendToFile = new FileWriter(responseFileName, true);
            // use Print and pass file name to it so we can use the print method,
            //file does not exist, it will be created with this name
            PrintWriter oldFile = new PrintWriter(appendToFile);

            //watch for exit keyword
            while (input.hasNext()) {
                grocery_item = input.nextLine();

                if (grocery_item.equalsIgnoreCase("exit")) {
                    oldFile.close();
                    System.exit(0);
                } else {
                    oldFile.println(grocery_item);
                }
            }
        }else{
            //READ EXISTING DATA USING FILE
            System.out.print("Enter File name: ");
            String readFile = input.nextLine();

            //Open a file
            File currentFile = new File(readFile);
            //if file exists
            if(currentFile.exists()){
                //Use Scanner to read file data
                Scanner openFile = new Scanner(currentFile); //Alt  Scanner openfile = new Scanner(new File(readFile))
                //date from file
                String data;

                System.out.println("File is open");
                while(openFile.hasNext()){
                    //read first line of the file
                    data = openFile.nextLine();
                    System.out.println(data);
                }
            }else{
                System.out.println("File does not exist");
            }
        }
    }
}
