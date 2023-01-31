import java.util.Scanner;

/*
A software company sells a package at the regular price of $99. Quantity discounts are given according to the following table:

Quantity Discount 1-9 No Discount 10-19 20% 20-49 30% 50-99 40% 100 or more 50%

Write a program that asks the user to enter the number of packages purchased. The program should then display the amount of the discount (if any) and the total amount of the purchase after the discount. Hint: To calculate 20% of a value N, you can use the formula 0.2 * N. Look carefully at the following sample run of the program. In particular, notice the wording of the messages and the placement of spaces and colons. Your program's output must match this.

Sample Run Enter number of packages purchased: 50↵ Your discount is: $1980.00 Your total is: $2970.00
 */

public class SoftwareSales {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        final int regular_price = 99;

        System.out.print("Enter number of packages purchased: ");
        int num_of_items = stdin.nextInt();
        double total = regular_price * num_of_items;
        double discount;
        double net_total;

        //login here
        if(num_of_items >=1 && num_of_items <=9){
            discount = 0;
            System.out.printf("Your discount is: $%.2f\n", discount);
            System.out.printf("Your total is: $%.2f\n", total );
        }else if (num_of_items >=10 && num_of_items <=19){
            discount = 0.2 * total;
            net_total = total - discount;
            System.out.printf("Your discount is: $%.2f\n", discount);
            System.out.printf("Your total is: $%.2f\n", net_total );
        }else if (num_of_items >=20 && num_of_items <=49){
            discount = 0.3 * total;
            net_total = total - discount;
            System.out.printf("Your discount is: $%.2f\n", discount);
            System.out.printf("Your total is: $%.2f\n", net_total );
        }else if (num_of_items >=50 && num_of_items <=99){
            discount = 0.4 * total;
            net_total = total - discount;
            System.out.printf("Your discount is: $%.2f\n", discount);
            System.out.printf("Your total is: $%.2f\n", net_total );
        }else if (num_of_items >=100){
            discount = 0.5 * total;
            net_total = total - discount;
            System.out.printf("Your discount is: $%.2f\n", discount);
            System.out.printf("Your total is: $%.2f\n", net_total );
        }else{
            discount = 0;
            System.out.printf("Your discount is: $%.2f\n", discount);
            System.out.printf("Your total is: $%.2f\n", total );
        }
    }
}
