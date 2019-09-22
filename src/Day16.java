import java.util.*;

//https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
//Sample Input 0
//        3
//
//Sample Output 0
//        3
//
//Sample Input 1
//        za
//
//Sample Output 1
//        Bad String

public class Day16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            int convertedInt = Integer.parseInt(S);
            System.out.println(convertedInt);
        }
        catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
