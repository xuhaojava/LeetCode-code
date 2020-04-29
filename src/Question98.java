import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Question98 {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList();
        help(root,list);
        for(int i = 1;i<list.size();i++){
            if(list.get(i-1)>=list.get(i)){
                return false;
            }
        }
        return true;
    }
    public List<Integer> help(TreeNode root,List<Integer> list){
        if(root != null){
            if(root.left != null){
                help(root.left,list);
            }
            list.add(root.val);
            if(root.right != null){
                help(root.right,list);
            }
        }
        return list;
    }
}
