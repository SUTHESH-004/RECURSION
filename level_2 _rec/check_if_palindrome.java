import java.util.*;
public class check_if_palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // String b =sc.nextLine();
        String c =sc.nextLine();
        System.out.print(checker(c, 0, c.length()-1));
        sc.close();

    }

    public static boolean checker(String c,int i,int n)
    {
        if(i>=n){
        return true;}
        if(c.charAt(i)!=c.charAt(n)){
        return false;}
        return checker(c,i+1,n-i-1);
        
    }
    
}
