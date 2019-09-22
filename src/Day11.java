import java.util.*;

//https://www.hackerrank.com/challenges/30-2d-arrays/problem
//Sample Input
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0
//
//Sample Output
//        19

public class Day11 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int greatestSum = -64;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int firstRowSum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                int secondRowSum = arr[i+1][j+1];
                int thirdRowSum = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                int totalSum = firstRowSum + secondRowSum + thirdRowSum;
                if (totalSum > greatestSum) {
                    greatestSum = totalSum;
                }
            }
        }

        System.out.println(greatestSum);
        scanner.close();
    }
}

