import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
//二叉树的后序遍历（左，右，根）

public class Question145 {
    //迭代方法
    //左右根 反过来是根右左，可以看做是前序遍历，stack中先入栈左节点，而出栈的节点值使用
    //LinkedList存储，LinkedList的push方法可以将值头插，这样自然逆序，由根右左变为左右根
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList();
        Stack<TreeNode> stack = new Stack();

        if(root != null){
            stack.push(root);
        }

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.push(node.val);
            if(node.left != null){
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }
        }

        return list;
    }

    //递归方法
    public List<Integer> postorderRecursion(TreeNode root) {
        List<Integer> list = new ArrayList();
        postorder(root,list);
        return list;
    }

    public void postorder(TreeNode root,List<Integer> list){
        if(root == null){
            return ;
        }
        postorder(root.left,list);
        postorder(root.right,list);
        list.add(root.val);
    }
}



