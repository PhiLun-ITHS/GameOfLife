
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellTest {

    int[][] currentGenerationBoard = new int[Game.rows][Game.columns];
    int[][] nextGenerationBoard = new int[Game.rows][Game.columns];

    @Test
    public void LiveCellShouldDieWithoutLivingNeighbors(){


        for (int i = 0; i < Game.rows; i++) {
            for (int j = 0; j < Game.columns; j++) {
                currentGenerationBoard[i][j] = Cell.DEAD;
            }
        }
        currentGenerationBoard[1][4] = Cell.LIVE;
        Cell.calculateNextGeneration(currentGenerationBoard, nextGenerationBoard);

        assertEquals(Cell.DEAD, nextGenerationBoard[1][4]);
    }

    @Test
    public void LiveCellShouldDieWithOneLivingNeighbor(){

        for (int i = 0; i < Game.rows; i++) {
            for (int j = 0; j < Game.columns; j++) {
                currentGenerationBoard[i][j] = Cell.DEAD;
            }
        }
        currentGenerationBoard[1][4] = Cell.LIVE;
        currentGenerationBoard[1][5] = Cell.LIVE;
        Cell.calculateNextGeneration(currentGenerationBoard, nextGenerationBoard);

        assertEquals(Cell.DEAD, nextGenerationBoard[1][4]);
    }

    @Test
    public void LiveCellShouldDieWithMoreThanThreeLivingNeighbors(){

        for (int i = 0; i < Game.rows; i++) {
            for (int j = 0; j < Game.columns; j++) {
                currentGenerationBoard[i][j] = Cell.DEAD;
            }
        }
        currentGenerationBoard[1][2] = Cell.LIVE;
        currentGenerationBoard[1][3] = Cell.LIVE;
        currentGenerationBoard[2][2] = Cell.LIVE;
        currentGenerationBoard[2][3] = Cell.LIVE;
        currentGenerationBoard[2][4] = Cell.LIVE;
        Cell.calculateNextGeneration(currentGenerationBoard, nextGenerationBoard);

        assertEquals(Cell.DEAD, nextGenerationBoard[1][3]);
    }

    @Test
    public void LiveCellShouldStayAliveWithTwoLivingNeighbors(){

        for (int i = 0; i < Game.rows; i++) {
            for (int j = 0; j < Game.columns; j++) {
                currentGenerationBoard[i][j] = Cell.DEAD;
            }
        }
        currentGenerationBoard[1][3] = Cell.LIVE;
        currentGenerationBoard[2][2] = Cell.LIVE;
        currentGenerationBoard[2][3] = Cell.LIVE;
        Cell.calculateNextGeneration(currentGenerationBoard, nextGenerationBoard);

        assertEquals(Cell.LIVE, nextGenerationBoard[1][3]);
    }

    @Test
    public void LiveCellShouldStayAliveWithThreeLivingNeighbors(){

        for (int i = 0; i < Game.rows; i++) {
            for (int j = 0; j < Game.columns; j++) {
                currentGenerationBoard[i][j] = Cell.DEAD;
            }
        }
        currentGenerationBoard[1][3] = Cell.LIVE;
        currentGenerationBoard[1][2] = Cell.LIVE;
        currentGenerationBoard[2][2] = Cell.LIVE;
        currentGenerationBoard[2][3] = Cell.LIVE;
        Cell.calculateNextGeneration(currentGenerationBoard, nextGenerationBoard);

        assertEquals(Cell.LIVE, nextGenerationBoard[1][3]);
    }

    @Test
    public void DeadCellShouldComeToLifeWithThreeLivingNeighbors(){

        for (int i = 0; i < Game.rows; i++) {
            for (int j = 0; j < Game.columns; j++) {
                currentGenerationBoard[i][j] = Cell.DEAD;
            }
        }
        currentGenerationBoard[1][2] = Cell.LIVE;
        currentGenerationBoard[1][3] = Cell.LIVE;
        currentGenerationBoard[1][4] = Cell.LIVE;
        Cell.calculateNextGeneration(currentGenerationBoard, nextGenerationBoard);

        assertEquals(Cell.LIVE, nextGenerationBoard[2][3]);
    }
}