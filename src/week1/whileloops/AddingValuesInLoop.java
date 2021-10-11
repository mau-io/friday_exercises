package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");

        int input = scanner.nextInt();

        while (input != 0) {
            count += input;

            System.out.printf("The total so far is %d\n", count);
            System.out.print("Number: ");
            input = scanner.nextInt();
        }

        System.out.printf("\nThe total is ", count);
    }
}
