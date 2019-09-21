import java.util.*;

class Day23Node{
    Day23Node left,right;
    int data;
    Day23Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Day23 {

    static void levelOrder(Day23Node root){
        //Write your code here
        LinkedList<Day23Node> nodeQueue = new LinkedList<Day23Node>();
        if (root != null) {
            // enqueue current root
            nodeQueue.add(root);

            // while there are nodes to process
            while (!nodeQueue.isEmpty()) {
                // dequeue next node
                Day23Node tree = nodeQueue.removeFirst();

                // process trees root
                System.out.print(tree.data + " ");

                // enqueue child elements from next level in order
                if (tree.left != null) {
                    nodeQueue.add(tree.left);
                }

                if (tree.right != null) {
                    nodeQueue.add(tree.right);
                }
            }
        }
    }

    public static Day23Node insert(Day23Node root,int data){
        if(root==null){
            return new Day23Node(data);
        }
        else{
            Day23Node cur;
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
        Day23Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}