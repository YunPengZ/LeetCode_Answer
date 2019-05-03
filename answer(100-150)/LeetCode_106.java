package leetcode.from103;

public class LeetCode_106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = postorder.length;
        return helper(0,len-1,inorder,0,len-1,postorder);
    }

    private TreeNode helper(int instart,int inend, int[] inorder,int poststart,int postend, int[] postorder) {
        if(poststart>postend||instart>inend)return null;
        TreeNode root = new TreeNode(postorder[postend]);
        int pos = instart;
        for(int i =instart;i<=inend;i++){
            if(inorder[i] == root.val){
                pos = i;break;
            }
        }
        int nextlen = pos-instart;
        root.left = helper(instart,pos-1,inorder,poststart,poststart+nextlen-1,postorder);
        root.right = helper(pos+1,inend,inorder,poststart+nextlen,postend-1,postorder);
        return root;
    }
}
