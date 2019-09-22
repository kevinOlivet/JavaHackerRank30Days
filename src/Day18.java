import java.util.*;

//https://www.hackerrank.com/challenges/30-queues-stacks/problem
//Sample Input
//        racecar
//
//Sample Output
//        The word, racecar, is a palindrome.

public class Day18 {
    // Write your code here.
    Stack<Character> myStack = new Stack<Character>();
    LinkedList<Character> myQueue = new LinkedList<Character>();

    void pushCharacter(char pushMe) {
        myStack.push(pushMe);
    }

    void enqueueCharacter(char queueMe) {
        myQueue.add(queueMe);
    }

    char popCharacter() {
        return myStack.pop();
    }

    char dequeueCharacter() {
        return myQueue.removeFirst();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}