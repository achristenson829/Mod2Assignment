package edu.wctc;

public interface Lootable {

    String lootItem();
    int lootScore();

    String loot(Player player);

}
