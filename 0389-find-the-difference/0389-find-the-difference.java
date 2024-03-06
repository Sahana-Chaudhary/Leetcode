public class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']--;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                return (char) ('a' + i);
            }
        }

        return ' ';
    }

    public static void main(String[] args) {
        Solution solution = new Solution(); // Create an instance of the class
        String s1 = "abcd";
        String t1 = "abcde";
        System.out.println("Output 1: " + solution.findTheDifference(s1, t1)); // Output: e

        String s2 = "";
        String t2 = "y";
        System.out.println("Output 2: " + solution.findTheDifference(s2, t2)); // Output: y
        System.out.println("21BCS3246_Sahana");
    }
}
