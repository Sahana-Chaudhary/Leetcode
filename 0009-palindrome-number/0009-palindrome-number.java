class Solution {
    public static boolean isPalindrome(int x) {
        
        if (x < 0) {
            return false;  // Negative numbers are not palindromes
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome(121));   // Output: true
        System.out.println(isPalindrome(-121));  // Output: false
    }
}