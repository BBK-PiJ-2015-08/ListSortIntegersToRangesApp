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
            static String sequence;

    public static void main(String[] args) {
        int[] removeThis = new int[5];
        removeThis[0] = 1;
        removeThis[1] = 3;
        removeThis[2] = 4;
        removeThis[3] = 6;
        removeThis[4] = 7;
        ranges(removeThis);
        System.out.print(ranges(removeThis));
    }
    /**
     *
     * @param numbers
     * @return
     */
    static String ranges(int[] numbers) {
        /** Ask user to decide the size of the array.**/        
        /**Scanner input = new Scanner(System.in);
            System.out.print("How many numbers would you like the array to contain? ");
            numbers = new int[input.nextInt()];
            
        /** Ask user to type in values for the array.            
            System.out.print("Type in the numbers you wish to sort: ");
            
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
            **/
            
            for(int print = 0; print<numbers.length; print++) {
                //System.out.print(numbers[print]+ " ");
            }
            //System.out.println();

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
            //System.out.println();
            
            ranges = masterString;
            
            //System.out.println("Ranges: "+ranges);
            
            //Attempting to convert the string back into an array
            //int[] sequence = new int[5];
            
            //String[] sequence = ranges.split(",");
            //for (int position = 0; position<sequence.length; position++){
            //    if(sequence[position].equals(":")){
            //        System.out.print("Uh oh");
            //    }
            //    else {
            //        System.out.println("Array element contains "+sequence[position]);
            //    }
            //}

            //int[] sequence = new int[numbers.length];
            //System.out.println(sequence);
            
//            ranges();
        return ranges;
    
    }
    

}