import java.util.*;

class Day24Node {
    int data;
    Day24Node next;
    Day24Node(int d){
        data=d;
        next=null;
    }
}

class Day24 {

    public static Day24Node removeDuplicates(Day24Node head) {
        //Write your code here
        Day24Node current = head;

        while (current.next != null) {
            if (current.data != current.next.data) {
                current = current.next;
            } else {
                current.next = current.next.next;
            }
        }
        return head;
    }

    public static  Day24Node insert(Day24Node head,int data) {
        Day24Node p=new Day24Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else {
            Day24Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;
        }
        return head;
    }
    public static void display(Day24Node head) {
        Day24Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Day24Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
    }
}