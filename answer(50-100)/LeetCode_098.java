package fudan.edu.cn.answer;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LeetCode_098 {
    //中序遍历 记录前一个节点
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pre = null;
        while(!stack.isEmpty()||root!=null){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(pre!=null&&pre.val>=root.val)return false;
            pre = root;
            root = root.right;
        }
        return true;
    }
}
