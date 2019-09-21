import java.util.*;

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