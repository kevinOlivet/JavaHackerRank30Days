import java.util.*;

public class Day16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            int convertedInt = Integer.parseInt(S);
            System.out.println(convertedInt);
        }
        catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
