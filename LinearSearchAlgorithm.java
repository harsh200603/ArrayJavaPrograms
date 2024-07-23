package ArrayPrograms;
import java.util.*;
public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={12,34,65,73,89,96,-2,30,-91};
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("Enter the element to found");
        int target=sc.nextInt();
        System.out.println("The element is present at index :" + LinearSearch(arr,target));

    }
    static int LinearSearch(int [] arr , int target)
    {
        if(arr.length==0)
            return -1;
        for(int index=0;index<arr.length;index++)
        {
            int element=arr[index];
            if(element==target)
                return index;
        }
        return -1;
    }
}
