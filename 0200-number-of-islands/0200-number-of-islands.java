class Solution {
    private void solve(char[][] grid, int n, int m, int i, int j) {
        if (i == -1 || j == -1 || i == n || j == m || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        solve(grid, n, m, i, j - 1);
        solve(grid, n, m, i, j + 1);
        solve(grid, n, m, i - 1, j);
        solve(grid, n, m, i + 1, j);
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    solve(grid, n, m, i, j);
                }
            }
        }
        return count;
    }
}
