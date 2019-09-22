import java.io.*;
import java.util.*;

//https://www.hackerrank.com/challenges/30-interfaces/problem
//Sample Input
//        6
//
//Sample Output
//        I implemented: AdvancedArithmetic
//        12

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class Day19Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sumToReturn = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sumToReturn += i;
            }
        }
        return sumToReturn;
    }
}

class Day19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Day19Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}