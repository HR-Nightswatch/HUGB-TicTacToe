package is.ru.TicTacToe;

public class TicTacToe {

    public boolean isStarted = false;

    private Grid gameGrid;

    public TicTacToe() {
        gameGrid = new Grid();
        isStarted = true;
    }

    public static void main( String[] args ) {
        System.out.println( "Welcome to TicTacToe" );
        TicTacToe game = new TicTacToe();

        System.exit( 0 ); //success
    }

}
