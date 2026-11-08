class Solution {
    public int countServers(int[][] grid) {
        boolean[] row = new boolean[grid.length];
        boolean[] col = new boolean[grid[0].length];
        for(int i=0; i<grid.length; i++){
            int count = 0;
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1) count++;
            }
            if(count >= 2) row[i] = true;
            else row[i] = false;
        }

        for(int j = 0; j < grid[0].length; j++){
            int count = 0;
            for(int i = 0; i < grid.length; i++){
                if(grid[i][j] == 1) count++;
            }
            if(count >= 2) col[j] = true;
        }

        // for(int i=0; i<row.length; i++) System.out.print(row[i]);
        // System.out.print(" ");
        // for(int i=0; i<col.length; i++) System.out.print(col[i]);

        int res = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if((grid[i][j]==1) && (row[i] == true || col[j] == true))  res++;
            }
        }
        return res;
    }
}