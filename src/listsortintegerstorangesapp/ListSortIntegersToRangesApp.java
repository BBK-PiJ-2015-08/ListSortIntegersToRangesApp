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
        
        int[] inputData7 = new int[] {1,2,3,4,5};
        System.out.println(ranges(inputData7));
        
        String inputData8 = "1:5";
        System.out.println(sequence(inputData8)); 

        /**        int[] inputData = new int[] {1,3,4,6,7};
        System.out.println(ranges(inputData));
        
        String inputData2 = "1,3:4,6:7";
        System.out.println(sequence(inputData2));   
        
 //       Testing long ranges
        int[] inputData3 = new int[] {1,3,4,5,10,11};
        System.out.println(ranges(inputData3));
        
        String inputData4 = "1,3:5,10:11";
        System.out.println(sequence(inputData4));  

        //Testing list of numbers with no ranges
        int[] inputData5 = new int[] {1,3,5,11};
        System.out.println(ranges(inputData5));
        
        String inputData6 = "1,3,5,11";
        System.out.println(sequence(inputData6)); 
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
        //System.out.println(ranges);
        String rangesHolder = ranges;
        String delims = "[,]";
        String[] preRangeExpansion = rangesHolder.split(delims);
        
        //Slightly weird style in this chunk below.
        ArrayList<String> postRangeExpansion = new ArrayList<String>();
//        ArrayList<String> postRangeExpansion = new ArrayList<String>(Arrays.asList(preRangeExpansion));
        for (int i = 0; i < preRangeExpansion.length; i++) {
//          String divider = ":";
            //Can i change contains(divider) to contains(":")
            if (preRangeExpansion[i].contains(":")) {
                
                //Attempt to split current Array element into left and right
                String s = (preRangeExpansion[i]);
                int p = s.indexOf(":");
                if (p >= 0) {
                    String left = s.substring(0, p);
                    String right = s.substring(p+1);
                    
                    if ((Integer.parseInt(left)+1) == (Integer.parseInt(right)) ) {
                        postRangeExpansion.add(left);
                        postRangeExpansion.add(right);
                    }

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
        
        String[] targetArray = new String[postRangeExpansion.size()];
        targetArray = postRangeExpansion.toArray(targetArray);
        for (String s : targetArray){
            System.out.println(s);
        }
            
        //Unsure of this below bit (up to closure of opening curly bracket)
/**        for (String str: postRangeExpansion){
                System.out.println(str);
        }
        
        String[] intermediate=postRangeExpansion.toArray(new String[postRangeExpansion.size()]);
        int[] sequence = new int[intermediate.length];
        int i=0;
        for(String stringo : intermediate){
            sequence[i++] = Integer.parseInt(stringo);
        }
        
        System.out.println("Int array: "+sequence[1]);

**/        
        return sequence;
    }
}