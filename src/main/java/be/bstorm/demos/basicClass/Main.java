package be.bstorm.demos.basicClass;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("Bya","Seb",LocalDate.of(1991,3,27));
        Person p2 = new Person("Doe","John");

//        p.setNom("Bya");
//        System.out.println(p.getNom());
//        p.setNom("Seb");

//        p2.setNom("Doe");
//        p2.setPrenom("John");
//        p2.setDdn(LocalDate.of(1980,5,25));

        p.afficher();
        p2.afficher();

        Position pos = new Position(5,3);
        pos.x();
        pos.y();
        pos.toString();

        System.out.println(pos.hashCode() == new Position(5,3).hashCode());

    }
}

































