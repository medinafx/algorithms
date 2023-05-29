package ni.com.fmedina.BFSAndDFS;

public class Prisioner {

    public boolean canEscape(String[] prison) {
        return dfs(prison, findPrisionerInitialPosition(prison), new boolean[prison.length][prison[0].length()]);
    }

    private boolean dfs(String[] prison, Point position, boolean[][] visited) {
        int rows = prison.length;
        int cols = prison[0].length();

        if (position.x < 0 || position.x >= rows
                || position.y < 0 || position.y >= cols
                || visited[position.x][position.y])
            return false;

        if (isAWall(prison, position) || isGuardVisible(prison, position)) {
            return false;
        }

        if (thePrisonerReachedTheExit(prison, position)) {
            return true;
        }

        visited[position.x][position.y] = true;

        boolean canEscape = dfs(prison, new Point(position.x - 1, position.y), visited);
        if (!canEscape) {
            canEscape = dfs(prison, new Point(position.x + 1, position.y), visited);
        }
        if (!canEscape) {
            canEscape = dfs(prison, new Point(position.x, position.y + 1), visited);
        }
        if (!canEscape) {
            canEscape = dfs(prison, new Point(position.x, position.y - 1), visited);
        }

        return canEscape;
    }

    private boolean thePrisonerReachedTheExit(String[] prison, Point position) {
        return prison[position.x].charAt(position.y) == 'S';
    }

    private boolean isAWall(String[] prison, Point position) {
        return prison[position.x].charAt(position.y) != ' '
                && prison[position.x].charAt(position.y) != 'P'
                && prison[position.x].charAt(position.y) != 'S';
    }

    private boolean isGuardVisible(String[] prison, Point position) {
        int rows = prison.length;
        if (position.x + 1 < rows && prison[position.x + 1].charAt(position.y) == '^') {
            return true;
        }

        if (position.x - 1 > 0 && prison[position.x - 1].charAt(position.y) == 'v') {
            return true;
        }

        int cols = prison[0].length();
        if (position.y + 1 < cols && prison[position.x].charAt(position.y + 1) == '<') {
            return true;
        }

        if (position.y - 1 > 0 && prison[position.x].charAt(position.y - 1) == '>') {
            return true;
        }

        return false;
    }

    private Point findPrisionerInitialPosition(String[] prison) {
        int startRow = -1;
        int startColum = -1;

        for (int row = 0; row < prison.length; row++) {
            for (int column = 0; column < prison[row].length(); column++) {
                if (prison[row].charAt(column) == 'P') {
                    startRow = row;
                    startColum = column;
                    break;
                }
            }
        }

        return new Point(startRow, startColum);
    }

    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
