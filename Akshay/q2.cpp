#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int maxSubarraySum(const vector<int>& nums) {
    int maxEndingHere = nums[0]; 
    int maxSoFar = nums[0];      

    for (int i = 1; i < nums.size(); ++i) {
        maxEndingHere = max(nums[i], maxEndingHere + nums[i]);
        maxSoFar = max(maxSoFar, maxEndingHere);
    }

    return maxSoFar;
}

int main() {
    vector<int> nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; 
    int result = maxSubarraySum(nums);
    
    cout << "Maximum subarray sum: " << result << endl;

    return 0;
}
