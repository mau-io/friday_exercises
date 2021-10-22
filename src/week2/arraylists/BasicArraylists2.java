package week2.arraylists;

import java.util.ArrayList;

public class BasicArraylists2 {
    public static void main( String[] args ) {

        ArrayList<Integer> array = new ArrayList<>();

        for ( int i = 0; i < 10; i++) {
            int number = 1 + (int)(Math.random() * 100);
            array.add(number);
        }

        System.out.println("ArrayList: " + array);
    }
}
