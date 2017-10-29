package is.ru.TicTacToe;

public class Players {

	private String nameOfPlayer;
	private int numberOfPlayer;	
	private String symbol;

	public Players(int number, String name)
	{
		numberOfPlayer = number;
		nameOfPlayer = name;
		
		if(number == 1){
			symbol = "O";
		}else{
			symbol = "X";
		}
	}

	public String getName()
	{
		return nameOfPlayer;
	}
	
	public int getNumber()
	{
		return numberOfPlayer;
	}
	

	public String getSymbol()
	{
		return symbol;
	}
}