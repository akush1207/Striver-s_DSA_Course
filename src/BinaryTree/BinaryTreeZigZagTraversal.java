package BinaryTree;
import java.util.*;

public class BinaryTreeZigZagTraversal {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.display();
        System.out.println("Zig Zag Traversal:"+zigzagTraversal(tree.root));
    }
    public static List<List<Integer>> zigzagTraversal(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        List<List<Integer>> ans=new ArrayList<>();
        boolean leftToRight=true;
        while (!q.isEmpty()){
            int size=q.size();
            Integer[] level=new Integer[size];
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                int ind=leftToRight?i:(size-1-i);
                level[ind]=curr.value;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            leftToRight=!leftToRight;
            ans.add(Arrays.asList(level));
        }
        return ans;
    }

}
