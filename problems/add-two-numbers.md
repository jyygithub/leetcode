> [https://leetcode.cn/problems/add-two-numbers/](https://leetcode.cn/problems/add-two-numbers/)

**Description**
```text
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
```

**Example 1:**
![](https://assets.leetcode.com/uploads/2020/10/02/addtwonumber1.jpg)
```text
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
```
**Example 2:**
```text
Input: l1 = [0], l2 = [0]
Output: [0]
```
**Example 3:**
```text
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
```

**Solution**
```kotlin
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        return recursive(l1, l2, 0)
    }

    private fun recursive(l1: ListNode?, l2: ListNode?, index: Int): ListNode? {
        if (index == 0) return l1 ?: l2
        val result = (l1?.`val` ?: 0) + (l2?.`val` ?: 0) + index
        val node = ListNode(result % 10)
        node.next = recursive(l1?.next, l2?.next, result / 10)
        return node
    }
}
```