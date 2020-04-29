import util.TreeNode;

public class Question101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return sym(root.left,root.right);
    }
    public boolean sym(TreeNode p , TreeNode q){
        if(q == null && p == null){
            return true;
        }
        if(q != null && p == null){
            return false;
        }
        if(q == null && p != null){
            return false;
        }
        return (p.val == q.val) && (sym(p.left, q.right)) && (sym(p.right, q.left));
    }
}
