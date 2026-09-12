class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr =new int[nums.length*2];
        int k=0;
        for(int i =0;i<nums.length*2;i++){
            if(k==nums.length){
                k=0;
            }
            arr[i]=nums[k++];
        }
        return arr;
    }
}