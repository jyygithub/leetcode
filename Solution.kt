class Solution {
    fun countAndSay(n: Int): String {
        var result = "1"
        for (i in 2..n) {
            val sb = StringBuilder()
            var start = 0
            var position = 0
            while (position < result.length) {
                while (position < result.length && result[position] == result[start]) position++
                sb.append(position - start).append(result[start])
                start = position
            }
            result = sb.toString()
        }
        return result
    }
}