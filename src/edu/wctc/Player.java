package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int score = 0;
    List<String> inventory = new ArrayList<>();

    protected void addToInventory(String item){
        inventory.add(item);
    }

    protected void addToScore(int score){
        this.score += score;
    }

    public String getInventory(){
        String playerInventory = "";
        for (String i: inventory){
            playerInventory += (i + ", ");
        }
        return playerInventory;
    }
    public int getScore(){
        return score;
    }
}
