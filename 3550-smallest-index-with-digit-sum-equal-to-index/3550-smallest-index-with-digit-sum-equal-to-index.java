class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            System.out.print(digitCount(nums[i]));
            if(i==digitCount(nums[i])) return i;
        }
        return -1;
    }

    private static int digitCount(int num){
        int res = 0;
        while(num > 0){
            res+= num%10;
            num/=10;
        }
        return res;
    }
}