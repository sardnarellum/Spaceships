package spaceships.model;

import java.util.ArrayList;

public class GameState {
	
	private int turn;

	private Rules rules;

	private Board board;
  
	private ArrayList<Player> players;
  
	public GameState(Rules rules, ArrayList<Player> players) {
		this.rules = rules;
		this.players = players;
		init();
	}
	
	public void init(){
		turn = 1;
		board = new Board(rules.getRows(), rules.getCols());
		rules.setBoard(board);
	}

	public void step(Movement movement, Player player) {
		++turn; // last instruction
	}
	
	public int getTurn(){
		return turn;
	}

}