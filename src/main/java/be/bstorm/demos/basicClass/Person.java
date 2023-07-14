package be.bstorm.demos.basicClass;

import java.time.LocalDate;

public class Person {

    // Attribut
    private String nom;
    private String prenom;
    private LocalDate ddn;

    // Constructeur

    //    public Person(){}
    public Person(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Person(String nom, String prenom, LocalDate ddn) {
        this(nom, prenom);
        this.ddn = ddn;
    }

    // Propriétés
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        if (nom.trim().equals("")) {
            return;
        }
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDdn() {
        return ddn;
    }

    public void setDdn(LocalDate ddn) {
        if(ddn.isAfter(LocalDate.now())){
            return;
        }
        this.ddn = ddn;
    }

    // Methodes
    public void afficher() {

        String nom = "toto";
        System.out.println("Nom : " + getNom());
        System.out.println("Prenom : " + getPrenom());
        if (getDdn() != null) {
            System.out.println("Age : " + this.calculerAge() + " ans");
        }
    }

    public int calculerAge() {

        int age = LocalDate.now().getYear() - getDdn().getYear();
        if (age < 0) {
            System.out.println("Erreur");
            return 0;
        } else {

            return age;
        }
    }
}
