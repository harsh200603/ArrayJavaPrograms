package ArrayPrograms;

import java.util.Arrays;

public class ReversingArray2 {
    public static void main(String[] args) {
        //Initializing the Array
        int[] arr = {12, 94, 76, 87, 34, 23, 9};

        //Printing the Original Array
        System.out.println("Original Array : "+Arrays.toString(arr));

        //Calling the Function for Reversing the Array
        Reverse(arr);

        //Printing the Reversed Array
        System.out.print("Reversed Array : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


    static void Reverse(int [] arr)
    {
        int left=0; // First Element of Array
        int right=arr.length-1;  //Last Element of Array
        while(left<right) {
            int temp = arr[left];  //first element is stored in a temp variable
            arr[left] = arr[right];  //left element is swapped with right element
            arr[right] = temp;  //right element is swapped with left element with help of temp variable

            left++; //left keeps on iterating towards right
            right--; //right keeps on iterating towards left till left<right and while loop ends
        }
    }
}
