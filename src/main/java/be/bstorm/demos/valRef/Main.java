package be.bstorm.demos.valRef;

import be.bstorm.demos.basicClass.Person;

public class Main {

    public static void main(String[] args) {

        Integer nb = 5;
        ajouterUn(nb);
        System.out.println(nb);
        System.out.println("___________________________");
        int[] tab = new int[]{2,4,6,8,10};
        ajouterUn(tab);
        for (int i : tab){
            System.out.println(i);
        }

        Person p = new Person("Brown","Alphonse");
        changeName(p);
        System.out.println(p.getNom());


    }

    public static void ajouterUn(Integer a) {

        a = a + 1;
    }

    public static void ajouterUn(int[] ints) {

        for (int i = 0; i < ints.length; i++){
            ints[i] += 1;
        }
    }

    public static void changeName(Person p){

        p.setNom("Coucou");
    }
}
