class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int x:nums){
            if(map.containsKey(x))
                map.put(x,map.get(x)+1);
            else
                map.put(x,1);
            
        }
        for(int x:map.values()){
            if(x>1){
                return true;
            }
        }
        return false;
    }
}