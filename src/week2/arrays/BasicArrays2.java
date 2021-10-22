package week2.arrays;

public class BasicArrays2 {
	public static void main( String[] args ) {

		int[] array = new int[10];
		
		for ( int i = 0; i < array.length; i++ ) {
			int number = 1 + (int)(Math.random() * 100);
			array[i] = number;
			System.out.println( "Slot " + i + " contains " + array[i] );
		}
	}
}