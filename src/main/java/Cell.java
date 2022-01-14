
public class Cell {

    public static final int LIVE = 1;
    public static final int DEAD = 0;

    protected void currentGeneration(int[][] currentGenerationBoard) {
        printCurrentGeneration(currentGenerationBoard);
        nextGeneration(currentGenerationBoard);
    }

    private void nextGeneration(int currentGenerationBoard[][]) {
        int[][] nextGenerationBoard = new int[Game.rows][Game.columns];

        calculateNextGeneration(currentGenerationBoard, nextGenerationBoard);
        printNextGeneration(nextGenerationBoard);
    }

    protected void printCurrentGeneration(int[][] currentGenerationBoard) {
        System.out.println("Current Generation");
        for (int i = 0; i < Game.rows; i++) {
            for (int j = 0; j < Game.columns; j++) {
                if (currentGenerationBoard[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    private void printNextGeneration(int[][] nextGenerationBoard) {
        System.out.println("Next Generation");
        for (int i = 0; i < Game.rows; i++) {
            for (int j = 0; j < Game.columns; j++) {
                if (nextGenerationBoard[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void calculateNextGeneration(int[][] currentGenerationBoard, int[][] nextGenerationBoard) {
        for (int l = 1; l < Game.rows - 1; l++) {
            for (int m = 1; m < Game.columns - 1; m++) {

                int cell = currentGenerationBoard[l][m];
                int neighbor = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        neighbor += currentGenerationBoard[l + i][m + j];
                neighbor -= currentGenerationBoard[l][m];

            if (cell == LIVE && neighbor < 2)
                nextGenerationBoard[l][m] = DEAD;
            else if (cell == LIVE && neighbor > 3)
                nextGenerationBoard[l][m] = DEAD;
            else if (cell == DEAD && neighbor == 3)
                nextGenerationBoard[l][m] = LIVE;
            else
                nextGenerationBoard[l][m] = currentGenerationBoard[l][m];
            }
        }
    }
}
//            if ((currentGenerationBoard[l][m] == 1) && (neighbor < 2))
//                nextGenerationBoard[l][m] = 0;
//            else if ((currentGenerationBoard[l][m] == 1) && (neighbor > 3))
//                nextGenerationBoard[l][m] = 0;
//            else if ((currentGenerationBoard[l][m] == 0) && (neighbor == 3))
//                nextGenerationBoard[l][m] = 1;
//            else
//                nextGenerationBoard[l][m] = currentGenerationBoard[l][m];
//        }