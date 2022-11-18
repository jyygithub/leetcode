fun main() {
    print(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
}

fun maxArea(height: IntArray): Int {
    var area = 0
    var start = 0
    var end = height.size - 1
    while (start < end) {
        area = kotlin.math.max(kotlin.math.min(height[start], height[end]) * (end - start), area)
        if (height[start] > height[end]) end--
        else start++
    }
    return area
}
