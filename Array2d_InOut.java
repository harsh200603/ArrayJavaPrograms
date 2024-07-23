package ArrayPrograms;

import java.util.*;

public class Array2d_InOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];

        //Input
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = sc.nextInt();
            }
        }
        System.out.println("\n");

        //Output
        for (int row = 0; row < a.length; row++) {     //->a.length represents no. of rows
            for (int col = 0; col < a[row].length; col++) { // -> a[row].length represents no. of rows in each particular row.
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        //This can also be printed with
        for (int row = 0; row < a.length; row++) {
            System.out.println(Arrays.toString(a[row]) + " ");
        }
    }
}
