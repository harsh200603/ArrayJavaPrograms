package ArrayPrograms;/*Array is a non primitive data structure containing with homogeneous type of data with similar datatypes only.
 
 */
import java.util.*;

public class Array {

    public static void main(String[] args) {
        /*
         Syntax of an Array:
         datatype [] array_name = new datatype[size_of_array];  ->This helps in creating a new object of array

         */
        int[] rollno = new int[5]; // ->A new array object is created with a size of 5 data item that can be stored.

        int[] a; // ->(Declaration) This is just a declaration of an array , a is defined in the stack no memory is allocated.This takes place at Compile time.

        a = new int[10]; // ->(Initialization) Here , when a new keyword is used the actual object is being created in the heap memory.This is also called as Dynamic Memory Allocation which happens at Runtime.

        /* In C , C++ continous memory allocation (Data is not stored in continous blocks of memory) is used as they havae pointers but in JAVA there is no continous memory allocation. 
        As , memory is allocated in heap memory in JAVA ,we know heap objects may not be continous.(Data is not stored in continous blocks of memory). -> It depends on JVM.
         */
        //Adding elements in rollno array manually.
        rollno[0] = 1;
        rollno[1] = 2;
        rollno[2] = 3;
        rollno[3] = 4;
        rollno[4] = 5;

        //Now printing the array elements of rollno array.
        System.out.println("Elements in Rollno Array are :");
        for (int i = 0; i < 5; i++) {
            System.out.print(rollno[i] + " ");
        }
        System.out.println("\n");

        //Now taking input in 'a' array as size of array is 10 we can't manually add them as in added in rollno. So here we will use Scanner and for loop.
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the elements in the array 'a' :");
        for (int j = 0; j < 10; j++) {
            a[j] = sc.nextInt();
        }
        System.out.println("Elements in a Array are :");
        for (int j = 0; j < 10; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("\n");

        //Another easy method to print an array.
        int[] b = {12, 34, 54, 76, 12};
        System.out.println("\nElements in b Array 'b' are :" + Arrays.toString(b)); //-> Arrays.toString() function converts the array elements into String and prints it easily, it also follows the same for loop method but internally as it is predefined function in JAVA. 

    }
}
