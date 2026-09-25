class Solution {
    public int strStr(String haystack, String needle) {
//---------------------SOL-1-------------------------------//

        // int hey = haystack.length(), need = needle.length();
        // boolean flag = false;
        // if(haystack.contains(needle))
        // return haystack.indexOf(needle);
        // return -1;

//----------------------SOL-2------------------------------//
        int hey = haystack.length(), need = needle.length();
        boolean flag = false;
        for(int i=0; i<=hey-need; i++){
            for(int j=0;j<need;j++){
                if(haystack.charAt(i+j) == needle.charAt(j)){
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag == true) return i;
        }
    return -1;
    }
}