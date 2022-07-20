package ni.com.fmedina.BFSAndDFS;

/**
 * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
 *
 * You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting
 * from the pixel image[sr][sc].
 *
 * To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting
 * pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels
 * (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.
 *
 * Return the modified image after performing the flood fill.
 */
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }

    private void dfs(int[][] image, int row, int column, int color, int newColor) {
        if (row < 0 || row >= image.length
                || column < 0 || column >= image[0].length
                || color != image[row][column])
            return;

        image[row][column] = newColor;
        dfs(image, row + 1, column, color, newColor);
        dfs(image, row - 1, column, color, newColor);
        dfs(image, row, column + 1, color, newColor);
        dfs(image, row, column - 1, color, newColor);
    }
}
