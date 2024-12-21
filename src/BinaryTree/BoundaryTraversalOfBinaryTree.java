package BinaryTree;
import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversalOfBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.display();
        System.out.println("Boundary Traversal:"+boundaryTraversal(tree.root));
    }
    public static List<Integer>  boundaryTraversal(Node root){
        List<Integer> ans=new ArrayList<>();
        addLeftBoundary(root,ans);
        addLeaf(root,ans);
        addRightBoundary(root,ans);
        return ans;
    }
    public static void addLeftBoundary(Node root,List<Integer> ans){
        Node curr=root;
        while (curr!=null){
            if(!isLeaf(curr)){
                ans.add(curr.value);
            }
            if(curr.left!=null){
                curr=curr.left;
            }else{
                curr=curr.right;
            }
        }
    }
    public  static void addRightBoundary(Node root,List<Integer> ans){
        Node curr=root.right;
        while (curr!=null){
            if(!isLeaf(curr)){
                ans.add(curr.value);
            }
            if(curr.right!=null){
                curr=curr.right;
            }else{
                curr=curr.left;
            }
        }
    }
    public  static void addLeaf(Node root, List<Integer> ans){
        if(root==null){
            return;
        }
        if(isLeaf(root)){
            ans.add(root.value);
        }
        if(root.left!=null){
            addLeaf(root.left,ans);
        }
        if(root.right!=null){
            addLeaf(root.right,ans);
        }
    }
    public static boolean isLeaf(Node root){
        return root.left==null && root.right==null;
    }
}
