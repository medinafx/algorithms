package ni.com.fmedina.BFSAndDFS;

/**
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected
 * 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 *
 * The area of an island is the number of cells with a value 1 on the island.
 *
 * Return the maximum area of an island in grid. If there is no island, return 0.
 *
 * Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0]
 *               ,[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0]
 *               ,[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * Output: 6
 * Explanation: The answer is not 11, because the island must be connected 4-directionally.
 */
public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                max = Math.max(max, dfs(grid, row, column));
            }
        }
        return max;
    }

    private int dfs (int[][] grid, int row, int column) {
        if (row < 0 || row >= grid.length
                || column < 0 || column >= grid[0].length
                || grid[row][column] == 0)
            return 0;

        grid[row][column] = 0;
        int sum = 1;
        sum += dfs(grid, row + 1, column);
        sum += dfs(grid, row, column + 1);
        sum += dfs(grid, row - 1, column);
        sum += dfs(grid, row, column - 1);

        return sum;
    }
}
