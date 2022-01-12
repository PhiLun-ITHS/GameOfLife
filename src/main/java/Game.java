
public class Game {

    public static void main(String[] args) {

        Game game = new Game();
        game.createBoard();
    }

    private void createBoard(){

        int width = 8, height = 8;

        Cell cell = new Cell();

        int[][] board = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                board[i][j] = cell.DEAD;
            }
        }

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (board[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }


//    void currentGeneration(int[][] grid, int width, int height) {
//        System.out.println("Current Generation");
//
//        printCurrentGeneration(grid, width, height);
//        System.out.println();
//
//        nextGeneration(grid, width, height);
//    }
//
//    private void printCurrentGeneration(int[][] grid, int width, int height) {
//        for (int i = 0; i < width; i++) {
//            for (int j = 0; j < height; j++) {
//                if (grid[i][j] == 0)
//                    System.out.print(".");
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    private void nextGeneration(int grid[][], int width, int height) {
//        int[][] nextGrid = new int[width][height];
//
//        calculateNextGeneration(grid, width, height, nextGrid);
//        printNextGeneration(width, height, nextGrid);
//    }
//
//    private void calculateNextGeneration(int[][] grid, int width, int height, int[][] nextGrid) {
//        for (int l = 1; l < width - 1; l++) {
//            for (int m = 1; m < height - 1; m++) {
//
//                int neighbor = 0;
//                for (int i = -1; i <= 1; i++)
//                    for (int j = -1; j <= 1; j++)
//                        neighbor += grid[l + i][m + j];
//
//                neighbor -= grid[l][m];
//
//                gameRules(grid, nextGrid, l, m, neighbor);
//            }
//        }
//    }
//
//    private void gameRules(int[][] grid, int[][] nextGrid, int l, int m, int neighbor) {
//        if ((grid[l][m] == 1) && (neighbor < 2))
//            nextGrid[l][m] = 0;
//        else if ((grid[l][m] == 1) && (neighbor > 3))
//            nextGrid[l][m] = 0;
//        else if ((grid[l][m] == 0) && (neighbor == 3))
//            nextGrid[l][m] = 1;
//        else
//            nextGrid[l][m] = grid[l][m];
//    }
//
//    private static void printNextGeneration(int width, int height, int[][] nextGrid) {
//        System.out.println("Next Generation");
//        for (int i = 0; i < width; i++) {
//            for (int j = 0; j < height; j++) {
//                if (nextGrid[i][j] == 0)
//                    System.out.print(".");
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
}
