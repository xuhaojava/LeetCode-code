import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//二叉树的层序遍历

public class Question102 {

    //将节点加入queue中，通过queue的长度来判断该层有多少节点
    //在将同一层的节点加入到list中时，同时将下一层的节点入队
    //这样在上一层全部出队之后下一层的所有节点正好全部入队
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        if(root == null){
            return output;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList();
            int length = queue.size();
            for(int i = 0;i<length;i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            output.add(list);
        }
        return output;
    }
}
