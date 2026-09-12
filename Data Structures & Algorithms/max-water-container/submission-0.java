class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int l1=0;
        int r1=0;
        int capacity=0;
        int max=0;
        while(left<right){
            if(heights[left]>l1){
                l1=heights[left];
            }
            if(heights[right]>r1){
                r1=heights[right];
            }
            capacity=Math.min(l1,r1)*(right-left);
            max=Math.max(max,capacity);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
