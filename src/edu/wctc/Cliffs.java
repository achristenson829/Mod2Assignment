package edu.wctc;

public class Cliffs extends Room implements Interactable{
    public Cliffs(String name) {
        super(name);
    }

    @Override
    public int intScore() {
        return -10;
    }

    @Override
    public String interact(Player player) {
        return "You engaged in a battle of wits and ingest iocaine powder.";
    }

    @Override
    public String getDescription() {
        return "A sheer rock face climbing hundreds of feet in the air that marks the border of Gilder.";
    }
}
