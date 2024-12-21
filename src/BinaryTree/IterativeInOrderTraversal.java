package BinaryTree;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInOrderTraversal {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        System.out.println("In Order:"+inOrder(tree.root));
    }
    public static List<Integer> inOrder(Node root){
        Stack<Node> st=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Node curr=root;
        while (curr!=null || !st.isEmpty()){
            while (curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            ans.add(curr.value);
            curr=curr.right;
        }
        return ans;
    }
}
