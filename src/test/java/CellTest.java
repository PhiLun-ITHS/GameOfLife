
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CellTest {

    private final int LIVE = 1;
    private final int DEAD = 0;

    @Test
    public void CellDiesWithoutNeighbors(){

        int cell = LIVE;
        int aliveNeighbors = 0;

        cell = new Cell().nextState(cell, aliveNeighbors);

        assertEquals(cell, DEAD);
    }

    @Test
    public void CellDiesWithOneNeighbor(){

        int cell = LIVE;
        int aliveNeighbors = 1;

        cell = new Cell().nextState(cell, aliveNeighbors);

        assertEquals(cell, DEAD);
    }

    @Test
    public void OverpopulatedCellDiesWithMoreThanThreeNeighbors(){

        int cell = LIVE;
        int aliveNeighbors = 7;

        cell = new Cell().nextState(cell, aliveNeighbors);

        assertEquals(cell, DEAD);
    }
//
//    @Test
//    public void CellShouldStayAliveWithTwoAliveNeighbors(){
//
//        Cell cell = new Cell();
//        cell.setNeighbors(2);
//
//        assertEquals(true, cell.isCellAlive());
//    }
//
//    @Test
//    public void CellShouldStayAliveWithThreeAliveNeighbors(){
//
//        Cell cell = new Cell();
//        cell.setNeighbors(3);
//
//        assertEquals(true, cell.isCellAlive());
//    }
//
//    @Test
//    public void DeadCellShouldBeAliveWithThreeAliveNeighbors(){
//
//        Cell cell = new Cell();
//        cell.setNeighbors(3);
//
//        assertEquals(true, cell.isCellAlive());
//    }


/*
    @Test
    public void CellShouldDieOnEdges(){
        Cell cell = new Cell();

        cell.setCellAlive(false);

        assertEquals(false, cell.isCellAlive());
    }
 */
}