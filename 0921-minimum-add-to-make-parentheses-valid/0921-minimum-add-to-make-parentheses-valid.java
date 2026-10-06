class Solution {
    public int minAddToMakeValid(String s) {
        // int opCount = 0;
        // for(Character ch : s.toCharArray()) if(ch == '(') opCount++;                             : WA
        // return Math.abs(opCount - (s.length()-opCount));

        int useless=0;
        Deque<Character> stack = new ArrayDeque<>();
        for(Character ch : s.toCharArray()){
            if(ch=='(') stack.push(ch);
            else if(ch==')' && stack.size()!=0) stack.poll();
            else if(ch==')' && stack.size()==0) useless++;
        }
    return stack.size() + useless;
    }
}