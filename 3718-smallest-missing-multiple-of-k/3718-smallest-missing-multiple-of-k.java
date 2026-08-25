class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int res = -1,multiple = k;
        while(true){
            if(!set.contains(multiple)){
                res = multiple;
                break;
            }
            else{
                multiple += k;
                System.out.println(multiple);              
            }
       }
       return res;
    }
}