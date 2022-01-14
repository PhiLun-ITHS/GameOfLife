public class Game {

    public static int rows = 4, columns = 8;

    public static void main(String[] args) {
        Game game = new Game();
        game.createBoard();
    }

    private void createBoard(){
        Cell cell = new Cell();

        int[][] board = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = cell.DEAD;
            }
        }
        //add 3 living cells
        board[1][4] = cell.LIVE;
        board[2][3] = cell.LIVE;
        board[2][4] = cell.LIVE;

        cell.currentGeneration(board);
    }
}
