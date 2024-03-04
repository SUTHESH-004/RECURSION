import java.util.*;

public class Swap_a_Array {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(reverse(arr, 0, arr.length - 1)));
        System.out.println(Arrays.toString(arr));

    }
    static int[] reverse(int arr[], int l, int r) {
        if (l >= r)
            return arr;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return reverse(arr, l + 1, r - 1);
    }
}
