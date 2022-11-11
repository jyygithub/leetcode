> [https://leetcode.cn/problems/two-sum](https://leetcode.cn/problems/two-sum)

**Description**
```text
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
```

**Example 1:**
```text
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```
**Example 2:**
```text
Input: nums = [3,2,4], target = 6
Output: [1,2]
```
**Example 3:**
```text
Input: nums = [3,3], target = 6
Output: [0,1]
```

**Solution**
```kotlin
class Solution {

    public int[] twoSum(int[] nums, int target) {
        for (int x = 0; x < nums.length; x++) {
            for (int y = x + 1; y < nums.length; y++) {
                if (nums[x] == target - nums[y]) {
                    return new int[]{x, y};
                }
            }
        }
        throw new IllegalArgumentException("There is no result!");
    }

}
```