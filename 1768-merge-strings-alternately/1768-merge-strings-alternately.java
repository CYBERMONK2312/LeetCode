class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length(), w2 = word2.length();
        StringBuilder str = new StringBuilder();
        int i=0;
        while(i<w1 || i<w2){
            if(i<w1) str.append(word1.charAt(i));
            if(i<w2) str.append(word2.charAt(i));
            i++;
        }
        
        return str.toString();
    }
}