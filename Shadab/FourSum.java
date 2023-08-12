import java.util.*;

class Solution {
	public List<List<Integer>> fourSum(int nums[], int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		int n = nums.length;

		if(n<4)
			return res;

		Arrays.sort(nums);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int currentSum = target - nums[i] - nums[j];
				int left = j + 1;
				int right = n - 1;

				while(left < right) {
					int difference = nums[left] + nums[right];
					if(difference == currentSum) {
						List<Integer> quad = new ArrayList<>();
						quad.add(nums[i]);
						quad.add(nums[j]);
						quad.add(nums[left]);
						quad.add(nums[right]);
						res.add(quad);

						while(left < right && nums[left] == quad.get(2)) ++left;
						while(left < right && nums[right] == quad.get(3)) --right;
					} else if(difference < currentSum) {
						left++;
					} else {
						right--;
					}
				}
				while (j + 1 < n && nums[j+1] == nums[j]) ++j;
			}
			while (i + 1 < n && nums[i+1] == nums[i]) ++i;
		}
		return res;
	}
}

class FourSum {
	public static void main(String args[]) {
		Solution s = new Solution();
		int arr[] = {1,0,-1,0,-2,2};
		int target = 0;
		List<List<Integer>> res = s.fourSum(arr,target);
		System.out.print(res);
	} 
}