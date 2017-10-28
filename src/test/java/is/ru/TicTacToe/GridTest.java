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

	@Test
	public void testGridNumber()
	{
		Grid testNum = new Grid(2);
		assertEquals(2, testNum.getNumber());
	}

	@Test	
	public void testGridPlayerIfNotEmpty()
	{
		Grid test = new Grid(1);
		Players testPlayer = new Players(1, "Helga");
		test.setPlayer(testPlayer);
		assertEquals(testPlayer, test.getPlayer());	
	}

	@Test	
	public void testGridPlayerIfEmpty()
	{
		Grid test = new Grid(1);
		assertEquals(null, test.getPlayer());	
	}
	

}