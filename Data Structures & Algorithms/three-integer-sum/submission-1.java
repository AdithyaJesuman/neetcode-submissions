class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int min=i+1;
            int max=nums.length-1;
           
            while(min<max){
                int sum = nums[i]+nums[min]+nums[max];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i], nums[min], nums[max]));
                    min++;
                    max--;
                }
                else if(sum>0){
                    max--;
                }
                else{
                    min++;
                }
            }
        }
        ans = ans.stream().distinct().toList();     
        return ans;
    }
}
