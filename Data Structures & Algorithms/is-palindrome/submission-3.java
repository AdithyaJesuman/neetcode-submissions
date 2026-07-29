class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int max=s.length()-1;
        int min=0;
        while(min<max){
            if(s.charAt(min)!=s.charAt(max)){
                return false;
            }
            min++;
            max--;
        }
        return true;
    }
}
