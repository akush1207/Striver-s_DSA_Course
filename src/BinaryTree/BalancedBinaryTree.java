package BinaryTree;
public class BalancedBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.display();
        System.out.println("Is Balanced:"+isBalanced(tree.root));
    }
    public static boolean isBalanced(Node root){
        return helper(root)!=-1;
    }
    public static int helper(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=helper(root.left);
        if(leftHeight==-1){
            return -1;
        }
        int rightHeight=helper(root.right);
        if(rightHeight==-1){
            return -1;
        }
        if(Math.abs(rightHeight-leftHeight)>1){
            return -1;
        }
        return Math.max(leftHeight,rightHeight)+1;
    }
}
