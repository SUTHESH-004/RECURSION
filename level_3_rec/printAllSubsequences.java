package level_3_rec;

import java.util.*;

//time complexity O(2^n)	
// The function printsub is called recursively twice for each character in the input string, resulting in a time complexity of O(2^n), where n is the length of the input string.
public class printAllSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> list = new Stack<Character>();
        printsub(0, str, list);

        sc.close();

    }

    static void printsub(int index, String str, Stack<Character> List) {
        if (index >= str.length()) {
            System.out.println(List);
            return;
        }
        List.push(str.charAt(index));
        printsub(index + 1, str, List);
        List.pop();
        printsub(index + 1, str, List);
    }

}
