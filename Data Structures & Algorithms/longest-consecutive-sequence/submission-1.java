class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int len=nums.length;
        int max=1;
        int gmax=1;
        int num = nums[0];
        for(int i=0;i<len;i++){
            if(nums[i] == num + 1){
                max++;
            }
            else if(nums[i] == num) {
                continue;
            }
            else{
                max=1;
            }
            gmax=Math.max(gmax,max);
            num=nums[i];
        }
        return gmax;
    }
}
