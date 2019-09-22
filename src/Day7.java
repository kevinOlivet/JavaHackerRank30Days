import java.util.*;

//https://www.hackerrank.com/challenges/30-arrays/problem
//Sample Input
//        4
//        1 4 3 2
//
//Sample Output
//        2 3 4 1

public class Day7 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] arrReversed = new int[n];
        int currentIndex = n-1;

        for (int i = 0; i < n; i++) {
            arrReversed[i] = arr[currentIndex];
            currentIndex--;
            System.out.print(arrReversed[i] + " ");
        }

        scanner.close();
    }
}

