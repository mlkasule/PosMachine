import java.util.Scanner;

/*
        Chapter 3: Programming Project 1
        Unlimited tries
        For this project you will write a program that converts numbers to Roman numerals. Your program must display the following string as a prompt:
        "Enter a number in the range of 1 - 10: "
        The prompt must appear exactly as it is shown here. (Make sure that one space appears at the end of the string, after the colon.)
        After displaying the prompt, the program should read an integer from the keyboard. If the input is within the range of 1 through 10, the program should then display the Roman numeral version of that number. If the input is not within the range of 1 through 10, the program should display the following string as an error message:
        "Invalid number."
        Your program class should be named RomanNumerals. Here are three sample runs of the program:
        Sample Run
        Enter a number in the range of 1 - 10: 4
        IV
        Sample Run
        Enter a number in the range of 1 - 10: 8
        VIII
        Sample Run
        Enter a number in the range of 1 - 10: 12
        Invalid number.
*/
public class RomanNumerals {
    public static void main(String[] args) {
        int input;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a number in the range of 1 - 10: ");
        input = stdin.nextInt();

        switch(input){
            case 1 -> System.out.println("I");
            case 2 -> System.out.println("II");
            case 3 -> System.out.println("III");
            case 4 -> System.out.println("IV");
            case 5 -> System.out.println("V");
            case 6 -> System.out.println("VI");
            case 7 -> System.out.println("VII");
            case 8 -> System.out.println("VIII");
            case 9 -> System.out.println("IX");
            case 10 -> System.out.println("X");
            default -> System.out.println("Invalid number");
        }

//        switch(input){
//            case 1:
//                System.out.println("I");
//                break;
//            case 2:
//                System.out.println("II");
//                break;
//            case 3:
//                System.out.println("III");
//                break;
//            case 4:
//                System.out.println("IV");
//                break;
//            case 5:
//                System.out.println("V");
//                break;
//            case 6:
//                System.out.println("VI");
//                break;
//            case 7:
//                System.out.println("VII");
//                break;
//            case 8:
//                System.out.println("VIII");
//                break;
//            case 9:
//                System.out.println("IX");
//                break;
//            case 10:
//                System.out.println("X");
//                break;
//            default:
//                System.out.println("Invalid number");
//        }
    }
}
