import java.io.*;

class Solution {
	int maxSubarray(int nums[]) {
		int currentMax = nums[0];
		int result = nums[0];
		for(int i=1;i<nums.length;i++) {
			currentMax = Math.max(currentMax + nums[i], nums[i]);
			result = Math.max(currentMax,result);
		}
		return result;
	}
}

class MaximumSubarray {
	public static void main(String args[]) {
		Solution s = new Solution();
		int nums[] = {5,4,-1,7,8};
		int res = s.maxSubarray(nums);
		System.out.println(res);
	}
}