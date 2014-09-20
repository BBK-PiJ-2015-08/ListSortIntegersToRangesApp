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
        //Adding this bit inside an interface to make the method static
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
            
            //Below to convert each integer to a string, assigned to s1 each time.
            //Want to convert each integer to a separate string instead.
            int i=0;
            while(i<7){
                String s1 = String.valueOf(integer_in_array[i]);
                System.out.print(s1+",");
                i++;
            }
            
            
            
            //for (int sorted_array = 0; sorted_array < 7; sorted_array++) {
                
                //new Integer(sorted_string) = toString(integer_in_array[sorted_array]);
                //System.out.print(sorted_string);
                
                //new Integer().toString(integer_in_array[sorted_array]);
            //}
            

    }

        //check

        
    }
