package modell;
public class Game
{
    public static final int CHEST_NUM = 3;
    
    private Chest[] chests = new Chest[CHEST_NUM];

    public Game()
    {
        chests[0] = new Chest(Materials.GOLD, "Én rejtem a kincset.");
        chests[1] = new Chest(Materials.SILVER, "Nem én rejtem a kincset.", true, true);
        chests[2] = new Chest(Materials.BRONZE, "Az arany hazudik.", false);
    }

    public Chest[] getChests() {
        return chests;
    }
    
}
