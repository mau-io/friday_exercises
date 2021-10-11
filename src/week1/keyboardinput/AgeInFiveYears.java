package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello.  What is your name?");
        String name = scanner.nextLine();

        System.out.printf("Hi, %s! How old are you?\n", name);
        int age = scanner.nextInt();

        System.out.printf(
                "Did you know that in five years you will be %d years old?" +
                        "\n" +
                        "And five years ago you were %d! Imagine that!",
                age + 5,
                age - 5);

    }
}