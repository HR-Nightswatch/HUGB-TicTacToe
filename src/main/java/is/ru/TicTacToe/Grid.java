package is.ru.TicTacToe;

public class Grid {
	private Node[] nodes = new Node[9];
	private int number;

	public Grid(int num){
		number = num;

		for(int i  = 0; i < 9; i++){
			Node node = new Node(i+1);
			nodes[i] = node;
		}
	}

	public Node[] getNodes(){
		return nodes;
	}
}