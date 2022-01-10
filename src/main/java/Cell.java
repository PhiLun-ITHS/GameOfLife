
public class Cell {

    private boolean CellAlive;
    private int neighbors;

    public boolean isCellAlive() {

        if (neighbors < 2) {
            CellAlive = false;
        } else if (neighbors == 2) {
            CellAlive = true;
        } else if (neighbors == 3) {
            CellAlive = true;
        } else {
            CellAlive = false;
        }
        return CellAlive;
    }

    public void setCellAlive(boolean cellAlive) {
        CellAlive = cellAlive;
    }

    public void setNeighbors(int neighbors) {
        this.neighbors = neighbors;
    }
}
