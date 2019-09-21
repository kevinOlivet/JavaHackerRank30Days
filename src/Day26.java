import java.io.*;
import java.util.*;

public class Day26 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int dayReturned = scan.nextInt();
        int monthReturned = scan.nextInt();
        int yearReturned = scan.nextInt();

        scan.nextLine();

        int dayDue = scan.nextInt();
        int monthDue = scan.nextInt();
        int yearDue = scan.nextInt();

        int fine = 0;

        if (yearReturned > yearDue) {
            fine = 10000;
        } else if (monthReturned > monthDue && (yearReturned >= yearDue)) {
            fine = 500 * (monthReturned - monthDue);
        } else if (dayReturned > dayDue && (monthReturned >= monthDue) && (yearReturned >= yearDue)) {
            fine = 15 * (dayReturned - dayDue);
        } else {
            fine = 0;
        }

        System.out.println(fine);
    }
}

