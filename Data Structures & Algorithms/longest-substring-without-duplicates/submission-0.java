class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxlen=0;
        HashSet<Character> window = new HashSet<>();
        for(int right=0;right<s.length();right++){
            char curr = s.charAt(right);
            while(window.contains(curr)){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(curr);
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}