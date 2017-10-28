package is.ru.TicTacToe;

import org.junit.Test;
import org.junit.Assert;

public class TicTacToeTest {

    @Test
    public void checkIfTicTacToeGameThatHasBeenStartedTest() {
        TicTacToe ttt = new TicTacToe();
        Assert.assertEquals(ttt.isStarted, true);
    }

    /*@Test
	public void testAskPlayerToPlayAnother()
	{	
		String answer = input.next();

		Assert.assertEquals(TicTacToe.askPlayerToPlayAnother(), true);
	
	}*/

}
