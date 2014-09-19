/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
        int[] numbers = {5, 3, 4, 3, 12, 14, 20};
        //Print the entire array, as is.
        for (int i = 0; i < 7; i++) {
            //Assumption that number of integers in array is equal to 7.
           System.out.println(numbers[i]); 
        }
        
        
    }
}
