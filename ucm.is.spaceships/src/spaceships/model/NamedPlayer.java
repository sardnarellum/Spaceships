package spaceships.model;

public class NamedPlayer extends Player, Player {

  public String name;

  public void HumanPlayer(String name) {
	  this.name = name;
  }

}