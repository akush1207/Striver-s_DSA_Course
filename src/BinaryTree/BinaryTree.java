package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;
    public void add(int value){
        Node toAdd=new Node(value);
        if(root==null){
            root=toAdd;
        }else{
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()){
                Node curr=q.poll();
                if(curr.left==null){
                    curr.left=toAdd;
                    break;
                }else{
                    q.add(curr.left);
                }
                if(curr.right==null){
                    curr.right=toAdd;
                    break;
                }else{
                    q.add(curr.right);
                }
            }
        }
    }
    public void display(){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        System.out.print("Binary Tree:");
        while (!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.value+" ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.display();
    }
}
