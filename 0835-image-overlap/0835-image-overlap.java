// For a 1 at position (r1, c1) in img1 to overlap with a 1 at (r2, c2) in img2, the required translation is:
// (r2 - r1, c2 - c1)
// If the same translation occurs for multiple pairs of 1s, those cells overlap after applying that shift.
// So, we count how many times each coordinate difference occurs using a HashMap. The maximum frequency is the largest overlap.


class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        ArrayList<int[]> pos1 = new ArrayList<>();
        ArrayList<int[]> pos2 = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(img1[i][j] == 1){
                    pos1.add(new int[]{i, j});
                }
                if(img2[i][j] == 1){
                    pos2.add(new int[]{i, j});
                }
            }
        }

        int count = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for(int[] p1 :  pos1){
            for(int[] p2 : pos2){
                int row = p2[0] - p1[0];
                int col = p2[1] - p1[1];

                String d = row + "," + col;
                map.put(d, map.getOrDefault(d, 0) + 1);

                count = Math.max(count, map.get(d));
            }
        }
        return count;
    }
}