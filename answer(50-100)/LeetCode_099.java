package fudan.edu.cn.answer;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class LeetCode_099 {
    //只有两个错误节点的时候只能是相邻的两个元素出错
    public void recoverTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pre = null;
        TreeNode firstElement = null;
        TreeNode secondElement = null;
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            //遍历
            root = stack.pop();
            if(pre!=null){
                if(firstElement==null&&pre.val>=root.val){
                    firstElement = pre;
                }
                if(firstElement!=null&&pre.val>=root.val){
                    secondElement = root;
                }
            }

            pre = root;
            root = root.right;
        }
        int tmp = secondElement.val;
        secondElement.val = firstElement.val;
        firstElement.val = tmp;
    }

}
