class Solution {
    List<String> val = new ArrayList<>(); 
    public List<String> generateParenthesis(int n) { 
        StringBuilder cur = new StringBuilder();
        dfs(n, n, cur, val);
        return val;
    }
    private void dfs(int open, int close, StringBuilder cur, List<String> val) {
        if (open == 0 && close == 0) {
            val.add(cur.toString());
            return;
        }
        if (open > 0) {
            cur.append('(');
            dfs(open - 1, close, cur, val);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close > open) {
            cur.append(')');
            dfs(open, close - 1, cur, val);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}