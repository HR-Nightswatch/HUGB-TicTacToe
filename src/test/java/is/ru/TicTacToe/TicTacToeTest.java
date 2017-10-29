package is.ru.TicTacToe;

import org.junit.Test;
import org.junit.Assert;

public class TicTacToeTest {

    @Test
    public void checkIfTicTacToeGameThatHasBeenStartedTest() {
        TicTacToe ttt = new TicTacToe();
        ttt.resetGame();
        Assert.assertEquals(ttt.isStarted, true);
    }

}
