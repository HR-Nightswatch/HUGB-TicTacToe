package is.ru.TicTacToe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GridTest{

@Test
	public void testConstructorForGrid()
	{
		Grid testGrid = new Grid();
		
		Grid[] test = testGrid.getGrid();

		for(int i = 0; i < 9; i++){
			assertEquals(null, test[i].getPlayer());
		}
		
	}

}