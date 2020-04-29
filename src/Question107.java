import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        if(root == null){
            return list;
        }
        List<Integer> list1 = new ArrayList();
        TreeNode node = null;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        int now = 1;
        int next = 0;
        while(!queue.isEmpty()){
            node = (TreeNode)queue.remove();
            now--;
            list1.add(node.val);
            if(node.left != null){
                queue.add(node.left);
                next++;
            }
            if(node.right != null){
                queue.add(node.right);
                next++;
            }
            if(now == 0){
                list.add(new ArrayList<Integer>(list1));
                list1.clear();
                now = next;
                next = 0;
            }
        }


        List<List<Integer>> endlist = new ArrayList();
        for(int i = list.size()-1;i>=0;i--){
            endlist.add(list.get(i));
        }
        return endlist;
    }
}
