package edu.wctc;

import java.util.List;

public class Maze {
    public Room currentRoom;
    public Player player;
    public boolean isFinished = false;

    public Maze() {
        this.player = new Player();
        Farm farm = new Farm("The Farm");
        Cliffs cliffs = new Cliffs("The Cliffs of Insanity");
        FireSwamp swamp = new FireSwamp("The Fire Swamp");
        Miracle miracle = new Miracle("Miracle Max's Hovel");
        Castle castle = new Castle("Humperdinck's Castle");

        currentRoom = farm;
        farm.setNorth(cliffs);
        farm.setEast(swamp);
        farm.setUp(castle);

        cliffs.setSouth(farm);
        cliffs.setWest(castle);
        cliffs.setEast(miracle);
        cliffs.setNorth(swamp);

        swamp.setDown(miracle);
        swamp.setWest(farm);
        swamp.setSouth(cliffs);

        castle.setDown(farm);
        castle.setUp(miracle);
        castle.setEast(cliffs);

        miracle.setUp(swamp);
        miracle.setWest(cliffs);
        miracle.setDown(castle);
    }
    public String exitCurrentRoom(){
        String exitRoom = "";
        if (currentRoom instanceof Exitable){
            exitRoom = ((Exitable) currentRoom).exit(player);
            if (getPlayerScore()>0){
                exitRoom += "You rescued your true love and ride into the sunset!";
            }
            else if (getPlayerScore()<=0){
                exitRoom += "You failed to rescue your true love and hang your head in shame!";
            }
            isFinished = true;
        }else exitRoom = "This room has no exit.";
        return exitRoom;
    }
    public String interactWithCurrentRoom() {
        String interactWithCurrentRoom = "";
        int roomScore = 0;
        if (currentRoom instanceof Interactable) {
            interactWithCurrentRoom = ((Interactable) currentRoom).interact(player);
            roomScore = ((Interactable) currentRoom).intScore();
            player.addToScore(roomScore);
        }else interactWithCurrentRoom = "There is nothing to interact with!";
        return interactWithCurrentRoom;
    }
    public String lootCurrentRoom() {
        String lootCurrentRoom = "";
        String itemToLoot = "";
        int lootScore = 0;
        if (currentRoom instanceof Lootable) {
            lootCurrentRoom = ((Lootable) currentRoom).loot(player);
            itemToLoot = ((Lootable) currentRoom).lootItem();
            lootScore = ((Lootable) currentRoom).lootScore();
            player.addToInventory(itemToLoot);
            player.addToScore(lootScore);
        }else {
            lootCurrentRoom = "There is nothing to loot!";
        }
        return lootCurrentRoom;
    }
    public int getPlayerScore(){
        return player.getScore();
    }

    public String getPlayerInventory(){ return player.getInventory();}

    public String getCurrentRoomDescription(){
        return currentRoom.getDescription();
    }
    public String getCurrentExits(){
        List<String> currentExits = currentRoom.getExits();
        return currentExits.toString();
    }
    public boolean move(char direction){
        boolean move = false;
        if(currentRoom.isValidDirection(direction)){
            currentRoom = currentRoom.getAdjoiningRoom(direction);
            move = true;}
        return move;
    }

    public boolean isFinished() {
        return isFinished;
    }
}

