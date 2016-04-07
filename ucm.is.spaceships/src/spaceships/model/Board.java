package spaceships.model;

public class Board {

  private Spaceship[][] board;

  public Board(int rows, int cols) {
	  board = new Spaceship[rows][cols];
  }

  public void addElement(Position pos, Spaceship ship) {
	  board[pos.getRow()][pos.getRow()] = ship;
  }

  public void moveElement(Movement m) {
	  //TODO: implement movement on board
  }

}