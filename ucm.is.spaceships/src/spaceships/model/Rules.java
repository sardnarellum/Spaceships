package spaceships.model;


public class Rules {
	private final int rows;
	private final int cols;
	private Board board;

	public Rules(int n, int m) {
		rows = n;
		cols = m;
	}

	public int getRows() {
		return rows;
	}
	
	public int getCols() {
		return cols;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
	
	public boolean check(){
		//TODO: implement step checking logic
		return true;
	}

}