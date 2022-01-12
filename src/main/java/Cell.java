
public class Cell {

    private int neighbors;
    private int cell;

    public Cell nextGenerationCell() {

        if (neighbors < 2) {
            cell = 0;
        } else if (neighbors == 2) {
            cell = 1;
//        } else if (cell = 0 && neighbors == 3) {
//
//        } else {
            cell = 0;
        }
        return this;
    }

    public void setNeighbors(int neighbors) {
        this.neighbors = neighbors;
    }
}
