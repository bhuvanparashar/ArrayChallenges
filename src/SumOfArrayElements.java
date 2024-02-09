import java.io.*;
import java.util.*;

public class SumOfArrayElements {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in); // first we have taken input here from the user.
            int numberOfElements = in.nextInt(); //asked how many total number of elements gonna be there.
            int array[] = new int[numberOfElements]; // created an array and initialized with the count.
            int sumOfArray = 0; // set sum to zero.
            for(int i = 0; i < numberOfElements; i++) { // used the loop for sum.
                array[i] = in.nextInt(); //now asking the user to input the value and storing that on indices.
                sumOfArray += array[i]; // adding the values of array.
            }
            System.out.println(sumOfArray); // displaying the sum.
            in.close(); // closing the scanner object.
        }
    }

