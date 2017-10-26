package is.ru.TicTacToe;

public class Grid {
	private Grid[] grids = new Grid[9];
	private Players player;
	private int number;

	public Grid(int num){
		number = num;
		player = null;

	}
	public Grid(){

		for(int i  = 0; i < 9; i++){
			Grid grid = new Grid(i+1);
			grids[i] = grid;
		}
	}

	public Grid[] getGrid(){
		return grids;
	}

	public int getNumber(){
		return number;
	}

	public Players getPlayer()
	{
		if(!isEmpty()){
			return player;
		}else{
			return null;
		}
	}

	public void setPlayer(Players pl)
	{
		player = pl;
	}


	public boolean isEmpty()
	{
		return player == null;
	}
}