import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Question113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList();
        find(root,sum,list,new ArrayList<Integer>());
        return list;
    }

    public void find(TreeNode root,int sum,List<List<Integer>> list,ArrayList<Integer> tem){
        if(root == null){
            return;
        }
        tem.add(root.val);
        sum -= root.val;
        if(root.left == null && root.right == null){
            if(sum == 0){
                list.add(tem);
                return;
            }
            return;
        }
        find(root.left,sum,list,new ArrayList<Integer>(tem));
        find(root.right,sum,list,new ArrayList<Integer>(tem));

    }
}
