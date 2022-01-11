
public class Main {

    public static void main(String[] args) {

        int M = 8, N = 8;

        boolean[][] grid = {
                { false, false, false, false, false, false, false, false },
                { false, false, false, false, false, false, false, false },
                { false, false, false, false, false, false, false, false },
                { false, false, false, true, true, false, false, false },
                { false, false, true, true, false, false, false, false },
                { false, false, false, false, false, true, false, false },
                { false, false, false, false, true, false, false, false },
                { false, false, false, false, false, false, false, false }
        };

        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (grid[i][j] == false)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //nextGeneration(grid, M, N);
    }
}
