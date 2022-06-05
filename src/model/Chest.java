package model;

public class Chest
{
    private String name;
    private Materials material;
    private String material_image_path;
    private String riddle;
    private boolean lying, treasure;
    
    public Chest(String name, String riddle)
    {
        this(name, Materials.WOOD, riddle);
    }
    public Chest(String name, Materials material, String riddle)
    {
        this(name, material, riddle, true);
    }
    public Chest(String name, Materials material, String riddle, boolean lying)
    {
        this(name, material, riddle, lying, false);
    }
    public Chest(String name, Materials material, String riddle, boolean lying, boolean treasure)
    {
        this.name = name;
        this.material = material;
        setMaterial_image();
        this.riddle = riddle;
        this.lying = lying;
        this.treasure = treasure;
    }

    public String getName() {
        return name;
    }

    public Materials getMaterial() {
        return material;
    }
    
    public String getMaterial_image_path() {
        return material_image_path;
    }

    public String getRiddle() {
        return riddle;
    }

    public boolean isLying() {
        return lying;
    }

    public boolean hasTreasure() {
        return treasure;
    }

    private void setMaterial_image()
    {
        switch(this.material)
        {
            case GOLD:
                this.material_image_path = "imgs/gold.jpg";
                break;
            case SILVER:
                this.material_image_path = "imgs/silver.jpg";
                break;
            case BRONZE:
                this.material_image_path = "imgs/bronze.jpg";
                break;
            default:
                this.material_image_path = "imgs/wood.jpg";
                break;
        }
    }

    public void setTreasure(boolean treasure) {
        this.treasure = treasure;
    }

    @Override
    public String toString() {
        return "Chest{" + "material=" + material + ", material_image_path=" + material_image_path + ", riddle=" + riddle + ", lying=" + lying + ", treasure=" + treasure + '}';
    }

}
