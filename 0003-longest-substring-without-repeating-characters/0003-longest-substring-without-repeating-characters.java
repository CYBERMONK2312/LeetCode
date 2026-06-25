class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        while(left < s.length() && right < s.length()){
            if(charSet.contains(s.charAt(right))){
                while(charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
            }
            else {
                charSet.add(s.charAt(right));
                right++;
            }
            int length = right - left;
            if(length > maxLength) maxLength = length;
        }

        return maxLength;
    }
}