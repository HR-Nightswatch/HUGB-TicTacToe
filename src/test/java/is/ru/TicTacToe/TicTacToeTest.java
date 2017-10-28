package is.ru.TicTacToe;

import org.junit.Test;
import org.junit.Assert;

public class TicTacToeTest {

    @Test
    public void checkIfTicTacToeGameThatHasNotBeenStartedTest() {
        TicTacToe ttt = new TicTacToe();
        Assert.assertEquals(ttt.isStarted, false);
    }

    @Test
    public void checkIfTicTacToeGameThatHasBeenStartedTest() {
        TicTacToe ttt = new TicTacToe();
        ttt.CreateNewGame();
        Assert.assertEquals(ttt.isStarted, true);
    }

}
