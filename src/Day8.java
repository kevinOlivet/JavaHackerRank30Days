//Complete this code or write your own from scratch
import java.util.*;

//https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
//Sample Input
//        3
//        sam 99912222
//        tom 11122222
//        harry 12299933
//        sam
//        edward
//        harry
//
//Sample Output
//        sam=99912222
//        Not found
//        harry=12299933

class Day8 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String,String> phoneBook = new HashMap<String,String>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name,String.valueOf(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phoneBook.containsKey(s)) {
                String number = phoneBook.get(s);
                System.out.println(s + "=" + number);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}