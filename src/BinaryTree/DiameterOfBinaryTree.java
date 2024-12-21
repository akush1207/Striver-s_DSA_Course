package BinaryTree;
public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        System.out.println("Diameter:"+diameter(tree.root));
    }
    static int ans=0;
    public static int diameter(Node root){
        helper(root);
        return ans;
    }
    public static int helper(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=helper(root.left);
        int rightHeight=helper(root.right);
        ans=Math.max(ans,leftHeight+rightHeight);
        return Math.max(leftHeight,rightHeight)+1;
    }
}
