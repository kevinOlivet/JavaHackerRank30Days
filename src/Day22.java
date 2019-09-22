import java.util.*;

//https://www.hackerrank.com/challenges/30-binary-search-trees/problem
//Sample Input
//        7
//        3
//        5
//        2
//        1
//        4
//        6
//        7
//
//Sample Output
//        3

class Day22Node{
    Day22Node left,right;
    int data;
    Day22Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Day22 {

    public static int getHeight(Day22Node root){
        //Write your code here
        if (root != null) {
            if (getHeight(root.left) > getHeight(root.right)) {
                return 1 + getHeight(root.left);
            } else {
                return 1 + getHeight(root.right);
            }
        } else {
            return -1;
        }
    }

    public static Day22Node insert(Day22Node root,int data){
        if(root==null){
            return new Day22Node(data);
        }
        else{
            Day22Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Day22Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}