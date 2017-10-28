package is.ru.TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    public boolean isStarted = false;

    private Grid gameGrid;
    private Scanner input;

    private Players player1;
    private Players player2;
    private int numberOfMovesUsed = 0;

    public TicTacToe() {
        gameGrid = new Grid();
        isStarted = true;
        input = new Scanner(System.in);
    }

    public void welcome() {
        System.out.println("Welcome to TicTacToe");
    }

    public void newPlayer(int playerNumber) {
        System.out.print("Player " + playerNumber + ": ");
        String playerName = input.next();

        if (playerNumber == 1) {
            player1 = new Players(playerNumber, playerName);
        }
        else {
            player2 = new Players(playerNumber, playerName);
        }
    }

    public boolean askPlayerToPlayAnother() {
        System.out.println("Do you want to play another game? (yes/no)");
        String answer = input.next();
        if (answer.equals("y") || answer.equals("yes")) {
            return true;
        }

        return false;
    }

    public void printPlayer(Players player1) {
        System.out.println(player1.getName() + "(Player " + player1.getNumber() + ") place your: " + player1.getSymbol());
    }

    /* Return false if game has ended */
    public boolean gameLoop() {
        // Print grid
        System.out.println(gameGrid.toString());

        if (numberOfMovesUsed % 2 == 0) {
            printPlayer(player1);
        }
        else {
            printPlayer(player2);
        }

        String position = input.next();
        numberOfMovesUsed++;

        return true;
    }

    public static void main( String[] args ) {
        TicTacToe game = new TicTacToe();

        boolean isPlaying = true;

        while(isPlaying) {
            game.welcome();

            System.out.println("Enter desired player names");
            game.newPlayer(1);
            game.newPlayer(2);

            boolean gameOngoing = true;
            while(gameOngoing) {
                gameOngoing = game.gameLoop();
            }

            isPlaying = game.askPlayerToPlayAnother();
        }
        System.out.println("Thank you for playing! :)");

        System.exit( 0 ); //success
    }

}
