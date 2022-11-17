fun main() {
    print(isPalindrome(Int.MAX_VALUE))
}

fun isPalindrome(x: Int): Boolean {
    if (x == 0) return true
    if (x < 0 || x % 10 == 0) return false
    var temp = x
    var reversed = 0
    while (temp > reversed) {
        reversed = reversed * 10 + temp % 10
        temp /= 10
    }
    return temp == reversed || temp == reversed / 10
}