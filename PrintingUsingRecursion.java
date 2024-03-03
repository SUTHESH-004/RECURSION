import java.util.*;

public class PrintingUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int StartingNumber = sc.nextInt();
        int EndingNumber = sc.nextInt();
        f(StartingNumber, EndingNumber);
        System.out.println();
        freverse(StartingNumber, EndingNumber);
        System.out.println();
        fb(EndingNumber);
        System.out.println();
        fbreverse(EndingNumber);
        sc.close();
    }

    static void f(int StartingNumber, int EndingNumber) {
        if (StartingNumber > EndingNumber)
            return;
        System.out.print(" " + StartingNumber + " ");
        f(StartingNumber + 1, EndingNumber);
    }

    static void freverse(int StartingNumber, int EndingNumber) {
        if (StartingNumber > EndingNumber)
            return;
        freverse(StartingNumber + 1, EndingNumber);
        System.out.print(" " + StartingNumber + " ");
    }

    static void fb(int EndingNumber) {
        if (EndingNumber < 1)
            return;
        fb(EndingNumber - 1);
        System.out.print(" " + EndingNumber + " ");
    }

    static void fbreverse(int EndingNumber) {
        if (EndingNumber < 1)
            return;
        System.out.print(" " + EndingNumber + " ");
        fbreverse(EndingNumber - 1);
    }
}