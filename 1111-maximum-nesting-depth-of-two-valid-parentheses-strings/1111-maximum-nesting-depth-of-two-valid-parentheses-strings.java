class Solution {
    public int[] maxDepthAfterSplit(String str) {
        int n = str.length();
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++)
            res[i] = (i ^ str.charAt(i)) & 1;
            
        return res;
    }
}