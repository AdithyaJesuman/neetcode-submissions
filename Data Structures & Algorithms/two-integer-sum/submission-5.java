class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==2){
            return new int[]{0,1};
        }
        
        Map<Integer,Integer> map = new HashMap<>();
        map.put(Integer.MAX_VALUE,-1);
        for(int i=0;i<nums.length;i++){
            int t=target-nums[i];
            if(map.containsKey(t)){
                return new int[]{map.get(t),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,1};

    }
}
