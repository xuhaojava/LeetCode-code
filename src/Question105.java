import util.TreeNode;

import java.util.Arrays;

public class Question105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
        TreeNode node = new TreeNode(preorder[0]);
        for(int i = 0;i<inorder.length;i++){
            if(inorder[i]==node.val){
                node.left=buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
                node.right=buildTree(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
            }
        }
        return node;
    }
}
