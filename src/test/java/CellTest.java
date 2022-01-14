
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class CellTest {
//
//    private final int LIVE = 1;
//    private final int DEAD = 0;
//
//    @Test
//    public void CellDiesWithoutNeighbors(){
//
//        int cell = LIVE;
//        int aliveNeighbors = 0;
//
//        cell = new Cell().nextState(cell, aliveNeighbors);
//
//        assertEquals(cell, DEAD);
//    }
//
//    @Test
//    public void CellDiesWithOneNeighbor(){
//
//        int cell = LIVE;
//        int aliveNeighbors = 1;
//
//        cell = new Cell().nextState(cell, aliveNeighbors);
//
//        assertEquals(cell, DEAD);
//    }
//
//    @Test
//    public void OverpopulatedCellDiesWithMoreThanThreeNeighbors(){
//
//        int cell = LIVE;
//        int aliveNeighbors = 7;
//
//        cell = new Cell().nextState(cell, aliveNeighbors);
//
//        assertEquals(cell, DEAD);
//    }
//
//    @Test
//    public void CellShouldStayAliveWithTwoNeighbors(){
//
//        int cell = LIVE;
//        int aliveNeighbors = 2;
//
//        cell = new Cell().nextState(cell, aliveNeighbors);
//
//        assertEquals(cell, LIVE);
//    }
//
//    @Test
//    public void CellShouldStayAliveWithThreeNeighbors(){
//
//        int cell = LIVE;
//        int aliveNeighbors = 3;
//
//        cell = new Cell().nextState(cell, aliveNeighbors);
//
//        assertEquals(cell, LIVE);
//    }
//
//    @Test
//    public void DeadCellShouldBeAliveWithThreeAliveNeighbors(){
//
//        int cell = DEAD;
//        int aliveNeighbors = 3;
//
//        cell = new Cell().nextState(cell, aliveNeighbors);
//
//        assertEquals(cell, LIVE);
//    }
//}