package BinaryTree;
import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderPreOrderPostOrderTraversal {
    static class Pair{
        Node node;
        int val;
        Pair(Node node,int val){
            this.node=node;
            this.val=val;
        }
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
        traversal(tree.root);
    }
    public static void traversal(Node root){
        if(root==null){
            return;
        }
        List<Integer> preOrder=new ArrayList<>();
        List<Integer> inOrder=new ArrayList<>();
        List<Integer> postOrder=new ArrayList<>();
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(root,1));
        while (!st.isEmpty()){
            Pair pair=st.pop();
            if(pair.val==1){
                preOrder.add(pair.node.value);
                st.push(new Pair(pair.node,2));
                if(pair.node.left!=null){
                    st.push(new Pair(pair.node.left,1));
                }
            }else if(pair.val==2){
                inOrder.add(pair.node.value);
                st.push(new Pair(pair.node,3));
                if(pair.node.right!=null){
                    st.push(new Pair(pair.node.right,1));
                }
            }else{
                postOrder.add(pair.node.value);
            }
        }
        System.out.println("preOrder:"+preOrder);
        System.out.println("InOrder:"+inOrder);
        System.out.println("postOrder:"+postOrder);
    }
}
