/* 1) Implement the following method:

// Convert a list of not-necessarily sequential
// numbers into a comma-separated list of
// ranges, of the format "from:to".

    static string ranges(int[] numbers) {}

// Example: ranges([1,2]) = "1:2"
// Example: ranges([1,2,3,5]) = "1:3,5"
// Example: ranges(1) = "1"
 */
package listsortintegerstorangesapp;
import java.util.*;
/**
 *
 * @author jade
 */
public class ListSortIntegersToRangesApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.print("This thing is on");
        /** Create the range of numbers. Possibly later take an input for,
         * or generate a random list of numbers. These are in an array.
         **/
        Scanner input = new Scanner(System.in);
        
            System.out.print("Type 7 numbers to sort: ");
            int numbers;
            int[] integer_in_array = new int[7];
            for(int typed_integer=0; typed_integer<7; typed_integer++) {
                integer_in_array[typed_integer] = input.nextInt();
                
                for(int sort_integer=0; sort_integer<7; sort_integer++) {
                    if(integer_in_array[typed_integer] < integer_in_array[sort_integer]) {
                        int swap = integer_in_array[typed_integer];
                        integer_in_array[typed_integer] = integer_in_array[sort_integer];
                        integer_in_array[sort_integer] = swap;
                    }
                }
            }
            
            System.out.println("All of the numbers in order: ");
            
            for(int print = 0; print<7; print++) {
                System.out.print(integer_in_array[print]+ " ");
            }
            System.out.println();
            System.out.println();

            //Printing out the list in the format required.
            
    //Below, added method which prints out the numbers in the format required. They may
          //still be integers though. It does not work properly with negatives.
            for (int i = 0; i<7; i++ ) {
                //The first if statement below handles what to do if the next number is the same as the current number.
                //When this is the case it will not print the current number, because to avoid duplicate numbers only the
                //final identical number in the sorted sequence prints.
                if(i<6 && integer_in_array[i] == (integer_in_array[i+1])) {
                
                }
                else if (i==6) {
                    System.out.print(integer_in_array[i]);
                    break;
                }
                else if (i==0 && integer_in_array[i] != (integer_in_array[i+1]-1)) {
                    System.out.print(integer_in_array[i]+",");
                }
                else if (i==0 && integer_in_array[i] == (integer_in_array[i+1]-1)) {
                    System.out.print(integer_in_array[i]+":");
                }
                //If the current number is the same as the previous number and the next number, do not print anything.
                else if (integer_in_array[i] == integer_in_array[i-1] && integer_in_array[i] == integer_in_array[i+1]){

                }
                //If the current number is preceded by a consecutive number and the current number is the same as the next number, don't print.
                else if (integer_in_array[i] == (integer_in_array[i-1]+1) && integer_in_array[i] == integer_in_array[i+1]){

                }
                //If the current number is the same as the previous number and followed by a consecutive number, don't print it.
                else if (integer_in_array[i] == (integer_in_array[i-1]) && integer_in_array[i] == (integer_in_array[i+1])-1 ){

                }
                else if(integer_in_array[i] != (integer_in_array[i+1]-1)) {
                    System.out.print(integer_in_array[i]+",");
                }
                else if(integer_in_array[i] == (integer_in_array[i+1]-1) && integer_in_array[i] != (integer_in_array[i-1]+1) ) {
                    System.out.print(integer_in_array[i]+":");
                }
                else if(integer_in_array[i] == (integer_in_array[i+1]-1) && integer_in_array[i] == (integer_in_array[i-1]+1) ) {
                    
                }

            }
            System.out.println();

    }

        
}
