package ArrayPrograms;/*ArrayList is special because it can grow or shrink as you add or remove items from it. This means you don't have to decide how many items it will hold when you create it.
 It's a dynamic array that can grow or shrink in size as elements are added or removed.
 */
import java.util.*;

public class ArrayListEx {

    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        //Adding items to Array List.
        list.add(10);
        list.add(210);
        list.add(100);
        list.add(284);
        list.add(1);
        list.add(850);

        //Printing the Array List
        System.out.println("Array List is : " + list);

        //Check if the list contains any particular item.
        System.out.println("\n" + list.contains(100)); // ->Returns True Value if it contains the element .
        System.out.println(list.contains(1000)); // ->Returns False Value if it contains the element.

        //To update the value of any element in the list .set method is used Syntax -> list.set(indexno , element to be added);
        list.set(0, 55);
        System.out.println("\nList after updating the value at index 0 :" + list);

        //Removing of any element from the list .remove method is used Syntax -> list.remove(index no.);
        list.remove(3);
        System.out.println("\nList after removing the 3rd index no. : " + list);

    }
}
