package is.ru.TicTacToe;

public class Players {

	private int numberOfPlayer;	
	private String nameOfPlayer;
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

	public int getNumber()
	{
		return numberOfPlayer;
	}
	
	public String getName()
	{
		return nameOfPlayer;
	}
	

	public String getSymbol()
	{
		return symbol;
	}
}