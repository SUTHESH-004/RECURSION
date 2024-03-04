import java.util.*;

public class parameterizedway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printSumaztion(sc.nextInt(), 0);
        sc.close();

    }

    public static void printSumaztion(int val, int ans) {
        if (val == 0) {
            System.out.println(ans);
            return;
        }
        printSumaztion(val - 1, ans + val);
    }
}
