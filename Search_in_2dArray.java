package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Search_in_2dArray {
    public static void main(String[] args) {
        int [][] arr={
                {24,4,1},
                {18,12,5,9},
                {118,2}
        };
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the target number to find :");
        int target=sc.nextInt();

        int [] ans=SearchIn2DArray(target , arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] SearchIn2DArray(int target,int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target)
                    return new int[]{row, col};

            }
        }
        return new int[]{-1, -1};
    }
}
