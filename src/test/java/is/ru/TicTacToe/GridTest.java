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
	public void testIfEmpty()
	{
		Grid test = new Grid(1);
		assertEquals(true, test.isEmpty());
	}

	@Test
	public void testIfNotEmpty()
	{
		Grid test = new Grid(1);
		Players testPlayer = new Players(1, "Helga");
                test.setPlayer(testPlayer);
                assertEquals(false, test.isEmpty());
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

	@Test
	public void testToStringWithPlayer() {
		Grid grid = new Grid();

		Players player = new Players(1, "John Snow");

		grid.getGrid()[1].setPlayer(player);

		String correct = " 1 | O | 3 |\n" +
				" 4 | 5 | 6 |\n" +
				" 7 | 8 | 9 |\n";
		assertEquals(correct, grid.toString());

	}

}