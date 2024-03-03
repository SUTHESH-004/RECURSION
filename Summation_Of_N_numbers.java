import java.util.*;

public class Summation_Of_N_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(sc.nextInt(), 0, 1));

        sc.close();

    }

    static int sum(int val, int ans, int temp) {
        if (temp > val) {
            return ans;
        }
        ans += temp;
        return sum(val, ans, temp + 1);
    }
}
