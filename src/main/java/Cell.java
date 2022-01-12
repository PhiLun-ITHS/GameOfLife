
public class Cell {

    private final int LIVE = 1;
    private final int DEAD = 0;

    public int nextState(int cell, int aliveNeighbors) {

        if (cell == LIVE & aliveNeighbors > 3 | cell == LIVE & aliveNeighbors < 2) {
            cell = DEAD;
        } else if (cell == DEAD & aliveNeighbors == 3) {
            cell = LIVE;
        }
        return cell;
    }
}