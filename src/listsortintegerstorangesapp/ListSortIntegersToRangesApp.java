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
import java.lang.*;
/**
 *
 * @author jade
 */
public class ListSortIntegersToRangesApp {
    /**
     * @param args the command line arguments
     */
    // Declare the variables before the if
            static String string;
            //static String stringB;
            //static String stringC;
            //static String stringD;
            //static String stringE;
            //static String stringF;
            //static String stringG;
            static String masterString;

    public static void main(String[] args) {
        //System.out.print("This thing is on");
        /** Create the range of numbers. Possibly later take an input for,
         * or generate a random list of numbers. These are in an array.
         **/
        Scanner input = new Scanner(System.in);
        
            System.out.print("Type 7 numbers to sort: ");
            int[] numbers = new int[7];
            for(int typed_integer=0; typed_integer<numbers.length; typed_integer++) {
                numbers[typed_integer] = input.nextInt();
                
                for(int sort_integer=0; sort_integer<numbers.length; sort_integer++) {
                    if(numbers[typed_integer] < numbers[sort_integer]) {
                        int swap = numbers[typed_integer];
                        numbers[typed_integer] = numbers[sort_integer];
                        numbers[sort_integer] = swap;
                    }
                }
            }
            
            System.out.println("All of the numbers in order: ");
            
            for(int print = 0; print<numbers.length; print++) {
                System.out.print(numbers[print]+ " ");
            }
            System.out.println();

            //Printing out the list in the format required, for debugging.
    //Below, added method which prints out the numbers in the format required. It does not work properly with negatives.
            for (int i = 0; i<numbers.length; i++ ) {
                
                if     (i==0)    {
                    if (numbers[i] == numbers[i+1]) {
                        string = Integer.toString(numbers[i])+":";
                        //System.out.print(stringA);
                        masterString = string;
                    }
                    else if (numbers[i] != (numbers[i+1]-1)) {
                        string = Integer.toString(numbers[i])+",";
                        //System.out.print(stringA);
                        masterString = string;
                    }
                    else if (numbers[i] == (numbers[i+1]-1)) {
                        string = Integer.toString(numbers[i])+":";
                        //System.out.print(stringA);
                        masterString = string;
                    }
                }

                else if (i>0 && i<(numbers.length)-1)   {
                    if (numbers[i] == numbers[i-1] || numbers[i] == numbers[i+1]) {
                        string = Integer.toString(numbers[i]);
                    }
                    else if(numbers[i] != (numbers[i+1]-1)) {
                        string = Integer.toString(numbers[i])+",";
                        //System.out.print(stringB);
                        masterString = masterString + string;
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] != (numbers[i-1]+1) ) {
                        string = Integer.toString(numbers[i])+":";
                        //System.out.print(stringB);
                        masterString = masterString + string;
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] == (numbers[i-1]+1) ) {
                        string = Integer.toString(numbers[i]);
                    }

                }

                else if (i<numbers.length)   {
                    string = Integer.toString(numbers[i]);
                    //System.out.print(stringG);
                    masterString = masterString + string;
                    break;
                }
            }
            System.out.println();
            
            System.out.print(masterString);
            //String ranges = (stringA + stringB + stringC + stringD + stringE + stringF + stringG);
            
            //System.out.println("Ranges: "+ranges);

    }
       
}