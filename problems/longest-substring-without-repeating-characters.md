> [https://leetcode.cn/problems/longest-substring-without-repeating-characters/](https://leetcode.cn/problems/longest-substring-without-repeating-characters/)

**Description**
```text
Given a string s, find the length of the longest substring without repeating characters.
```

**Example 1:**
```text
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```
**Example 2:**
```text
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```
**Example 3:**
```text
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

**Solution**
```kotlin
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        val map = HashMap<Char, Int>()
        var left = 0
        var result = 0
        for (i in s.indices) {
            if (map.containsKey(s[i])) {
                left = kotlin.math.max(left, map[s[i]]!! + 1)
            }
            map[s[i]] = i
            result = kotlin.math.max(result, i - left + 1)
        }
        return result
    }
}
```