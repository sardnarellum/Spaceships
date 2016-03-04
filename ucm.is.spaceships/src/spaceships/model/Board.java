package spaceships.model;


public class Board {

  private Element[][] board;
  
  public Board(int rows, int cols){
	  board = new Element[rows][cols];
  }
  
  public void addElement(Position pos, Element ship){
	  board[pos.getRow()][pos.getRow()] = ship;
  }
  
  public void moveElement(Movement m){
	  //TODO: implement movement on board
  }

}