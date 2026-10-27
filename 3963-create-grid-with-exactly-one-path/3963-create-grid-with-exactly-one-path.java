class Solution {
    public String[] createGrid(int m, int n) {
        String[] strArr = new String[m];
        
        if (m == 1 || n == 1) {
            for (int i = 0; i < m; i++) {
                StringBuilder str = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    str.append('.');
                }
                strArr[i] = str.toString();
            }
            return strArr;
        }
        
        for (int i = 0; i < m; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (i >= n - 1) {
                    if (j == n - 1) {
                        str.append('.');
                    } else {
                        str.append('#');
                    }
                } else if (i >= m - 1) {
                    if (j >= i) {
                        str.append('.');
                    } else {
                        str.append('#');
                    }
                } else {
                    if (j == i || j == i + 1) {
                        str.append('.');
                    } else {
                        str.append('#');
                    }
                }
            }
            strArr[i] = str.toString();
        }
        
        return strArr;
    }
}