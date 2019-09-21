import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int numberOfSwaps = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    numberOfSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        int firstElement = a[0];
        System.out.println("First Element: " + firstElement);
        int lastElement = a[a.length-1];
        System.out.println("Last Element: " + lastElement);
    }
}