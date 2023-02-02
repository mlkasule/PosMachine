import java.util.Scanner;

/*
* Assume the following statement already exists:
Scanner stdin = new Scanner(System.in);
Write a loop that uses the stdin object to read positive integers, printing out those values that are greater than 100, each followed by a space. The loop should terminate when it reads an integer that is not positive.
Declare any variables that are needed.
* */

public class Loops {
    public static void main(String[] args) {
//
        int i,j;
        int n =5;
        for(i=0; i<n;i++){
            for(j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }


//        int number = 0;
//
//        while (stdin.hasNextInt() && number >= 0){
//            number =stdin.nextInt();
//            if (number > 100)
//                System.out.print(number + " ");
//        }
    }
}
