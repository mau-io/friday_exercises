package week2.arraylists;

import java.util.ArrayList;

public class LocatingTheLargestValueInAnArraylist {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int number = 1 + (int)(Math.random() * 100);
            nums.add(number);
        }

        System.out.println("ArrayList: " + nums);
        System.out.println();

        int index = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(index) < nums.get(i)) {
                index = i;
            }
        }

        System.out.println(
            "The largest value is " +
            nums.get(index) +
            ", which is in slot " +
            index
        );
    }
}
