package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public abstract class Room {

    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    public Room(String name){
        this.name = name;
        this.east = null;
        this.west = null;
        this.north = null;
        this.south = null;
        this.up = null;
        this.down = null;
    }

    public abstract String getDescription();

    public Room getAdjoiningRoom(char direction){
        Room newRoom = null;
        if (isValidDirection(direction)){
            if (direction == 'n')
            newRoom = this.north;
            else if (direction == 'e')
                newRoom = this.east;
            else if (direction == 's')
                newRoom = this.south;
            else if (direction == 'w')
                newRoom = this.west;
            else if (direction == 'u')
                newRoom = this.up;
            else if (direction == 'd')
                newRoom = this.down;
        }
        return newRoom;
    }

    public List<String> getExits() {
        List<String>exits= new ArrayList<>();
        if (this.north != null)
            exits.add("north");
        if (this.east != null)
            exits.add("east");
         if (this.south != null)
            exits.add("south");
         if (this.west != null)
            exits.add("west");
         if (this.up != null)
            exits.add("up");
         if (this.down != null)
            exits.add("down");
        return exits;
    }
    public String getName(){
        return this.name;
    }
    public boolean isValidDirection(char direction){
        boolean canExit = false;
        List<String> possibleExits = getExits();
          for (String exit : possibleExits)
              if (direction == exit.charAt(0)) {
                  canExit = true;
                  break;
              }
        return canExit;
    }

    public void setNorth(Room north) {this.north = north;}

    public void setSouth(Room south) {this.south = south;}

    public void setEast(Room east) {this.east = east;}

    public void setWest(Room west) {this.west = west;}

    public void setUp(Room up) {this.up = up;}

    public void setDown(Room down) {this.down = down;}

}
