package packag.start.from035.end;

public class LeetCode_050 {
	public double myPow(double x, int n) {
        if(n==0||x==1.0)return 1;
        if(n==Integer.MIN_VALUE&&x!=-1)return 0.0;
        if(n<0) {
        	
        	n = -n;
        	x = 1/x;
        }
        return (n%2==0)?myPow(x*x,n/2):x*myPow(x*x, n/2);
    }
}
