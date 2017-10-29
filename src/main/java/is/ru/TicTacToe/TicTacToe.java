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

    public int askUserForValidPosition() {
        while(true) {
            int answer = Integer.parseInt(input.next());
            if(answer > 0 && answer < 10 && gameGrid.getGrid()[answer - 1].getPlayer() == null) {
                return answer;
            }
        }
    }

    /* Return false if game has ended */
    public boolean gameLoop() {
        // Print grid
        System.out.println(gameGrid.toString());
        Players player;

        if (numberOfMovesUsed % 2 == 0) {
            player = player1;
            printPlayer(player1);
        }
        else {
            player = player2;
            printPlayer(player2);
        }

        int position = askUserForValidPosition();

        if (numberOfMovesUsed % 2 == 0) {
            gameGrid.getGrid()[position - 1].setPlayer(player1);
        }
        else {
            gameGrid.getGrid()[position - 1].setPlayer(player2);
        }

        numberOfMovesUsed++;

        if(gameGrid.isWinner()) {
            System.out.println(player.getName() + " is the winner!");
            return false;
        } else if(numberOfMovesUsed == 9) {
            System.out.println("It's a draw!");
            return false;
        }

        return true;

    }



    public static void main( String[] args ) {
        TicTacToe game = new TicTacToe();
        Grid grids = new Grid();

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
