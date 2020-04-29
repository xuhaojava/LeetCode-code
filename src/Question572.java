import util.TreeNode;

public class Question572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null){
            return false;
        }
        if(s.val == t.val){
            return isequal(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);

    }

    public boolean isequal(TreeNode s,TreeNode t){
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null){
            return false;
        }
        if(s.val == t.val){
            return isequal(s.left,t.left) && isequal(s.right,t.right);
        }
        return false;
    }
}
