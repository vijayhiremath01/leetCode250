import java.util.* ;

class TreeNode {

    int val ;
    TreeNode left ;
    TreeNode right ;

    TreeNode(int val){
        this.val = val ;
    }
}
public class Basics {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(5);
        root.left.left = new TreeNode(4);

        System.out.println(root.left.val);
    }

}
