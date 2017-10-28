package is.ru.TicTacToe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayersTest {

	@Test
	public void testGetName()
	{
		Players TestPlayer = new Players(1, "Nonni");
		assertEquals("Nonni", TestPlayer.getName());
	}

	@Test
	public void testGetNumber()
	{
		Players TestPlayer = new Players(1, "Nonni");		
		assertEquals(1, TestPlayer.getNumber()); 
	}
	
	@Test
	public void testGetSymbolForPlayerOne()
	{
		Players TestPlayer = new Players(1, "Nonni");
		assertEquals("O", TestPlayer.getSymbol());
	}
/*
    @Test
     	public void testGetSymbolForPlayerTwo()
        {
            Players TestPlayer = new Players(2, "Kalli");
            assertEquals("X", TestPlayer.getSymbol());
        }*/

}