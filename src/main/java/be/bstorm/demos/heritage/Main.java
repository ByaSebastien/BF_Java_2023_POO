package be.bstorm.demos.heritage;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vehicule v1 = new Vehicule();

        Voiture voiture = new Voiture();
        voiture.setMarque("Dodge");
        voiture.setModele("RAM");

        Bateau bateau = new Bateau();
        bateau.setMarque("Pegasus");
        bateau.setModele("Le seul et l'unique");

        Avion avion = new Avion();
        avion.setMarque("Diamond-DA40");
        avion.setModele("Diamond-DA40");

        Vehicule v2 = new Avion();

        ArrayList<Vehicule> vehicules = new ArrayList<>();
        vehicules.add(voiture);
        vehicules.add(bateau);
        vehicules.add(avion);

        System.out.println("___________________________________________________");

        for(Vehicule v : vehicules){

            System.out.println(v.toString());
            v.seDeplacer();
        }
    }
}
