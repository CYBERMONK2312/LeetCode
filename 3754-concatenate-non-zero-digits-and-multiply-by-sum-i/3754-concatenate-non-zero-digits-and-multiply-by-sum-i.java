class Solution {
    public long sumAndMultiply(int n) {
        long result = 0, sum = 0;
        if(n == 0) return n;
        while(n>0){
            int temp = n%10;
            sum+=temp;
            if(temp != 0){
                result = result * 10 + temp;
                n/=10;
            }
            else n/= 10;
        }
        return reverseDigit(result) * sum;
    }

    private long reverseDigit(long n){
        long res = 0;
        while(n>0){
            long temp = n%10;
            res = res*10 + temp;
            n/=10;
        }
        return res;
    }
}