#include <iostream>
#include <vector>
#include <algorithm>

class Solution {
public:
    int maxSubArray(std::vector<int>& nums) {
        int resultMax = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.size(); i++) {
            if ((max + nums[i]) < nums[i]) {
                max = nums[i];
                resultMax = std::max(resultMax, max);
                continue;
            }
            max = max + nums[i];
            resultMax = std::max(resultMax, max);
        }

        return resultMax;
    }
};

int main() {
    Solution solution;
    std::vector<int> nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int maxSum = solution.maxSubArray(nums);
    std::cout << "The maximum subarray sum is: " << maxSum << std::endl;

    return 0;
}
