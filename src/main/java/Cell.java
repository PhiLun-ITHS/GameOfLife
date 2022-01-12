
public class Cell {

    public static final int LIVE = 1;
    public static final int DEAD = 0;

    public int nextState(int cell, int aliveNeighbors) {

        if (cell == LIVE) {
            if (aliveNeighbors > 3) {
                cell = 0;
            } else if (aliveNeighbors < 2) {
                cell = 0;
            }
            else if (aliveNeighbors == 2 | aliveNeighbors == 3) {
                cell = 1;
            }
        } else if (cell == DEAD && aliveNeighbors == 3) {
            cell = 1;
        } else {
            cell = 0;
        }
        return cell;
    }
}