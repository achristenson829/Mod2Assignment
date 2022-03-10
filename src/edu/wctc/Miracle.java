package edu.wctc;

public class Miracle extends Room implements Lootable{
    public Miracle(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "The home of Miracle Max, former court wizard and now miracle worker...for a price.";
    }

    @Override
    public String lootItem() {
        return "One miracle pill";
    }

    @Override
    public int lootScore() {
        return 5;
    }

    @Override
    public String loot(Player player) {
        return "You received miracle pill from Miracle Max";
    }
}
