import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Question226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode tree = queue.remove();
            TreeNode tem = tree.left;
            tree.left = tree.right;
            tree.right = tem;
            if(tree.right != null){
                queue.add(tree.right);
            }
            if(tree.left != null){
                queue.add(tree.left);
            }


        }
        return root;
    }
}
