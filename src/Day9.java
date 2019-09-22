import java.io.*;
import java.util.*;

//https://www.hackerrank.com/challenges/30-recursion/problem
//Sample Input
//        3
//
//Sample Output
//        6

public class Day9 {

    // Complete the factorial function below.
    static int factorial(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        }
        // Recursive case
        else {
            return n * factorial(n - 1);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        System.out.println(result);

//        // Ojo: BufferedWriter is needed to complete the challenge online but no locally
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//        bufferedWriter.close();

        scanner.close();
    }
}