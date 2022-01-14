
//public class Game {
//
//    public static void main(String[] args) {
//
//        Game game = new Game();
//        Cell cell = new Cell();
//
//        int width = 8, height = 8;
//        int[][] board = new int[width][height];
//
//        game.fillBoard(board, width, height, cell);
//
//        System.out.println("Current Generation");
//        game.printBoard(board, width, height);
//
//        int[][] nextBoard = new int[width][height];
//        game.nextGeneration(width, height, board, nextBoard, cell);
//
//        System.out.println("Next Generation");
//        game.printBoard(nextBoard, width, height);
//    }
//
//    private void fillBoard(int[][] board, int width, int height, Cell cell){
//
//        for (int i = 0; i < width; i++) {
//            for (int j = 0; j < height; j++) {
//                board[i][j] = cell.DEAD;
//            }
//        }
//        //adding living cells
//        board[3][3] = cell.LIVE;
//        board[4][3] = cell.LIVE;
//        board[4][4] = cell.LIVE;
//    }
//
//    private void printBoard(int[][] board, int width, int height) {
//        for (int i = 0; i < width; i++) {
//            for (int j = 0; j < height; j++) {
//                if (board[i][j] == 0)
//                    System.out.print(".");
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    private void nextGeneration(int width, int height, int[][] board, int[][] nextBoard, Cell cell) {
//
//        int neighbor = 0;
//
//        for (int l = 1; l < width - 1; l++) {
//            for (int m = 1; m < height - 1; m++) {
//
//                for (int i = -1; i <= 1; i++)
//                    for (int j = -1; j <= 1; j++)
//                        neighbor += board[l + i][m + j];
//
//                neighbor -= board[l][m];
//
//                if ((board[l][m] == cell.LIVE) && (neighbor < 2)) {
//                    cell.nextState(cell, neighbor);
//                    nextBoard[l][m] = cell.DEAD;
//                }
//                else if ((board[l][m] == cell.LIVE) && (neighbor > 3)) {
//                    cell.nextState(cell, neighbor);
//                    nextBoard[l][m] = cell.DEAD;
//                }
//                else if ((board[l][m] == cell.DEAD) && (neighbor == 3)) {
//                    cell.nextState(cell, neighbor);
//                    nextBoard[l][m] = cell.LIVE;
//                }
//                else {
//                    cell.nextState(cell, neighbor);
//                    nextBoard[l][m] = board[l][m];
//                }
//            }
//        }
//    }
//}