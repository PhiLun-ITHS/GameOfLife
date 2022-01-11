
public class Main {

    public static void main(String[] args) {

        int width = 8, height = 8;
        int[][] grid = {
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
        };

        currentGeneration(grid, width, height);
    }

    public static void currentGeneration(int[][] grid, int width, int height) {
        System.out.println("Current Generation");

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (grid[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        nextGeneration(grid, width, height);
    }

    static void nextGeneration(int grid[][], int width, int height) {

        int[][] nextGrid = new int[width][height];

        for (int l = 1; l < width - 1; l++) {
            for (int m = 1; m < height - 1; m++) {

                int neighbor = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        neighbor += grid[l + i][m + j];

                neighbor -= grid[l][m];

                if ((grid[l][m] == 1) && (neighbor < 2))
                    nextGrid[l][m] = 0;
                else if ((grid[l][m] == 1) && (neighbor > 3))
                    nextGrid[l][m] = 0;
                else if ((grid[l][m] == 0) && (neighbor == 3))
                    nextGrid[l][m] = 1;
                else
                    nextGrid[l][m] = grid[l][m];
            }
        }

        printNextGeneration(width, height, nextGrid);
    }

    private static void printNextGeneration(int width, int height, int[][] nextGrid) {
        System.out.println("Next Generation");
        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < height; j++)
            {
                if (nextGrid[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
