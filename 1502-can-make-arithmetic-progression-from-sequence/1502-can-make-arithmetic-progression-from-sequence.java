class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Boolean flag = true;
        int len = arr.length;
        Arrays.sort(arr);
        int diff = arr[0]-arr[1];
        for(int i =0;i<len-1;i++){
            if((arr[i]-arr[i+1]) != diff){
                flag = false;
                break;
            }

            // else flag = true;
        }

        return flag;
    }
}