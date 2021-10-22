package week2.arrays;
public class FindingTheLargestValueInAnArray {

    public static void main( String[] args) {
        int[] numbers = new int[10];
        int maxNum = 0;

        System.out.print( "Array: " );
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = 1 + (int)(Math.random() * 100);
            System.out.print( numbers[i] + " " );
        }

        for(int i = 0; i < numbers.length; i++) {
            if(maxNum < numbers[i]){
                maxNum = numbers[i];
            }
        }

        System.out.println("\n\nThe largest value is " + maxNum);
    }
}