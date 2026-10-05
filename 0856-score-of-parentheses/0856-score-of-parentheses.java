class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int depth = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++;
            } else {
                depth--;
                if (s.charAt(i - 1) == '(') {
                    score += 1 << depth;
                }
            }
        }
        return score;
    }
}

// class Solution {
//     public int scoreOfParentheses(String s) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(0);

//         for (char ch : s.toCharArray()) {
//             if (ch == '(') {
//                 stack.push(0);
//             } else {
//                 int inside = stack.pop();

//                 if (inside == 0) {
//                     stack.push(stack.pop() + 1);
//                 } else {
//                     stack.push(stack.pop() + 2 * inside);
//                 }
//             }
//         }

//         return stack.pop();
//     }
// }