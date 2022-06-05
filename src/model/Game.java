package model;
public class Game
{
    private int attempts = 0;
    private Chest[] chests = new Chest[0];

    public Game()
    {
        add_chest(new Chest("Arany láda", Materials.GOLD, "Én rejtem a kincset."));
        add_chest(new Chest("Ezüst láda", Materials.SILVER, "Nem én rejtem a kincset.", true, true));
        add_chest(new Chest("Bronz láda", Materials.BRONZE, "Az arany hazudik.", false));
//        add_chest(new Chest("láda", "lol"));
    }
    
    public Chest getChest(int x) {
        return chests[x];
    }

    public Chest[] getChests() {
        return chests;
    }

    public int getAttempts() {
        return attempts;
    }
    
    public void add_chest(Chest chest)
    {
        Chest[] new_chests = new Chest[this.chests.length + 1];
        for (int x = 0; x < this.chests.length; x++)
        {
            new_chests[x] = this.chests[x];
        }
        new_chests[this.chests.length] = chest;
        this.chests = new_chests;
    }
    
    public boolean guess(int chest_num)
    {
        this.attempts++;
        if(chest_num >= 0 && chest_num < this.chests.length && this.chests[chest_num].hasTreasure())
            return true;
        else
            return false;
    }
    
}
