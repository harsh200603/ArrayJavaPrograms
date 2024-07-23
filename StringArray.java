package ArrayPrograms;

import java.util.*;

public class StringArray {

    public static void main(String[] args) {
        String[] arr = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String values in array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println("\n");
        System.out.println("Elements in arr are :" + Arrays.toString(arr));
        System.out.println("\n");

        //We can also modify the array after the input also.
        arr[0] = "Harsh";
        System.out.println("Modified Array :" + Arrays.toString(arr));

    }

}
