package is.ru.TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    public boolean isStarted = false;

    private Grid gameGrid;
    private Scanner input;

    public TicTacToe() {
        gameGrid = new Grid();
        isStarted = true;
        input = new Scanner(System.in);
    }

    public void welcome() {
        System.out.println("Welcome to TicTacToe");
    }

    public Players newPlayer(int playerNumber) {
        System.out.print("Player " + playerNumber + ": ");
        String playerName = input.next();

        return new Players(playerNumber, playerName);
    }

    public boolean askPlayerToPlayAnother() {
        System.out.println("Do you want to play another game? (yes/no)");
        String answer = input.next();
        if (answer.equals("y") || answer.equals("yes")) {
            return true;
        }

        return false;
    }

    public static void main( String[] args ) {
        TicTacToe game = new TicTacToe();

        boolean isPlaying = true;

        while(isPlaying) {
            game.welcome();

            System.out.println("Enter desired player names");
            Players player1 = game.newPlayer(1);
            Players player2 = game.newPlayer(2);

            isPlaying = game.askPlayerToPlayAnother();
        }
        System.out.println("Thank you for playing! :)");

        System.exit( 0 ); //success
    }

}
