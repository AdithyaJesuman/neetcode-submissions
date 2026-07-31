class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] arr= new int[nums.length-k+1];
        int c1=0;
        for(int i =0;i<nums.length-k+1;i++){
            int max=nums[i];
            for(int j=i+1;j<i+k;j++){
                max=Math.max(max,nums[j]);
            }
            arr[c1]=max;
            c1++;
        }
        return arr;
    }
}
