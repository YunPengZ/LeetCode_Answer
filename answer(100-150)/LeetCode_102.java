package fudan.edu.cn.answer;

import javax.management.QueryEval;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int lastEnd = 1;

        while(!queue.isEmpty()){
            List<Integer> res = new ArrayList<>();
            int count = lastEnd;
            lastEnd = 0;
            while(count-->0&&!queue.isEmpty()){
                root = queue.remove();
                if(root!=null){
                    res.add(root.val);
                    queue.add(root.left);
                    queue.add(root.right);
                    lastEnd+=2;
                }
            }
            if(!res.isEmpty()) list.add(res);

        }
        return list;
    }
}
