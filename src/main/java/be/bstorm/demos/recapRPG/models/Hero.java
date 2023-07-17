package be.bstorm.demos.recapRPG.models;

import java.util.Random;

public class Hero extends Entity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void loot(Monster m){
        System.out.println(this.name + " loot le monstre");
    }

    @Override
    public void attack(Entity e) {
        Random rng = new Random();
        int dmg = this.getStrenght() + rng.nextInt(10);
        System.out.println("Que trépas si je faiblis");
        e.setCurrentHp(e.getCurrentHp() - dmg);
    }

    @Override
    public void myMethod() {
        System.out.println("Methode hero");
    }
}
