package BinaryTree;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreOrderTraversal {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        System.out.print("Binary Tree:"+preOrder(tree.root));
    }
    public static List<Integer> preOrder(Node root){
        Stack<Node> st=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        st.push(root);
        while (!st.isEmpty()){
            Node curr=st.pop();
            ans.add(curr.value);
            if(curr.right!=null){
                st.push(curr.right);
            }
            if(curr.left!=null){
                st.push(curr.left);
            }
        }
        return ans;
    }
}
