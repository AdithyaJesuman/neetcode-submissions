class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i :nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        int k=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet() ){
            for (int i = 0; i < entry.getValue(); i++)
                nums[k++]=entry.getKey();
            }
        }
    }
