import java.util.*;

//https://www.hackerrank.com/challenges/30-review-loop/problem
//Sample Input
//        2
//        Hacker
//        Rank
//
//Sample Output
//        Hce akr
//        Rn ak

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numberOfCases = scan.nextInt();
        for (int i = 1; i <= numberOfCases; i++) {
            String word = scan.next();
            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 0)System.out.print(word.charAt(j));
            }
            System.out.print(" ");
            for (int j = 0; j < word.length(); j++) {
                if (j % 2 != 0)System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}


