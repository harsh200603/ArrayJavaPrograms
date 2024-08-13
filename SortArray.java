package ArrayPrograms;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] arr={12,34,56,3,45,90,23,6,76};
        System.out.println("Original Array :"+Arrays.toString(arr));

        Sorting(arr);
        System.out.println("Sorted Array :"+Arrays.toString(arr));

    }

    static void Sorting(int [] arr)
    {
        int i=0;
        int j=1;
        while(arr[j]==arr.length-1)
        {
            int temp=arr[i];

            if(arr[i]>arr[j])
            {
                arr[j]=temp;
                arr[i]=arr[j];
            }
            i++;
            j++;

            if(arr[i]<arr[j]) {
                i++;
                j++;
            }
        }


    }


}
