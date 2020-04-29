import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = null;
        queue.add(root);
        int now = 1;
        int next = 0;
        double tem = 0;
        double num = 0;
        while(!queue.isEmpty()){
            node = queue.remove();
            now--;
            tem += node.val;
            num++;
            if(node.left != null){
                queue.add(node.left);
                next++;
            }
            if(node.right != null){
                queue.add(node.right);
                next++;
            }
            if(now == 0){
                list.add(tem/num);
                now = next;
                next = 0;
                tem = 0;
                num = 0;
            }
        }
        return list;
    }
}
