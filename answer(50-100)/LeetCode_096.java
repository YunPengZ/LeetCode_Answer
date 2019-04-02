package fudan.edu.cn.answer;

public class LeetCode_096 {
    public int numTrees(int n) {
        int[] memset = new int[n+1];
        memset[0] = 1;
        memset[1] = 1;
        return generate(n,memset) ;

    }
    //BST个数只与长度有关
    private int generate(int len,int[] memset) {
        if(memset[len]!=0)return memset[len];
        int res = 0;
        for(int i = 1;i<=len;i++){
            memset[i-1] = generate(i-1,memset);
            memset[len-i] = generate(len-i,memset);
            res+= memset[i-1]*memset[len-i];

        }
        return res;
    }
}
