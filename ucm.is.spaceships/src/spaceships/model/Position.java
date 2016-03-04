package spaceships.model;


public class Position {

  private int row;

  private int col;

  public Position(int i, int j) {
	  this.row = i;
	  this.col = j;
  }

  public Integer getRow() {
  return row;
  }

  public Integer getCol() {
  return col;
  }

}