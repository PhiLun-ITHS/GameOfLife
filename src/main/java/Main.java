
public class Main {

    public static void main(String[] args) {

        int M = 8, N = 8;

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

        currentGeneration(grid, M, N);
    }

    public static void currentGeneration(int[][] grid, int M, int N) {
        System.out.println("Current Generation");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        nextGeneration(grid, M, N);
    }

    static void nextGeneration(int grid[][], int M, int N) {

        int[][] nextGrid = new int[M][N];

        for (int l = 1; l < M - 1; l++) {
            for (int m = 1; m < N - 1; m++) {

                int neighbor = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        neighbor += grid[l + i][m + j];

                neighbor -= grid[l][m];

                if ((grid[l][m] == 1) && (neighbor < 2)) {
                    nextGrid[l][m] = 0;
                }
                else if ((grid[l][m] == 1) && (neighbor > 3)) {
                    nextGrid[l][m] = 0;
                }
                else if ((grid[l][m] == 0) && (neighbor == 3)) {
                    nextGrid[l][m] = 1;
                }
                else {
                    nextGrid[l][m] = grid[l][m];
                }
            }
        }

        System.out.println("Next Generation");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
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
