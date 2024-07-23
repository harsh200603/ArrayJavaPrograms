package ArrayPrograms;//Reversing the array with the help of swap function.

import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {12, 94, 76, 87, 34, 23, 9};
        reverse(arr);
        System.out.println("Reversed Array is:" + Arrays.toString(arr));

    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        /* Start and end element of Array is swapped till they meet each other at last both are also swapped
while loop is used to iterate till swapping ends up with swapping start and end element.
start keeps on incrementing and end element keeps decrementing.
         */
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
