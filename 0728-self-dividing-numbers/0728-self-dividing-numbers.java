class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while(left <= right){
            if(isSelfDivisible(left)) list.add(left);
            left++;
        }
        return list;
        
    }

    private boolean isSelfDivisible(int num){
        int temp = num;
        boolean flag = false;
        if(num%10 == 0) return false;
        while(temp > 0){
            if(temp % 10 == 0){
                flag = false;
                break;
            }
            else if(num % (temp % 10) == 0) {
                flag = true;
                temp/= 10;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}