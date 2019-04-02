package fudan.edu.cn.answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_095 {
    public List<TreeNode> generateTrees(int n) {
        if(n==0)return new ArrayList<TreeNode>();
        return  generateTree(1,n);
    }

    private List<TreeNode> generateTree(int start, int end) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if(start>end){
            list.add(null);
            return list;
        }
        if(start==end){
            list.add(new TreeNode(start));
            return list;
        }
        for (int i = start; i <=end; i++) {
            List<TreeNode> left = generateTree(start,i-1);
            List<TreeNode> right = generateTree(i+1,end);
            for (TreeNode cell:left) {
                for (TreeNode node:right) {
                    TreeNode root = new TreeNode(i);
                    root.left = cell;
                    root.right = node;
                    list.add(root);
                }
            }
        }
        return list;
    }


}
