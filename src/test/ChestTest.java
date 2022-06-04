package test;

import modell.Chest;
import modell.Materials;

public class ChestTest
{
    public ChestTest()
    {
        System.out.println("Tesztelés:");
        base_chest();
        advanced_chest();
        System.out.println("Tesztelés vége.");
    }
    
    private void base_chest()
    {
        System.out.print("Alap láda teszt...");
        Chest ch = new Chest("riddle");
        assert ch.getMaterial() == Materials.WOOD;
        assert ch.isLying() == true;
        assert ch.hasTreasure() == false;
        System.out.println("Sikeres!");
    }
    
    private void advanced_chest()
    {
        System.out.print("Bonyolult láda teszt...");
        Chest ch = new Chest(Materials.SILVER, "riddle 2", false, true);
        assert ch.getMaterial() == Materials.SILVER;
        assert ch.getMaterial_image_path().equals("imgs/silver.jpg");
        assert ch.isLying() == false;
        assert ch.hasTreasure() == true;
        assert ch.getRiddle().equals("riddle 2");
        System.out.println("Sikeres!");
    }
    
    public static void main(String[] args)
    {
        new ChestTest();
    }
}
