package ArrayPrograms;

import java.util.Scanner;

public class MaxSearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr={
                {24,4,1},
                {18,12,5,9},
                {118,2}
        };

        //Printing 2D Array
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Calling the MaxSearch Function.
        System.out.println("Maximum Element in array is : " + MaxSearch(arr));


    }
    //Function for Searching maximum element
    static int MaxSearch(int[][] arr)
    {
        int max=Integer.MIN_VALUE;  //max contains minimum value that an Integer can hold
        for(int row=0;row<arr.length;row++) //iterates over the row
        {
            for(int col=0;col<arr[row].length;col++) //iterates over the column
            {
                if(arr[row][col]>max)
                    max=arr[row][col]; //max equals to arr[row][col] element.
            }
        }
        return max;
    }
}
