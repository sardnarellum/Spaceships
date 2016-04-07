package spaceships.model;

import java.util.ArrayList;

public class Player {
	
	private String id;

  private Integer points;

  private ArrayList<Spaceship> ships;

  public int getPoints() {
	  return points;
  }

  public void incrPoints() {
	  ++points;
  }

}