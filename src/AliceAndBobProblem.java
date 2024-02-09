
import java.util.*;


public class AliceAndBobProblem {

    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scan = new Scanner(System.in);
//    	int N = scan.nextInt();
            int[] alice = new int[3]; //array of alice declared with count.
            int[] bob = new int[3]; // array of bob declared with count.
            int a=0, b=0; // two int vars a and b initialized with zero.
            for(int i=0;i<3;i++)
                alice[i]=scan.nextInt(); // alice array initialization.
            for(int i=0;i<3;i++)
                bob[i]=scan.nextInt(); //bob array initialization.
            for(int i=0;i<3;i++) //comparing the index values.
                if(alice[i]>bob[i])
                    a++; //if alice's value is greater a is incremented.
                else if(alice[i]<bob[i])
                    b++; // if bob's value is greater b is incremented.
            System.out.println(a+" "+b); // display the values of a and b.
            scan.close(); //closing the scanner object.
        }
}
