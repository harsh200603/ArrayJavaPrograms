package ArrayPrograms;
import java.util.*;
public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        //Initializing and Printing the array.
        int [] arr={12,34,65,73,89,96,-2,30,-91};
        System.out.println("Array : "+Arrays.toString(arr));

        //Input of the target element.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to found");
        int target=sc.nextInt();

        //Calling the function to find the target element in array.
        System.out.println("The element is present at index :" + LinearSearch(arr,target));

    }
    static int LinearSearch(int [] arr , int target)
    {
        if(arr.length==0) //checks if the array contains some elements or it is an empty array.
            return -1;
        for(int index=0;index<arr.length;index++)//Iterates over the array
        {
            int element=arr[index]; // Initially arr[index] will be 0 so element will be zero
            if(element==target)
                return index;  //returns index no if element equals the target element.
        }
        return -1;
    }
}
