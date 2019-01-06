
public class LeetCode_011 {
	public int maxArea(int[] height) {//two pointer，每次移动短的pointer
		int left= 0,right = height.length-1;
		int maxContainer = 0;
		int tmpContainer = 0;
		while(left<right) {
			tmpContainer = (right-left)*Math.min(height[left], height[right]);
			maxContainer = Math.max(tmpContainer,maxContainer);
			if(height[left]<height[right])left++;
			else right--;
		}
        return maxContainer;
    }
}
