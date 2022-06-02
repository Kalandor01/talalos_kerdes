package modell;
public class Game
{
    public static final int CHEST_NUM = 3;
    
    private Chest[] chests = new Chest[CHEST_NUM];
    //lies_num?

    public Game(int chest_num /*???*/)
    {
        this.chests = chests;
        for(int x=0; x<CHEST_NUM; x++)
        {
            chests[x] = new Chest("riddle???");
        }
    }
    
    
}
