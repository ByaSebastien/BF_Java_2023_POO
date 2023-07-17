package be.bstorm.demos.recapRPG.models;

public class Monster extends Entity{

    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void attack(Entity e) {

        int dmg = (int)(this.getStrenght() * this.size);
    }
}
