package is.ru.TicTacToe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GridTest{

	Grid testGrid = new Grid();

	@Test
public void testConstructorForGridNumber()
	{
		Grid[] test = testGrid.getGrid();

		for(int i = 0; i < 9; i++){
			assertEquals(i+1, test[i].getNumber());
		}
		
	}

	@Test
	public void testConstructorForGridPlayer()
	{	
		Grid[] test = testGrid.getGrid();

		for(int i = 0; i < 9; i++){
			assertEquals(null, test[i].getPlayer());
		}
	
	}

}