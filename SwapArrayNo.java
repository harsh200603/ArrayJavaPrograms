package ArrayPrograms;
//Swapping two numbers of an array
import java.util.*;

public class SwapArrayNo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print(Arrays.toString(arr));
        swap(arr, 2, 4);
        System.out.print("\nAfter Swapping :" + Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
