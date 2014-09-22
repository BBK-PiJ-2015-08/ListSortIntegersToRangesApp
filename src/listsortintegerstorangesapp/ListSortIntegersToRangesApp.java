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
            static int[] sequence;
            static String[] preRangeExpansion;
            static ArrayList postRangeExpansion;

    public static void main(String[] args) {

        int[] inputData = new int[] {1,3,4,6,7};
        System.out.println(ranges(inputData));
        
        String inputData2 = "1,3:4,6:7";
        System.out.println(java.util.Arrays.toString(sequence(inputData2)));
//Take any of the 4-line chunks of code below out of comments to apply the methods to different ranges.         
/**     
        int[] inputData3 = new int[] {1,2};
        System.out.println(ranges(inputData3));
        String inputData4 = "1:2";
        System.out.println(java.util.Arrays.toString(sequence(inputData4)));

        int[] inputData5 = new int[] {1,2,3,5};
        System.out.println(ranges(inputData5));
        String inputData6 = "1:3,5";
        System.out.println(java.util.Arrays.toString(sequence(inputData6)));
        
        int[] inputData7 = new int[] {1};
        System.out.println(ranges(inputData7));
        String inputData8 = "1";
        System.out.println(java.util.Arrays.toString(sequence(inputData8)));

//Testing list of numbers with no ranges
        int[] inputData9 = new int[] {1,3,5,11};
        System.out.println(ranges(inputData9));
        String inputData10 = "1,3,5,11";
        System.out.println(sequence(inputData10)); 
**/        
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
        String rangesHolder = ranges;
        String delims = "[,]";
        String[] preRangeExpansion = rangesHolder.split(delims);
        
        ArrayList<String> postRangeExpansion = new ArrayList<String>();
        for (int i = 0; i < preRangeExpansion.length; i++) {
            
            if (preRangeExpansion[i].contains(":")) {                
//Split current Array element into two by where ':' is
                String s = (preRangeExpansion[i]);
                int p = s.indexOf(":");
                if (p >= 0) {
                    String left = s.substring(0, p);
                    String right = s.substring(p+1);
                    
                    if ((Integer.parseInt(left)+1) == (Integer.parseInt(right)) ) {
                        postRangeExpansion.add(left);
                        postRangeExpansion.add(right);
                    }
//If there are numbers between left and right, add these to the array list.
                    else if ((Integer.parseInt(left)+1) != (Integer.parseInt(right)) ) {
                        int difference = ((Integer.parseInt(right))-(Integer.parseInt(left)));
                        System.out.println("Difference: "+difference);
                        postRangeExpansion.add(left);
                        for (int j = 1; j < difference; j++) {
                            postRangeExpansion.add(Integer.toString(Integer.parseInt(right)+j-difference) );
                        }
                        postRangeExpansion.add(right);
                    }
                }
            }
            else {
                postRangeExpansion.add(preRangeExpansion[i]);            
            }            
        }
        
        String[] targetArray = postRangeExpansion.toArray(new String[postRangeExpansion.size()]);
        for (String s : targetArray){
            System.out.println(s);
        }
        
//Convert String[] array to int[] array
        int[] sequenceArray = new int[targetArray.length];
        for (int i = 0; i < targetArray.length; i++) {
            sequenceArray[i] = Integer.parseInt(targetArray[i]);
        }
        return sequenceArray;
    }
}