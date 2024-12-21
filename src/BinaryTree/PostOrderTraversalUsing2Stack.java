package BinaryTree;
import java.util.Stack;

public class PostOrderTraversalUsing2Stack {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        System.out.print("Binary Tree:");
        postOrder(tree.root);
    }
    public static void postOrder(Node root){
        Stack<Node> st=new Stack<>();
        Stack<Integer> ans=new Stack<>();
        if(root==null){
            return;
        }
        st.push(root);
        while (!st.isEmpty()){
            Node curr=st.pop();
            ans.add(curr.value);
            if(curr.left!=null){
                st.push(curr.left);
            }
            if(curr.right!=null){
                st.push(curr.right);
            }
        }
        while (!ans.isEmpty()){
            System.out.print(ans.pop()+" ");
        }
    }
}
