package spaceships.model;

import java.util.ArrayList;

public class Player {

  private Integer points;
  
  private ArrayList<Element> ships;
  
  public int getPoints(){
	  return points;
  }

  public void incrPoints() {
	  ++points;
  }

}