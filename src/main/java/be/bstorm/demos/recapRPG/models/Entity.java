package be.bstorm.demos.recapRPG.models;

public class Entity {

    private int hpMax;
    private int currentHp;
    private int strenght;

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getStrenght() {
        return this.strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public void attack(Entity e){

    }

    public void myMethod(){

        System.out.println("Methode entity");
    }
}
