package BinaryTree;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversalUsing1Stack {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        System.out.println("Binary Tree:"+postOrder(tree.root));
    }
    public static List<Integer> postOrder(Node root){
        Stack<Node> st=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        Node curr=root,lastVisited=null;
        while (curr!=null || !st.isEmpty()){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }else{
                Node peekNode=st.peek();
                if(peekNode.right!=null && peekNode.right!=lastVisited){
                    curr=peekNode.right;
                }else{
                    lastVisited=peekNode;
                    st.pop();
                    ans.add(lastVisited.value);
                }
            }
        }
        return ans;
    }
}
