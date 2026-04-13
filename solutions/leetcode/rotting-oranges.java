// Problem  : Rotting Oranges
// Difficulty: Medium
// Tags     : Array, Breadth-First Search, Matrix
// URL      : https://leetcode.com/problems/rotting-oranges/
// Solved on: 2026-04-13 19:19
// ──────────────────────────────────────────────────

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int []> q = new LinkedList<>();
        int fresh = 0;

        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j,0});
                }

                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        if(q.isEmpty() && fresh!=0) return -1;

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int time =0;
        while(!q.isEmpty()){
            int[] arr = q.poll();
            int x = arr[0] ,y = arr[1];
            time = arr[2];

            for(int[] dir : directions){
                int nr = x + dir[0];
                int nc = y + dir[1];

                if(nr >=0 && nr < m && nc >=0 && nc < n && grid[nr][nc] == 1){
                    grid[nr][nc] = 2;
                    fresh--;
                    q.offer(new int[]{nr,nc,time+1});
                }
            }
        }

        return  fresh == 0 ? time : -1;
    }
}
