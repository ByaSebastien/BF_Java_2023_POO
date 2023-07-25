package be.bstorm.exercices.diceStatic;

import java.security.SecureRandom;
import java.util.*;

public class Dice {

    public static int lancerDe(int nbFace,int nbLance,int nbAGarder){

        ArrayList<Integer> results = new ArrayList<>();
        Random rn = new SecureRandom();


        for(int i = 0; i < nbLance; i++){

            results.add(rn.nextInt(nbFace) + 1);
        }

        return results.stream()
                .sorted(Comparator.reverseOrder())
                .limit(nbAGarder)
                .mapToInt(i -> i)
                .sum();
    }
}