package edu.wctc;

public class Castle extends Room implements Interactable, Lootable, Exitable{

    public Castle(String name) {
        super(name);
    }

    @Override
    public int intScore() {
        return 20;
    }

    @Override
    public String interact(Player player) {
        return "You dueled the six-fingered man and have exacted revenge for the murder of Inigo's father.";
    }

    @Override
    public String getDescription() {
        return "An extravagant castle, set up for a wedding and guarded by 60 men.";
    }


    @Override
    public String lootItem() {
        return "A holocaust cloak";
    }

    @Override
    public int lootScore() {
        return 5;
    }

    @Override
    public String loot(Player player) {
        return "You've outsmarted the king's soldiers and gained a holocaust cloak.";
    }

    @Override
    public String exit(Player player) {
        return "You've finished the game! ";
    }
}
