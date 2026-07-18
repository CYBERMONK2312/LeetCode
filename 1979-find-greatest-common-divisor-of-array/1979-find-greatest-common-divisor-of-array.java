class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int num : nums){
            min = num < min ? num : min;
            max = num > max ? num : max;
        }
        return gcd(min, max);
    }

    private int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    
}