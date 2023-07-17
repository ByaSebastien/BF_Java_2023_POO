package be.bstorm.demos.heritage;

public class Avion extends Vehicule{

    private int nbMoteurs;

    public int getNbMoteurs() {
        return nbMoteurs;
    }

    public void setNbMoteurs(int nbMoteurs) {
        this.nbMoteurs = nbMoteurs;
    }

    @Override
    public void seDeplacer() {

        System.out.println("Je vole dans mon super avion!");
    }

    @Override
    public String toString() {
        return super.toString() + "Avion{" +
                "nbMoteurs=" + nbMoteurs +
                '}';
    }
}
