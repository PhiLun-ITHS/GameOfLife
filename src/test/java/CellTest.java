
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CellTest {

    @Test
    public void CellShouldDieWithoutNeighbor(){

        Main main = new Main();

        int width = 8, height = 8;
        int[][] grid = {
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 1, 0 },
                { 0, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
        };

       // main.currentGeneration(grid, width, height);
    }
//
//    @Test
//    public void CellShouldDieWithOneNeighbor(){
//
//        Cell cell = new Cell();
//        cell.setNeighbors(1);
//
//        assertEquals(false, cell.isCellAlive());
//    }
//
//    @Test
//    public void CellShouldDieWithMoreThanThreeNeighbors(){
//
//        Cell cell = new Cell();
//        cell.setNeighbors(4);
//
//        assertEquals(false, cell.isCellAlive());
//    }
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