package be.bstorm.demos.recapRPG;

import be.bstorm.demos.recapRPG.models.Hero;
import be.bstorm.demos.recapRPG.models.Monster;

public class Main {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.setName("Dante");
        hero.setHpMax(100);
        hero.setCurrentHp(100);
        hero.setStrenght(10);
        Monster monster = new Monster();
        monster.setHpMax(50);
        monster.setCurrentHp(50);
        monster.setStrenght(10);
        monster.setSize(1.80);

        hero.myMethod();
        monster.myMethod();

        while (hero.getCurrentHp() > 0 && monster.getCurrentHp() > 0){

            hero.attack(monster);
            if(monster.getCurrentHp() > 0){
                monster.attack(hero);
            }
        }

        if(hero.getCurrentHp() > 0){

            hero.loot(monster);
        }


    }
}