package ni.com.fmedina.BFSAndDFS;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FloodFillTest {

    private FloodFill floodFill = new FloodFill();

    @Test
    void floodFill() {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] expected = {{2,2,2},{2,2,0},{2,0,1}};

        int row = 1, column = 1, newColor = 2;
        floodFill.floodFill(image, row, column, newColor);

        assertThat(image, is(expected));
    }

}