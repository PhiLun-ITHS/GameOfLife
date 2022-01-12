
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
    }
}
