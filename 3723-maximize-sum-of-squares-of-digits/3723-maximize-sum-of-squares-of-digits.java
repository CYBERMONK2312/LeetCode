class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int val = sum/9;
        int mod = sum%9;
        if(val > num || (val == num && mod!=0)) return "";
        StringBuilder sb = new StringBuilder();
        while(sum > 0){
            if(sum/9 > 0){
                sum-=9;
                sb.append('9');
            }
            else if(sum/9==0 && sum%9>0){
                sb.append(mod);
                sum-=mod;
            }
            num--;
        }
        while(num > 0){
            sb.append('0');
            num--;
        }
        return sb.toString();
    }
}