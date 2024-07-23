package ArrayPrograms;

import java.util.Arrays;

public class ArrayChange {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeArr(int array[]) {
        array[0] = 99;
        /*In this function it is succesful to change the value of array's 0th index because here we modified the value of array , previously we were just passing a new value but not modifying the value and also Strings can't be changed due to Security reasons.*/

    }
}
