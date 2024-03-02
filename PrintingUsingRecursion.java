import java.util.*;

public class PrintingUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int StartingNumber = sc.nextInt();
        int EndingNumber = sc.nextInt();
        int increment = sc.nextInt();
        f(StartingNumber, EndingNumber, increment);
        freverse(StartingNumber, EndingNumber, increment);
        sc.close();
    }

    public static void f(int StartingNumber, int EndingNumber, int increment) {
        if (StartingNumber > EndingNumber)
            return;
        System.out.print(StartingNumber);
        f(StartingNumber + 1, EndingNumber, increment);
    }

    public static void freverse(int StartingNumber, int EndingNumber, int increment) {
        if (StartingNumber > EndingNumber)
            return;
        freverse(StartingNumber + 1, EndingNumber, increment);
        System.out.print(" " + StartingNumber + " ");
    }

}