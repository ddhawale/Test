package my_world.interview_problem;


/**
 * Created by ddhawale on 8/3/15.
 */
public class IslandCount {
    static int columns = 5;
    static int rows = 5;
    static Integer input[][] = {
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 1, 1}
    };
    static boolean visitedNodes[][] = new boolean[rows][columns];

    public static void main(String args[]) {
        int islandCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (input[i][j] == 1 && !visitedNodes[i][j]) {
                    searchIsland(i, j);
                    islandCount++;
                }
            }
        }

        System.out.println(" Number of islands are - " + islandCount);
    }

    static void searchIsland(int row, int col)
    {
        visitedNodes[row][col] = true;
        int adjacentRows[] = {-1, 0, 1, 0};
        int adjacentCols[] = {0, -1, 0, 1};

        for (int i = 0; i < 4; i++) {
            if (canProceed(row + adjacentRows[i], col + adjacentCols[i]) ) {
                searchIsland(row + adjacentRows[i], col + adjacentCols[i]);
            }
        }
    }

    static boolean canProceed(int row, int col)
    {
        return (row >= 0) && (row < rows) && (col >= 0) && (col < columns) &&
                (input[row][col] == 1 && !visitedNodes[row][col]);
    }
}
