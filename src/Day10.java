import java.util.*;

public class Day10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        char [] binaryRepArray = new String(Integer.toBinaryString(n)).toCharArray();

        int maxNumberOfOccurances = 0;
        int numberOfOccurances = 0;

        for (int i = 0; i < binaryRepArray.length; i++ ) {
            if (binaryRepArray[i] == '1') {
                numberOfOccurances++;
                if (numberOfOccurances > maxNumberOfOccurances) {
                    maxNumberOfOccurances = numberOfOccurances;
                }
            } else {
                numberOfOccurances = 0;
            }
        }

        System.out.println(maxNumberOfOccurances);
        scanner.close();
    }
}

