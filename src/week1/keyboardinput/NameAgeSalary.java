package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello.  What is your name?");
        String name = scanner.nextLine();

        System.out.printf("Hi, %s!  How old are you?\n", name);
        int age = Integer.parseInt(scanner.nextLine());

        System.out.printf("So you're %d, eh?  That's not old at all!", age);

        System.out.printf("How much do you make, %s?\n", name);
        double salary = scanner.nextDouble();

        System.out.printf("%.2f! I hope that's per hour and not per year! LOL!", salary);
    }
}