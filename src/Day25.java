import java.io.*;
import java.util.*;

public class Day25 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-->0) {
            int numberInQuestion = scan.nextInt();
            String result = "Prime";
            if (numberInQuestion == 0 || numberInQuestion == 1) {
                result = "Not prime";
            } else {
                for (int i = 2; i <= numberInQuestion/2; i++) {
                    if (numberInQuestion % i == 0) {
                        result = "Not prime";
                        break;
                    }
                }
            }
            System.out.println(result);
        }
    }
}

