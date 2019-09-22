import java.util.*;

//https://www.hackerrank.com/challenges/30-scope/problem
//Sample Input
//        3
//        1 2 5
//
//Sample Output
//        4

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int [] inputArray) {
        this.elements = inputArray;
    }

    void computeDifference() {
        int maximumValue = 0;
        int minimumValue;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > maximumValue) {
                maximumValue = elements[i];
            }
        }
        minimumValue = maximumValue;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < minimumValue) {
                minimumValue = elements[i];
            }
        }
        maximumDifference = maximumValue - minimumValue;
    }
} // End of Difference class

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}