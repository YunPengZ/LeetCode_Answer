package packag.start.from081;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_089 {
	public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        //��1<<n��ʾ2^n;Integerʵ���˽�ָ����ʽ����ת��Ϊ���ֵĲ���
        for(int i = 0;i<1<<n;i++) {
        	result.add(i^i/2);
        }
        return result;
    }
}
