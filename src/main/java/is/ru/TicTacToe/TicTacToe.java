package is.ru.TicTacToe;

public class TicTacToe {

    public boolean isStarted = false;

    private Grid gameGrid;

    public void CreateNewGame() {
        gameGrid = new Grid();
        isStarted = true;
    }

    public static void main( String[] args ) {
        System.out.println( "Welcome to TicTacToe" );
        TicTacToe game = new TicTacToe();
        game.CreateNewGame();

        System.exit( 0 ); //success
    }

}
