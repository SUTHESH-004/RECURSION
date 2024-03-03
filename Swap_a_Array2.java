import java.util.*;

public class Swap_a_Array2 {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(reverse(arr, 0, arr.length - 1)));
    }

    static int[] reverse(int arr[], int i, int n) {
        if (i > n)
            return arr;
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
        return reverse(arr, i + 1, n - i - 1);
    }

}
