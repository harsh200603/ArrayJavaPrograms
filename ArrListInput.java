package ArrayPrograms;

import java.util.*;

public class ArrListInput {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to add in the list: ");
        //Input
        for (int i = 0; i <= 5; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i <= 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
