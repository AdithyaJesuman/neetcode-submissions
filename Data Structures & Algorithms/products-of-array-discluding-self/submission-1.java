class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int ct=0;
        for(int i =0 ; i<nums.length ;i++){
            int left=1;
            int right=1;
            for(int j=0;j<i;j++){
                left*=nums[j];
            }
            for(int k=  i+1;k<nums.length;k++){
                right*=nums[k];
            }
            arr[ct]=left*right;
            ct++;
        }
        return arr;
    }
}  
