package ArrayPrograms;

public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = {12, 24, 43, 47, 57};
        System.out.print(max(arr));
    }

    static int max(int[] arr) {
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }
}
