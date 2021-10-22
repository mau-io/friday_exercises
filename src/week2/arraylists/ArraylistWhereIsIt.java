package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistWhereIsIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int number = 1 + (int)(Math.random() * 100);
            nums.add(number);
        }

        System.out.println("ArrayList: " + nums);
        System.out.print("Value to find: ");
        int findValue = scanner.nextInt();

        System.out.println();

        int index =  nums.indexOf(findValue);
        if(index >= 0){
            System.out.println(findValue + " is in slot " + index + ".");
        } else {
            System.out.println(findValue + " is not in the ArrayList.");
        }

    }
}
