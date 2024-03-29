import java.util.*;

//https://www.hackerrank.com/challenges/30-operators/problem
//Sample Input
//        12.00
//        20
//        8
//
//Sample Output
//        15

public class Day2 {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * (tip_percent * .01);

        double tax = meal_cost * (tax_percent * .01);

        double totalAmount = meal_cost + tip + tax;
        int finalAmount = (int) Math.round(totalAmount);

        System.out.println(finalAmount);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
