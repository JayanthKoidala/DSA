// Problem  : As Far from Land as Possible
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Breadth-First Search, Matrix
// URL      : https://leetcode.com/problems/as-far-from-land-as-possible/
// Solved on: 2026-04-14 22:25
// ──────────────────────────────────────────────────

class Solution {
    public int maxDistance(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int water = 0;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j] == 1){
                    q.add(new int[]{i,j,0});
                    visited[i][j] = true;
                }else{
                    water++;
                }
            }
        }

        if(q.isEmpty() || water ==0 ) return -1;

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int maxDistance = 0;

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0], col = curr[1];
            maxDistance = curr[2];

            for(int[] dir: directions){
                int nr = row + dir[0];
                int nc = col + dir[1];

                if(nr >=0 && nr <m && nc >=0 && nc <n && !visited[nr][nc]){
                    if(grid[nr][nc] == 0){
                        q.add(new int[]{nr,nc,maxDistance+1});
                        visited[nr][nc] = true;
                    }
                }
            }
        }

        return maxDistance;
    }
}
