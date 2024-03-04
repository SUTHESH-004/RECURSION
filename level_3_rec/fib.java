package level_3_rec;

import java.util.*;

public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        int n = sc.nextInt();
        System.out.println(fibz(n));
        sc.close();
    }

    static int fibz(int n) {
        if (n <= 1)
            return n;
        int last = fibz(n - 1);
        int slast = fibz(n - 2);
        return last + slast;
    }
}