package spaceships.model;

public class Movement {

  private Position from;

  private Position to;
    
  public Movement(Position from, Position to) {
	  this.from = from;
	  this.to = to;
  }

  public Position getFrom() {
	  return this.from;
  }

  public Position getTo() {
	  return this.to;
  }

}