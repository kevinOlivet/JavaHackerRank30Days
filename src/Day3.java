import java.util.*;

//https://www.hackerrank.com/challenges/30-conditional-statements/problem
//Sample Input 0
//        3
//
//Sample Output 0
//        Weird
//
//Sample Input 1
//        24
//
//Sample Output 1
//        Not Weird

public class Day3 {

    static void isItWeird(int input) {
        if (input % 2 == 1) {
            System.out.println("Weird");
        } else if (input % 2 == 0 && input > 1 && input < 6) {
            System.out.println("Not Weird");
        } else if (input % 2 == 0 && input > 5 && input < 21) {
            System.out.println("Weird");
        } else if (input % 2 == 0 && input > 20) {
            System.out.println("Not Weird");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        isItWeird(N);

        scanner.close();
    }
}
