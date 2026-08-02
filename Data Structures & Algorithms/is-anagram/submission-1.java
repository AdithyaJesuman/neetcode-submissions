class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer>map1=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i =0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
            if(map1.containsKey(ch1)){
                map1.put(ch1,map1.get(ch1)+1);
            }
            else{
                map1.put(ch1,1);
            }
        }
        if(map1.equals(map)){
            return true;
        }
        return false;
    }
}
