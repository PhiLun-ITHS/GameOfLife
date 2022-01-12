
public class Cell {

    private int aliveNeighbors;

    public int getAliveNeighbors() {
        return aliveNeighbors;
    }

    public void setAliveNeighbors(int aliveNeighbors) {
        this.aliveNeighbors = aliveNeighbors;
    }

    public int nextState(int cell, int aliveNeighbors) {

        if (cell == 1) {
            if (aliveNeighbors > 3) {
                cell = 0;
            } else if (aliveNeighbors < 2) {
                cell = 0;
            }
            else if (aliveNeighbors == 2 | aliveNeighbors == 3) {
                cell = 1;
            }
        } else if (cell == 0 && aliveNeighbors == 3) {
            cell = 1;
        } else {
            cell = 0;
        }
        return cell;
    }
}