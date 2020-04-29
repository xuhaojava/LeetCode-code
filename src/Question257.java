import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Question257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList();
        All(root,"",list);
        return list;
    }
    public void All(TreeNode root,String s,List<String> list){
        if(root != null){
            s += root.val;
            if(root.left == null && root.right == null){
                list.add(s);
            }else{
                s += "->";
                All(root.left,s,list);
                All(root.right,s,list);
            }
        }

    }
}
