import java.util.*;

public class functionalSumaztion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(printSumaztion(3));
        
        sc.close();

    }

    public static int printSumaztion(int ans) {
        if(ans==1)
        return 1;
        return ans + printSumaztion(ans-1);
    }
    // 3+printSumaztion(3-1=2)
    // 2 + printSumation(2-1=1 )
    //if 1 return 1;
    // return 2 + 1
    //return 3+3;
    //return 6;
}
