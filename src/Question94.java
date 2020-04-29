import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//二叉树的中序遍历（左，根，右）

public class Question94 {

    //迭代方法
    //一直循环直到没有左节点，然后依次出栈，之后判断每个节点有没有右节点，再重复寻找右节点的左节点
    public List<Integer> inorderIteration(TreeNode root) {
        List<Integer> list = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }

    //递归方法
    public List<Integer> inorderRecursion(TreeNode root) {
        List<Integer> list = new ArrayList();
        inorder(root,list);
        return list;
    }

    public void inorder(TreeNode root,List<Integer> list){
        if(root == null){
            return ;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }

}



