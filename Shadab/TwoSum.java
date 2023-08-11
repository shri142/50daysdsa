import java.io.*;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> hash = new HashMap<>();
        // int result[] = new int[2];
        for(int i=0;i<nums.length;i++) {
            int currentNumber = nums[i];
            int secondNumber = target - currentNumber;
            if(hash.containsKey(secondNumber)) {
                // result[0] = hash.get(secondNumber);
                // result[1] = i;
                // return result;
                return new int[]{hash.get(secondNumber),i};
            }
            hash.put(currentNumber,i);
        }
        return new int[]{};
	}

	public static void main(String args[]) {
		int arr[] = {3,5,4};
		int res[] = twoSum(arr,6);
		if (res.length == 2)
			System.out.println(res[0] + " " + res[1]);
		else 
			System.out.println("Target not found!");
	}
}

// class TwoSum {
// 	public static void main(String args[]) {
// 		TwoSumDemo ob = new TwoSumDemo();
// 		int arr[] = {3,2,4};
// 		int res[] = ob.twoSum(arr,6);
// 		if (res.length == 2)
// 			System.out.println(res[0] + " " + res[1]);
// 		else 
// 			System.out.println("Target not found!");
// 	}
// }