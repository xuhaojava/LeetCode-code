import util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Question106 {
    Map<Integer,Integer> map = new HashMap();
    int []post;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i = 0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        post = postorder;
        TreeNode root = build(0,inorder.length-1,0,postorder.length-1);
        return root;
    }

    public TreeNode build(int instart,int inend,int postart,int poend){
        if(inend < instart || poend < postart){
            return null;
        }
        int val = post[poend];
        int index = map.get(val);
        TreeNode node = new TreeNode(val);
        node.left = build(instart,index-1,postart,postart+index-instart-1);
        node.right = build(index+1,inend,postart+index-instart,poend-1);
        return node;
    }
}
