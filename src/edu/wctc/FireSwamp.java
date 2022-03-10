package edu.wctc;

public class FireSwamp extends Room implements Interactable{
    public FireSwamp(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "This dark, ominous swamp is full of thick trees and vines. There are deep popping noises in the ground and the sound of shuffling feet.";
    }

    @Override
    public int intScore() {
        return -25;
    }

    @Override
    public String interact(Player player) {

        return "You get maimed by a Rodent Of Unusual Size after falling into the Sinking sand and burning yourself on the Fire spurts...ouch!";
    }
}
