import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        int response1, response2, num1, num2, sum , avg;

        Scanner input = new Scanner(System.in);

        Random randomNum1Object;

        System.out.print("Enter first maximum range (1 to 100): ");
        response1 = input.nextInt();
        //create random number
        randomNum1Object = new Random();
        //assign random number
        num1 = randomNum1Object.nextInt(response1) + 1;
        System.out.println("Your max range is: " + num1);

        System.out.print("Enter second maximum range ( greater 50): ");
        response2 = input.nextInt();
        //create random number
        randomNum1Object = new Random();
        //assign random number
        num2 = randomNum1Object.nextInt(response2) + 50;
        System.out.println("Your max range is: " + num2);

        //sum
        sum = num1 + num2;

        //avg
        avg = sum /2;

        System.out.println("Total sum is: " + sum);
        System.out.println("Average is: "+ avg);

        //double random numbers
        double randDouble = randomNum1Object.nextDouble();
        // prints from 0.0 to 1.0;
        System.out.println("Double random number: " + randDouble);

    }
}
