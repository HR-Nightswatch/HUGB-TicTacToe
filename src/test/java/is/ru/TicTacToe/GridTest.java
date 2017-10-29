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

	@Test
	public void testIsWinnerNr1() {
		Grid grid = new Grid();

		Players player = new Players(1, "Channing Tatum");

		grid.getGrid()[0].setPlayer(player);
		grid.getGrid()[3].setPlayer(player);
		grid.getGrid()[6].setPlayer(player);

		assertEquals(true, grid.isWinner());

	}

	@Test
	public void testIsWinnerNr2() {
		Grid grid = new Grid();

		Players player = new Players(1, "Channing Tatum");

		grid.getGrid()[1].setPlayer(player);
		grid.getGrid()[4].setPlayer(player);
		grid.getGrid()[7].setPlayer(player);

		assertEquals(true, grid.isWinner());

	}

	@Test
	public void testIsWinnerNr3() {
		Grid grid = new Grid();

		Players player = new Players(1, "Channing Tatum");

		grid.getGrid()[2].setPlayer(player);
		grid.getGrid()[5].setPlayer(player);
		grid.getGrid()[8].setPlayer(player);

		assertEquals(true, grid.isWinner());

	}

	@Test
	public void testIsWinnerNr4() {
		Grid grid = new Grid();

		Players player = new Players(1, "Channing Tatum");

		grid.getGrid()[0].setPlayer(player);
		grid.getGrid()[1].setPlayer(player);
		grid.getGrid()[2].setPlayer(player);

		assertEquals(true, grid.isWinner());

	}

	@Test
	public void testIsWinnerNr5() {
		Grid grid = new Grid();

		Players player = new Players(1, "Channing Tatum");

		grid.getGrid()[3].setPlayer(player);
		grid.getGrid()[4].setPlayer(player);
		grid.getGrid()[5].setPlayer(player);

		assertEquals(true, grid.isWinner());

	}

	@Test
	public void testIsWinnerNr6() {
		Grid grid = new Grid();

		Players player = new Players(1, "Channing Tatum");

		grid.getGrid()[6].setPlayer(player);
		grid.getGrid()[7].setPlayer(player);
		grid.getGrid()[8].setPlayer(player);

		assertEquals(true, grid.isWinner());

	}

	@Test
	public void testIsWinnerNr7() {
		Grid grid = new Grid();

		Players player = new Players(1, "Channing Tatum");

		grid.getGrid()[0].setPlayer(player);
		grid.getGrid()[4].setPlayer(player);
		grid.getGrid()[8].setPlayer(player);

		assertEquals(true, grid.isWinner());

	}

	@Test
	public void testIsWinnerNr8() {
		Grid grid = new Grid();

		Players player = new Players(1, "Channing Tatum");

		grid.getGrid()[2].setPlayer(player);
		grid.getGrid()[4].setPlayer(player);
		grid.getGrid()[6].setPlayer(player);

		assertEquals(true, grid.isWinner());

	}

	@Test
	public void testIsWinnerNoWinner() {
		Grid grid = new Grid();

		Players player1 = new Players(1, "Channing Tatum");
		Players player2 = new Players(2, "Brad Pitt");

		grid.getGrid()[0].setPlayer(player1);
		grid.getGrid()[1].setPlayer(player2);
		grid.getGrid()[2].setPlayer(player1);
		grid.getGrid()[3].setPlayer(player1);
		grid.getGrid()[4].setPlayer(player2);
		grid.getGrid()[5].setPlayer(player2);
		grid.getGrid()[6].setPlayer(player2);
		grid.getGrid()[7].setPlayer(player1);
		grid.getGrid()[8].setPlayer(player1);

		/*	1+ 2- 3+
			4+ 5- 6-
			7- 8+ 9+ */

		assertEquals(false, grid.isWinner());

	}

}