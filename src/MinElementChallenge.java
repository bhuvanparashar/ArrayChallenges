import java.util.*;

    public class MinElementChallenge {
        private static Scanner sc = new Scanner(System.in); // here is the scanner class object.
        public static void main(String[] args) { // and here is the main method.
            System.out.println("Enter count ");
              int count = sc.nextInt(); // how many numbers we like to enter in total; this is asking that count
            sc.nextLine(); // it is used to handle the enter key error.
            int[] myArray = readIntegers(8); // declared an array of type int.
            //findMin(myArray); // called the function findMin[].
            System.out.println("The minimum element in the given array is " +findMin(myArray
            )); // displaying the result returned by findMin[] function.
        }
        public static int[] readIntegers(int count) { //readIntegers function.

            int[] myArray = new int[count]; // here we have declared an array which would take count as input.
            for(int i=0; i < myArray.length; i++) {
              System.out.println("Enter the array elements:");
                myArray[i] = sc.nextInt(); // array initialisation.
            }
            return myArray;
        }
        public static int findMin(int[] myArray) { // findMin method
            int min = Integer.MAX_VALUE; // we've set the minimum value by ourselves as the maximum value an integer can hold
            for(int i=0; i < myArray.length-1; i++) { //for loop for comparison.
                int value = myArray[i]; // taking value of the array entered by the user.
                    if(value<min) {  // comparing if value is smaller than the value we have set. (which of course should be small)
                        min = value; // then we have set the minimum value as the value taken from the input array.
                    }
                } return min; // returned the minimum value.
            }
    }





