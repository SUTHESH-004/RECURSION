package level_1_rec;
// import java.util.*;
public class rec { 
    public static void main(String[] args)
    {
        int a =0123;
        // String b = f(a,a.length()-1,"");
        // System.out.print(b);
        String h = fr(a,"");
        System.out.println(h);
    }
    static String fr(int num,String ans)
    {
        if(num==0)
        {
            return ans;
        }
        ans=String.valueOf((int)num%10)+fr((int)num/10,ans);
        return ans;
    }
    // static String f(String b,"")
    // {
    //     if(x==0)
    //     {
    //         temp = temp+b.charAt(x);
    //     return temp;
    //     }
    //     temp = temp+b.charAt(x);
    //     return f(b,x-1,temp);
    // }
//    1234    1234/10 = 123   4 
// 123/10 = 12                          
//12/10 = 1
//1/10 = 0     
// 123 



}