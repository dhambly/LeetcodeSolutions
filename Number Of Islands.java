class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islands = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] != '0'){
                    dfs(grid,i,j);
                    islands++;
                }
            }
        }
        return islands;
    }
    
    public void dfs(char[][] grid, int x, int y){
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == ('0'))
            return;
        grid[x][y] = '0';
        dfs(grid,x-1,y);
        dfs(grid,x+1,y);
        dfs(grid,x,y-1);
        dfs(grid,x,y+1);
    }
}
