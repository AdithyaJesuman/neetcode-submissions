class Solution {
    public boolean validPalindrome(String s) {
        return valid(s, 0, s.length() - 1, 1) == 1;
    }
    public int valid(String s, int left, int right, int c) {
        if (left >= right) {
            return 1;
        }

        if (s.charAt(left) == s.charAt(right)) {
            return valid(s, left + 1, right - 1, c);
        }

        if (c == 1) {
            return valid(s, left, right - 1, 0) == 1 || valid(s, left + 1, right, 0) == 1 ? 1 : 0;
        }
        return 0;
    }
}