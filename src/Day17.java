import java.io.*;
import java.util.*;

//https://www.hackerrank.com/challenges/30-more-exceptions/problem
//Sample Input
//        4
//        3 5
//        2 4
//        -1 -2
//        -1 3
//
//Sample Output
//        243
//        16
//        n and p should be non-negative
//        n and p should be non-negative

//Write your code here
class NegativeException extends Exception {
    @Override
    public String getMessage() {
        String messageToReturn = "n and p should be non-negative";
        return messageToReturn;
    }
}

class Calculator extends NegativeException {

    int power(int n, int p) throws NegativeException {
        if (n >= 0 && p >= 0) {
            int totalToReturn = (int)Math.pow(n, p);
            return totalToReturn;
        } else {
            throw new NegativeException();
        }
    }
}

class Day17 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
