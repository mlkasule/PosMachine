import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
* We can use the try to replace the close to eliminate the program from halting incase
* the .close() method is forgotten on both PrintWriter and File constructors
*
* */
public class ReadWithTry {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String filename = input.nextLine();

        //we can also declare multiple resources within try =
        //this line below is opening current file and creating another
        // try(Scanner currentFile = new Scanner(new File("_filename.txt")); PrintWriter outputFile = new PrintWriter("copy.txt"); )

        try(PrintWriter outputFile = new PrintWriter(filename)){

            Scanner stdin = new Scanner(System.in);

            System.out.print("Enter items: ");
            String data = stdin.nextLine();

            //watch for exit keyword
            while(stdin.hasNext()){
                data = stdin.nextLine();

                if(data.equalsIgnoreCase("exit")){
                    outputFile.close();
                    System.exit(0);
                }else{
                    outputFile.println(data);
                }
            }
        }
    }

}
