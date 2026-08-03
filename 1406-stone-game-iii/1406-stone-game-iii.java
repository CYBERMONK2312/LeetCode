class Solution {
    public String stoneGameIII(int[] nums) {
        String BOB = "Bob";
        String ALICE = "Alice";
        String TIE = "Tie";
        int n = nums.length;
        int[] dp = new int[n+1];

        for(int i=n-1; i>=0; i--){
            int best = Integer.MIN_VALUE;
            int runningSum = 0;
            for(int k=1; k<=3; k++){
                if(i+k>n) break;
                runningSum += nums[i+k-1];
                best = Math.max(best, runningSum-dp[i+k]);
            }
            dp[i] = best;
        }

        if(dp[0]>0) return ALICE;
        else if(dp[0]<0) return BOB;
        else return TIE;
        

    }
}