/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * idea: assign the sorted numbers to objects. i think that's the term 
 * i mean. then for the next step you'll be able to reassign those to
 * an array
 * 1) Implement the following method:

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
        int[] numbers = {5, 3, 4, 13, 12, 14, 20};
        //Print the entire array, as is.
        for (int i = 0; i < 7; i++) {
            //Assumption that number of integers in array is equal to 7.
           System.out.println(numbers[i]); 
        }
        //check

        
    }
}
