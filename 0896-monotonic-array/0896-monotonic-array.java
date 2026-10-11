class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1) return true;

        int mono = (nums[nums.length-1] - nums[0])<0 ? -1 : 1;
        if(mono == -1){
            for(int i=1; i<nums.length; i++){
                if((nums[i]-nums[i-1])>0){
                    return false;
                }
            }
        }
        else if( mono == 1){
            for(int i=1; i<nums.length; i++){
                if((nums[i]-nums[i-1])<0){
                    return false;
                }
            }
        }
        return true;
    }
}