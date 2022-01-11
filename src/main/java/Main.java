
public class Main {

    public static void main(String[] args) {

        Cell cell = new Cell();

        int width = 8, height = 8;
        int[][] grid = {
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
        };
        cell.currentGeneration(grid, width, height);
    }
}
