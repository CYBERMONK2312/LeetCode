class Solution {
    public int smallestNumber(int n, int t) {
        if(digitProduct(n)%t==0) return n;
        else{
            while(digitProduct(n)%t!=0){
                n++;
            }
        }
        return n;
    }

    private static int digitProduct(int n){
        int product = 1;
        while(n>0){
            product *= n%10;
            n/=10;
        }
        return product;
    }
}