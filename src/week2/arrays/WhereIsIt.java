package week2.arrays;
import java.util.Scanner;

public class WhereIsIt {
	public static void main( String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = new int[10];
		int userNum;
		int numAt = 0;
		boolean numFound = false;
		
		System.out.print("Array: ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = 1 + (int)(Math.random() * 50);
			System.out.print( numbers[i] + " ");
		}

		System.out.print("\nValue to find: ");
		userNum = keyboard.nextInt();
		
		System.out.println();
		for(int i = 0; i < numbers.length; i++) {
			if (userNum == numbers[i]) {
				numFound = true;
				numAt = i;
			}
		}
		
		if(numFound)
			System.out.println( userNum + " is in Slot " + numAt + ".");
		else 
			System.out.println( userNum + " is not in the array.");
		
	}
}