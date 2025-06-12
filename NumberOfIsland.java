package jun12;
public class NumberOfIsland {
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int count = 0;
        int rows = grid.length, cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    dfs(grid, r, c);
                    count++;
                }
            }
        }

        return count;
    }

    private static void dfs(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != '1')
            return;

        grid[r][c] = 'e'; 
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', 'e', 'e', 'e'},
            {'1', '1', 'e', 'e', 'e'},
            {'e', 'e', '1', 'e', 'e'},
            {'e', 'e', 'e', '1', '1'}
        };
        System.out.println("Number of islands: " + numIslands(grid)); 
    }
}
