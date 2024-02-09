//import java.util.*;
//
//public class DiagonalDifference {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int i,j,n,row,col,diff = 0;
//        n = scan.nextInt();
//        row = scan.nextInt();
//        col = scan.nextInt();
//
//
//        int[][] arr = new int[row][col];
//        for(i=0; i<row; i++) {
//            for (j=0; j<col; j++) {
//                arr[i][j]=scan.nextInt();
//            }
//        }
//        System.out.println(arr);
//
//        int sum1=0;
//        for (i=0; i<row; i++) {
//            for (j=0; j<col; j++) {
//                if(i==j) {
//                    sum1 += arr[i][j];
//                }
//            }
//        }
//        int sum2=0;
//        for (i=0; i<row; i++) {
//            for (j=0; j<col; j++) {
//                if ((i + j) == (n - 1)) {
//                    sum2 += arr[i][j];
//                }
//            }
//        }
//        diff = sum1-sum2;
//        System.out.println(diff);
//    }
//
//}
/*
import java.util.*;

class arr16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int i,j,row,col,sum=0;
        System.out.println("Enter the number of rows:");
        row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        col = sc.nextInt();

        int[][] mat = new int[row][col];

        System.out.println("Enter the elements of the matrix") ;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the matrix") ;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println("");
        }

        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(i==j) //this condition checks for diagonal
                {
                    sum = sum + mat[i][j];
                }
            }
        }

        System.out.printf("SUM of DIAGONAL elements of the matrix = "+sum) ;
    }
}
*/


import java.util.Scanner;

public class DiagonalDifference  {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n;
                int diag1 = 0;
                int diag2 = 0;
                n = Integer.parseInt(in.nextLine());
                for (int i = 0; i < n; i++) {
                    String str[] = in.nextLine().split(" ");
                    diag1 = diag1 + Integer.parseInt(str[i]);
                    diag2 = diag2 + Integer.parseInt(str[n - 1 - i]);
                }

                int diagDiff = Math.abs(diag1 - diag2);
                System.out.println(diagDiff);
            }
        }
