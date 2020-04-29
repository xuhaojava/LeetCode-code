import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//二叉树的前序遍历（根，左，右）

public class Question144 {
    //迭代方法，先将右节点入栈再将左节点入栈
    public List<Integer> PreorderIteration(TreeNode root) {
        List<Integer> list = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        if(root != null){
            stack.push(root);
        }
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
        return list;
    }
    //递归方法
    public List<Integer> preorderRecursion(TreeNode root) {
        List<Integer> list = new ArrayList();
        Preorder(root,list);
        return list;
    }
    public void Preorder(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        Preorder(root.left,list);
        Preorder(root.right,list);
    }
}

