class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        Integer[] res = new Integer[queries.length];
        for (int i = 0; i < res.length; i++) res[i] = i;
        Arrays.sort(res, (a, b) -> Integer.compare(queries[a], queries[b]));

        int[] cnt = new int[n + 1], ans = new int[res.length];
        int l = 0, r = 0, active = 0;

        for (int i : res) {
            int t = queries[i];

            while (r < logs.length && logs[r][1] <= t)
                if (++cnt[logs[r++][0]] == 1) active++;

            while (l < r && logs[l][1] < t - x)
                if (--cnt[logs[l++][0]] == 0) active--;

            ans[i] = n - active;
        }

        return ans;
    }
}