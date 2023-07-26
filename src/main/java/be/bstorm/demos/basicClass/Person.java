package be.bstorm.demos.basicClass;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

/**
 * Mutable class that represent a person
 * FA: Person{nom, prenom}
 *
 * @attribute String nom
 *
 * @invariant nom != null && size(nom) > 0
 */
public class Person implements Comparator<Person> {

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

    /**
     *
     * @param String nom
     * @throws java.security.InvalidParameterException nom == null || size(nom) <= 0
     * @modify this.updatedAt = now()
     */
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

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNom().compareTo(o2.getNom());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nom, person.nom) && Objects.equals(prenom, person.prenom) && Objects.equals(ddn, person.ddn);
//        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, ddn);
    }
}
