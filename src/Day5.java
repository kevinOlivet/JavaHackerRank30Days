import java.util.*;

//https://www.hackerrank.com/challenges/30-loops/problem
//Sample Input
//        2
//
//Sample Output
//        2 x 1 = 2
//        2 x 2 = 4
//        2 x 3 = 6
//        2 x 4 = 8
//        2 x 5 = 10
//        2 x 6 = 12
//        2 x 7 = 14
//        2 x 8 = 16
//        2 x 9 = 18
//        2 x 10 = 20

public class Day5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i < 11; i++) {
            int result;
            result = i * n;
            String stringToPrint = n + " x " + i + " = " + result;
            System.out.println(stringToPrint);
        }
        scanner.close();
    }
}
