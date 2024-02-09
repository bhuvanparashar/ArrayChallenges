import java.util.*;

public class ChallengeOne {
    private static Scanner scanner = new Scanner(System.in); //a Scanner object
    // is created cus it allows us to input value into the console.
    public static void main(String[] args) {
        int[] myArray = getIntegers(6); // myArray called the method getIntegers.
        int[] sorted = sortedIntegers(myArray); // another array named sorted calls
        // a method in which myArray is passed as parameter.
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) { // it is a method which returns
        //array and contains a parameter of type int.
        int[] array = new int[capacity]; // a new array is declared.
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt(); // the values we entered are stored in
            // the array.
        }
        return array; // the elements of this array is then stored in the myArray
        // of main method.
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contains " + array[i]);
        }
    }

    public static int[] sortedIntegers(int[] array) {
        /*int[] sortedArray = new int[array.length]; //here we have passed the array of same size into sortedArray.
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }*/

        int[] sortedArray = Arrays.copyOf(array, array.length); // a new array is created
        // in which contents of myArray are pasted.

        boolean flag = true; // created a variable named flag and set it to true.
        int temp; // created a variable.
        while (flag) { // this loop will run until flag is true.
            flag = false; // now set the value of flag to false.
            for (int i = 0; i < sortedArray.length - 1; i++) { // traversing the sortedArray.
                if (sortedArray[i] < sortedArray[i + 1]) { // comparing a value with the next value.
                    temp = sortedArray[i]; // temp is initialized with a value of sortedArray which is less than to the value it has compared with.
                    sortedArray[i] = sortedArray[i + 1]; // then swapping the values.
                    sortedArray[i + 1] = temp; // in this too; swapping.
                    flag = true; // the flag is set to true again.
                }
            }
        }
        return sortedArray;
    }
// now understanding the concept of this flag variable. First we initialized it with
    // value true then we again set it to false. The while loop will run until
    // the value of flag is true. So when comparison of swapping will be done the value
    // is set to true again then the while loop will check the value and it is valid
    // so it will run for one more time. And this will keep happening until the
    // condn in Line40 is not true. After then the whole code block of if would be
    //skipped and things will get fine.

}