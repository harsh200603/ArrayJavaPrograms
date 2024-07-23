package ArrayPrograms;

import java.util.*;

public class MultidimArrList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialization of Multidimensional ArrayList is must or else it will get errors.
        for (int i = 0; i < 3; i++) // ->This means this multidimensional array list will contain 3 array list in it.
        {
            list.add(new ArrayList<>());
        }

        //Adding values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());//get the element at the element 0 till 3 from scanner.

            }
        }
        System.out.println(list);
    }
}
