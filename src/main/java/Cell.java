
public class Cell {

    public final int LIVE = 1;
    public final int DEAD = 0;


    public Cell nextState(Cell cell, int aliveNeighbors) {

        if (cell = LIVE & aliveNeighbors > 3 | cell = LIVE & aliveNeighbors < 2) {
            cell = DEAD;
        } else if (cell = DEAD & aliveNeighbors == 3) {
            cell = LIVE;
        }
        return cell;
    }
}