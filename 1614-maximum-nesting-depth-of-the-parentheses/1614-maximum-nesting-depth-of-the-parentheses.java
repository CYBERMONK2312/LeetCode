class Solution {
    public int maxDepth(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int max = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') stack.push('(');
            max = Math.max(stack.size(), max);

            if(ch == ')') stack.pop();
        }
        return max;
    }
}