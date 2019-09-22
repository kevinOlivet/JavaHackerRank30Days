import java.util.*;

//https://www.hackerrank.com/challenges/30-linked-list/problem
//Sample Input
//        4
//        2
//        3
//        4
//        1
//
//Sample Output
//        2 3 4 1

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15 {

    public static  Node insert(Node head,int data) {
    //Complete this method
        if (head == null) {
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}