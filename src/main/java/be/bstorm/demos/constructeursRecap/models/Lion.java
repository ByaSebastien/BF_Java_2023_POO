package be.bstorm.demos.constructeursRecap.models;

public class Lion extends Carnivore{

    //region Attributs
    private String couleurCriniere;

    //endregion

    //region Constructeurs

    public Lion(String name, int weight, int size, String paramCouleurCriniere){
        super(name,weight,size);
        this.couleurCriniere = paramCouleurCriniere;
    }

    //endregion

    //region Propriétés

    public String getCouleurCriniere() {
        return couleurCriniere;
    }

    public void setCouleurCriniere(String couleurCriniere) {
        this.couleurCriniere = couleurCriniere;
    }


    //endregion

    //region Méthodes

    @Override
    public void crier() {
        System.out.println("RRRRRRRrrrrrrrrrrrrrr");
    }

    @Override
    public String toString() {
        return "Lion : " +
                super.toString() +
                "\ncouleurCriniere='" + couleurCriniere ;
    }

    //endregion
}
