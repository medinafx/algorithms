package ni.com.fmedina.BFSAndDFS;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxAreaOfIslandTest {
    private MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();

    @Test
    void maxAreaOfIsland() {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0}
                      , {0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0}
                      , {0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0}
                      , {0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int expected = 6, actual = maxAreaOfIsland.maxAreaOfIsland(grid);
        assertEquals(expected, actual, "Expected " + expected + " but got " + actual);
    }
}