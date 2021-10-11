package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.)");
        String name = scanner.nextLine();

        System.out.printf("Ok, %s, how old are you?\n", name);
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.println("You can't drive, " + name);
        }
        if (age < 18) {
            System.out.println("You can't vote, " + name);
        }

        if (age < 25) {
            System.out.println("You can't rent a car, " + name);
        } else {
            System.out.println("You can do anything that's legal. " + name);
        }

    }
}