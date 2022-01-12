
public class Cell {

    public static final int LIVE = 1;
    public static final int DEAD = 0;

    public int nextState(int cell, int aliveNeighbors) {

        if (cell == LIVE & aliveNeighbors > 3 | cell == LIVE & aliveNeighbors < 2) {
            cell = 0;
        } else if (cell == DEAD & aliveNeighbors == 3) {
            cell = 1;
        }
        return cell;
    }
}