package packag.start.from081;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_089 {
	public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        //用1<<n表示2^n;Integer实现了将指数形式的数转化为数字的操作
        for(int i = 0;i<1<<n;i++) {
        	result.add(i^i/2);
        }
        return result;
    }
}
