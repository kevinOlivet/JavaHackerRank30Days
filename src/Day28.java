import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/30-regex-patterns/problem
//Sample Input
//        6
//        riya riya@gmail.com
//        julia julia@julia.me
//        julia sjulia@gmail.com
//        julia julia@gmail.com
//        samantha samantha@gmail.com
//        tanya tanya@gmail.com
//
//Sample Output
//        julia
//        julia
//        riya
//        samantha
//        tanya

public class Day28 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<String> listOfNames = new ArrayList<String>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            String [] emailParts = emailID.split("@");

            if (emailParts[1].equals("gmail.com")) {
                listOfNames.add(firstName);
            }
        }

        Collections.sort(listOfNames);

        for (String name: listOfNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}
