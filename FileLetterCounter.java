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
