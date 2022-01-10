
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CellTest {

    @Test
    public void cellShouldDieWithZeroNeighbors(){

        Cell cell = new Cell();

        assertFalse(cell.isCellAlive());
    }








    @Test
    public void cellShouldDieWithOneNeighbor(){

    }

    @Test
    public void cellShouldDieWithMoreThanThreeNeighbors(){

    }
}
