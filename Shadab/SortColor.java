import java.io.*;

class Solution {
	void sortColors(int nums[]) {
		nt i=0;
		int j=0;
		int n = nums.length - 1;
		while(j <= n) {
			if(nums[j] < 1) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				i++;
				j++; 
			} else if(nums[j] > 1) {
				int temp = nums[n];
				nums[n] = nums[j];
				nums[j] = temp;
				n--;
			} else {
				j++;
			}
		}
	}
}

class SortColor {
	public static void main(String args[]) {
		int nums[] = {2,0,2,1,1,0};
		Solution s = new Solution();
		s.sortColors(nums);

		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]+ " ");
		}
	}
}