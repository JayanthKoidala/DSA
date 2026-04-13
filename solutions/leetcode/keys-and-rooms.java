// Problem  : Keys and Rooms
// Difficulty: Medium
// Tags     : Depth-First Search, Breadth-First Search, Graph Theory
// URL      : https://leetcode.com/problems/keys-and-rooms/
// Solved on: 2026-04-13 19:19
// ──────────────────────────────────────────────────

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int numberOfRooms = rooms.size();
        boolean[] visited = new boolean[numberOfRooms];
        dfs(rooms,0,visited);

        for(boolean visit : visited){
            if(!visit) return false;
        }
        return true;
    }

    public void dfs(List<List<Integer>> rooms,int currRoom, boolean[] visited){
        visited[currRoom] = true;

        for(int room : rooms.get(currRoom)){
            if(!visited[room]){
                dfs(rooms,room,visited);
            }
        }

    }
}
