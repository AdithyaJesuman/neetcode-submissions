class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int max=numbers.length-1;
        int min=0;
        while(min<max){
            if(numbers[min]+numbers[max]==target){
                return new int[]{min+1,max+1};
            }
            if(numbers[min]+numbers[max]<target){
                min++;
            }
            if(numbers[min]+numbers[max]>target){
                max--;
            }
        }
        return new int[]{0};
    }
}
