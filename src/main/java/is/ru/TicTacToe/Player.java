package is.ru.TicTacToe;

public class Player {
	int PlayerNumber;
	String PlayerName;
	String PlayerSymbol;

	public Player(int number, String name) {
		PlayerNumber = number;
		PlayerName = name;

		if (number == 1) {
			PlayerSymbol = "O";
		} else {
			PlayerSymbol = "X";
		}
	}
}