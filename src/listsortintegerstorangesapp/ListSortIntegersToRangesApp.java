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
            static String stringA;
            static String stringB;
            static String stringC;
            static String stringD;
            static String stringE;
            static String stringF;
            static String stringG;
            static String stringH;
            static String stringI;
            static String stringJ;
            static String stringK;

    public static void main(String[] args) {
        //System.out.print("This thing is on");
        /** Create the range of numbers. Possibly later take an input for,
         * or generate a random list of numbers. These are in an array.
         **/
        Scanner input = new Scanner(System.in);
        
            System.out.print("Type 7 numbers to sort: ");
            int[] numbers = new int[7];
            for(int typed_integer=0; typed_integer<7; typed_integer++) {
                numbers[typed_integer] = input.nextInt();
                
                for(int sort_integer=0; sort_integer<7; sort_integer++) {
                    if(numbers[typed_integer] < numbers[sort_integer]) {
                        int swap = numbers[typed_integer];
                        numbers[typed_integer] = numbers[sort_integer];
                        numbers[sort_integer] = swap;
                    }
                }
            }
            
            System.out.println("All of the numbers in order: ");
            
            for(int print = 0; print<7; print++) {
                System.out.print(numbers[print]+ " ");
            }
            System.out.println();

//Declaring variables moved from here.

            //Printing out the list in the format required.
    //Below, added method which prints out the numbers in the format required. They may
          //still be integers though. It does not work properly with negatives.
            for (int i = 0; i<7; i++ ) {
                //The first if statement below handles what to do if the next number is the same as the current number.
                //When this is the case it will not print the current number, because to avoid duplicate numbers only the
                //final identical number in the sorted sequence prints.
                if     (i==0)    {
                    if (numbers[i] == numbers[i+1]) {
                        stringA = Integer.toString(numbers[i])+":";
                        System.out.print(stringA);
                    }
                    else if (numbers[i] != (numbers[i+1]-1)) {
                        stringA = Integer.toString(numbers[i])+",";
                        System.out.print(stringA);
                    }
                    else if (numbers[i] == (numbers[i+1]-1)) {
                        stringA = Integer.toString(numbers[i])+":";
                        System.out.print(stringA);
                    }
                }

                else if (i==1)   {
                    if (numbers[i] == numbers[i-1] || numbers[i] == numbers[i+1]) {
                        stringB = Integer.toString(numbers[i]);
                    }
                    else if(numbers[i] != (numbers[i+1]-1)) {
                        stringB = Integer.toString(numbers[i])+",";
                        System.out.print(stringB);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] != (numbers[i-1]+1) ) {
                        stringB = Integer.toString(numbers[i])+":";
                        System.out.print(stringB);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] == (numbers[i-1]+1) ) {
                        stringB = Integer.toString(numbers[i]);
                    }

                }

                else if (i==2)   {
                    if (numbers[i] == numbers[i-1] || numbers[i] == numbers[i+1]) {
                        stringC = Integer.toString(numbers[i]);
                    }
                    else if(numbers[i] != (numbers[i+1]-1)) {
                        stringC = Integer.toString(numbers[i])+",";
                        System.out.print(stringC);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] != (numbers[i-1]+1) ) {
                        stringC = Integer.toString(numbers[i])+":";
                        System.out.print(stringC);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] == (numbers[i-1]+1) ) {
                        stringC = Integer.toString(numbers[i]);
                    }
                }

                else if (i==3)   {
                    if (numbers[i] == numbers[i-1] || numbers[i] == numbers[i+1]) {
                        stringD = Integer.toString(numbers[i]);
                    }
                    else if(numbers[i] != (numbers[i+1]-1)) {
                        stringD = Integer.toString(numbers[i])+",";
                        System.out.print(stringD);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] != (numbers[i-1]+1) ) {
                        stringD = Integer.toString(numbers[i])+":";
                        System.out.print(stringD);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] == (numbers[i-1]+1) ) {
                        stringD = Integer.toString(numbers[i]);
                    }
                }

                else if (i==4)   {
                    if (numbers[i] == numbers[i-1] || numbers[i] == numbers[i+1]) {
                        stringE = Integer.toString(numbers[i]);
                    }
                    else if(numbers[i] != (numbers[i+1]-1)) {
                        stringE = Integer.toString(numbers[i])+",";
                        System.out.print(stringE);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] != (numbers[i-1]+1) ) {
                        stringE = Integer.toString(numbers[i])+":";
                        System.out.print(stringE);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] == (numbers[i-1]+1) ) {
                        stringE = Integer.toString(numbers[i]);
                    }
                }

                else if (i==5)   {
                    if (numbers[i] == numbers[i-1] || numbers[i] == numbers[i+1]) {
                        stringF = Integer.toString(numbers[i]);
                    }
                    else if(numbers[i] != (numbers[i+1]-1)) {
                        stringF = Integer.toString(numbers[i])+",";
                        System.out.print(stringF);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] != (numbers[i-1]+1) ) {
                        stringF = Integer.toString(numbers[i])+":";
                        System.out.print(stringF);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] == (numbers[i-1]+1) ) {
                        stringF = Integer.toString(numbers[i]);
                    }
                }

                else if (i==6)   {
                    stringG = Integer.toString(numbers[i]);
                    System.out.print(stringG);
                    break;
                }
/**
///////////////Below is the original code
                //have just replicated this for the first index.
                if(i<6 && i!=0 && numbers[i] == (numbers[i+1])) {
                    stringJ = Integer.toString(numbers[i]);
                }
                //Have replicated this 
                else if (i==6) {
                    stringK = Integer.toString(numbers[i]);
                    System.out.print(stringK);
                    break;
                }
                //Have replicated this
                else if (i==0 && numbers[i] == numbers[i+1]) {
                    stringA = Integer.toString(numbers[i])+":";
                    System.out.print(stringA);
                }
                //Have replicated this
                else if (i==0 && numbers[i] != (numbers[i+1]-1)) {
                    stringB = Integer.toString(numbers[i])+",";
                    System.out.print(stringB);
                    
                }
                //Have replaced this by using an OR (||) condition if number is same as next or same as previous.
                //Have replicated this
                else if (i==0 && numbers[i] == (numbers[i+1]-1)) {
                    stringC = Integer.toString(numbers[i])+":";
                    System.out.print(stringC);
                }
                //Have replaced this by using an OR (||) condition if number is same as next or same as previous.
                //If the current number is the same as the previous number and the next number, do not print anything.
                else if (numbers[i] == numbers[i-1] && numbers[i] == numbers[i+1]){
                    stringD = Integer.toString(numbers[i]);
                }
                //Have replaced this by using an OR (||) condition if number is same as next or same as previous.
                //If the current number is preceded by a consecutive number and the current number is the same as the next number, don't print.
                else if (numbers[i] == (numbers[i-1]+1) && numbers[i] == numbers[i+1]){
                    stringE = Integer.toString(numbers[i]);
                }
                //Have replaced this by using an OR (||) condition if number is same as next or same as previous.
                //If the current number is the same as the previous number and followed by a consecutive number, don't print it.
                else if (numbers[i] == (numbers[i-1]) && numbers[i] == (numbers[i+1])-1 ){
                    stringF = Integer.toString(numbers[i]);
                }
                //Have replicated this for index positions 1-5
                else if(numbers[i] != (numbers[i+1]-1)) {
                    stringG = Integer.toString(numbers[i])+",";
                    System.out.print(stringG);
                }
                //Have replicated this for index positions 1-5
                else if(numbers[i] == (numbers[i+1]-1) && numbers[i] != (numbers[i-1]+1) ) {
                    stringH = Integer.toString(numbers[i])+":";
                    System.out.print(stringH);
                }
                //Have replicated this for index positions 1-5
                else if(numbers[i] == (numbers[i+1]-1) && numbers[i] == (numbers[i-1]+1) ) {
                    stringI = Integer.toString(numbers[i]);
                }
                //Probably not necessary.
                else {
                    System.out.println();
                } 
                **/
//Bracket below is the closure of the for loop.
            }
            System.out.println();
            //System.out.println("A string: " + stringB + stringG + stringK);
     //Attempt to print only the values which are not null.
            if (stringA != null) {
                System.out.print(stringA);
            }
            if (stringB != null) {
                System.out.print(stringB);
            }
            if (stringC != null) {
                System.out.print(stringC);
            }
            if (stringD != null) {
                System.out.print(stringD);
            }
            if (stringE != null) {
                System.out.print(stringE);
            }
            if (stringF != null) {
                System.out.print(stringF);
            }
            if (stringG != null) {
                System.out.print(stringG);
            }
            if (stringH != null) {
                System.out.print(stringH);
            }
            if (stringI != null) {
                System.out.print(stringI);
            }
            if (stringJ != null) {
                System.out.print(stringJ);
            }
            if (stringK != null) {
                System.out.print(stringK);
            }
            

    }
       
}