package BinaryTree;
public class IsSameTree {
    public static void main(String[] args) {
        BinaryTree tree1=new BinaryTree();
        tree1.add(1);
        tree1.add(2);
        tree1.add(3);
        BinaryTree tree2=new BinaryTree();
        tree2.add(1);
        tree2.add(2);
        tree2.add(3);
        System.out.println("Is Same Tree:"+isSame(tree1.root,tree2.root));
    }
    public static boolean isSame(Node root1,Node root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null|| root2==null){
            return false;
        }
        return (root1.value==root2.value) && isSame(root1.left,root2.left) &&isSame(root1.right,root2.right);
    }
}
