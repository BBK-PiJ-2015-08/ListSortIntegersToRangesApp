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
            
            
                
        // Commented out to take input of numbers/int[] numbers = {5, 3, 4, 13, 12, 14, 20};
        //Print the entire array, as is.
        // Commented/ for (int i = 0; i < 7; i++) {
        //    out to try input    //Assumption that number of integers in array is equal to 7.
        //       for these numbers   System.out.println(numbers[i]); 
            //below i print any numbers where the difference between the number and the next number in the array
            //is exactly 1. Yes, this works.
// commented     for (int i = 0; i<5; i++ ) {
                //if(i=)
                
//              if (num_in_array[i]==(num_in_array[i+1]-1)) {
//                  if(num_in_array[i+1] != (num_in_array[i+2]-1)){
//                      System.out.println(num_in_array[i]+":"+num_in_array[i+1] );
//                      i++;
//                  }
                    

                    
//              }
//              else {
//                  System.out.println(num_in_array[i]+", ");
//              }
                
//          }

    }

        //check

        
    }
