class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = Math.abs(nums[i]); 
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        long maxSum = 0, minSum = 0;
        for(int i=0; i<nums.length/2 ; i++){
            minSum+= nums[i]*nums[i];
        }
        for(int i=nums.length/2; i<nums.length; i++){
            maxSum+= nums[i]*nums[i];
        }
        return maxSum - minSum;
    }
}