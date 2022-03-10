package edu.wctc;

public class Farm extends Room implements Lootable{

    public static String item;
    public Farm(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "A simple farm in the Country of Florin.";
    }

    @Override
    public String lootItem() {
        return "A promise of true love";
    }

    @Override
    public int lootScore() {
        return 5;
    }

    @Override
    public String loot(Player player) {
        return "You receive a promise of true love";
    }
}
