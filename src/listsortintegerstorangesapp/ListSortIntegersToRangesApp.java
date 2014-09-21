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
 * @author jade
 */
public class ListSortIntegersToRangesApp {
    /**
     * @param args the command line arguments
     */
            static String string;
            static String masterString;
            static String ranges;

    public static void main(String[] args) {
        int[] inputData = new int[] {1,3,4,6,7};
        ranges(inputData);
        System.out.println(ranges(inputData));
    }
    /**
     *
     * @param numbers
     * @return
     */
    static String ranges(int[] numbers) {

            for (int i = 0; i<numbers.length; i++ ) {
                
                if     (i==0)    {
                    if (numbers[i] == numbers[i+1]) {
                        string = Integer.toString(numbers[i])+":";
                        masterString = string;
                    }
                    else if (numbers[i] != (numbers[i+1]-1)) {
                        string = Integer.toString(numbers[i])+",";
                        masterString = string;
                    }
                    else if (numbers[i] == (numbers[i+1]-1)) {
                        string = Integer.toString(numbers[i])+":";
                        masterString = string;
                    }
                }

                else if (i>0 && i<(numbers.length)-1)   {
                    if (numbers[i] == numbers[i-1] || numbers[i] == numbers[i+1]) {
                        string = Integer.toString(numbers[i]);
                    }
                    else if(numbers[i] != (numbers[i+1]-1)) {
                        string = Integer.toString(numbers[i])+",";
                        masterString = masterString + string;
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] != (numbers[i-1]+1) ) {
                        string = Integer.toString(numbers[i])+":";
                        masterString = masterString + string;
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] == (numbers[i-1]+1) ) {
                        string = Integer.toString(numbers[i]);
                    }

                }

                else if (i<numbers.length)   {
                    string = Integer.toString(numbers[i]);
                    masterString = masterString + string;
                    break;
                }
            }
            
            ranges = masterString;
            return ranges;
    }
    static int[] sequence(String ranges) {
        return sequence;
    }
}