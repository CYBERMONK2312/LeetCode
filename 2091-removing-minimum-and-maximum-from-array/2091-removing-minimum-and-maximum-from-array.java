class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxIndex = 0, minIndex = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }
        int maxIndexValue = Math.max(maxIndex, minIndex);
        int minIndexValue = Math.min(maxIndex, minIndex);
        if(maxIndex == minIndex) return 1;
        // return maxIndexValue >= nums.length/2 ? (minIndexValue+1)+(nums.length-maxIndexValue) : maxIndexValue+1;
        return Math.min((minIndexValue+1)+(nums.length-maxIndexValue) , Math.min(maxIndexValue+1, nums.length-minIndexValue));
    }
}