import java.util.*;
//tC - O(n)
//SC - O(n)
public class factorial_Of_A_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));

        sc.close();

    }

    public static int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }
}
