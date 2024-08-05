package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

/*
Note:This program only works with Sorted Array
Input:arr[] , int target
Output : Index no. of Target Element.
In Binary Search we iterate over an array in an efficient way first a Start position is declared
and end is declared at end of the array and by using them mid-element of the array is found
if the target element is greater than mid-element start=mid+1 and end element remains as it is.
If the target element is smaller than mid-element end=mid-1 and start element remains as it is.
Sometimes , the mid-element can be equal to target element ,so it requests the target element index
This process keeps on repeating, until start<=end element
*/
public class BinarySearch {
    public static void main(String[] args) {
        //Initializing the array
        int [] arr={-2,0,2,13,56,78,79,81,99,12};

        //Printing the array
        System.out.println(Arrays.toString(arr));

        //Taking Input for target element
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target Element to be found : ");
        int target=sc.nextInt();

        //Running the function SearchBinary()
        int ans=SearchBinary(arr,target);
        System.out.println("Your target element is present at index no. : "+ans);
    }


    static int SearchBinary(int[] arr , int target)
    {
      int start=0;
      int end=arr.length-1;
      while(start<=end)//Keeps on iterating till the start element becomes equal or smaller than end element.
      {
          //Finding the middle element
          /*int mid=(start+end)/2; but this method will not work for some scenarios as the sum of
          start and end can exceed the limit of integer datatype ,so we will use the below formula*/
          int mid=start+(end-start)/2;
          if(target>arr[mid])//Iterate on the right side of array and find a new mid-element.
          {
              start=mid+1;
          }
          else if(target<arr[mid])//Iterate on the left side of array and find a new mid-element.
          {
              end=mid-1;
          }
          else
              return mid;//when nor more array elements are available to iterate and mid-element equals the target element returns mid.
      }
      return -1;
    }
}
