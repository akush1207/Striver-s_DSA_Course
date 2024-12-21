package BinaryTree;
public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        System.out.println("Maximum Path Sum:"+maxPathSum(tree.root));
    }
    public static int maxPathSum(Node root){
        int[] sum=new int[1];
        helper(root,sum);
        return sum[0];
    }
    public static int helper(Node root,int[] sum){
        if(root==null){
            return 0;
        }
        int leftSum=Math.max(0,helper(root.left,sum));
        int rightSum=Math.max(0,helper(root.right,sum));
        sum[0]=Math.max(sum[0],leftSum+rightSum+root.value);
        return root.value+Math.max(leftSum,rightSum);
    }
}
