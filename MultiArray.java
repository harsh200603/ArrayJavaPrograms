package ArrayPrograms;

import java.util.Arrays;

public class MultiArray {

    public static void main(String[] args) {
//Declaration of a multidimensional array -> datatype[][] array_name = new datatype[rows][coloumns]
        int[][] a = new int[3][3]; //New Multidimensional Array object is created and memory is allocated in a heap.
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;

        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;

        a[2][0] = 7;
        a[2][1] = 8;
        a[2][2] = 9;

        System.out.println(a[0][0]);

        //While creating an multidimensional array object it is not compulsory to enter the Coloumn No. as in a multidimensional array all the row is a sub array in a multidimensional array.So any sub array can contain more no of elements in it.
        //int[][] b = new int[3][]; Here we have not entered the coloumn.
        //Because some arrays can be like this:
        int[][] b = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        for (int i = 0; i < b.length; i++) {
            System.out.println(Arrays.toString(b[i]) + " ");
        }

    }

}
