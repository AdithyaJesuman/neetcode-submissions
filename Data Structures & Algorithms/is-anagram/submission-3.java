class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(map1.containsKey(a)){
                map1.put(a,map1.get(a)+1);
            }
            else{
                map1.put(a,1);
            }

            if(map2.containsKey(b)){
                map2.put(b,map2.get(b)+1);
            }
            else{
                map2.put(b,1);
            }

        }
        if (map1.equals( map2))
            return true;
        else{
            return false;
        }
    }
}
